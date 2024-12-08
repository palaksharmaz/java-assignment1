class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class q54 {
    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Candidate is too old for recruitment.");
        } else if (age < 20) {
            throw new TooYounger("Candidate is too young for recruitment.");
        } else {
            System.out.println("Eligible");
            System.out.println("Candidate Name: " + name);
        }
    }
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide both name and age.");
            return;
        }

        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            checkEligibility(name, age);
        } catch (TooOlder e) {
            System.out.println(e.getMessage());
        } catch (TooYounger e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input.");
        }
    }
}
