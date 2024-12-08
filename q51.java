class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class q51 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a country name as a command-line argument.");
            return;
        }

        String country = args[0];
        String[] countries = {"USA", "India", "France", "Germany", "Japan"};
        String[] capitals = {"Washington D.C.", "New Delhi", "Paris", "Berlin", "Tokyo"};

        try {
            String capital = null;
            for (int i = 0; i < countries.length; i++) {
                if (countries[i].equalsIgnoreCase(country)) {
                    capital = capitals[i];
                    break;
                }
            }

            if (capital == null) {
                throw new NoMatchFoundException("No capital found for the country: " + country);
            }
            System.out.println("The capital of " + country + " is: " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
