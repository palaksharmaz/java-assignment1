class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class q56 {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide both name and age.");
            return;
        }
        String name = args[0];
        try {
            int age = Integer.parseInt(args[1]);
            checkAge(age);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input. Please enter a valid number.");
        }
    }
}
