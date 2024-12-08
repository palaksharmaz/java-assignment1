class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class q55 {
    public static void validateCredentials(String username, String password) throws InvalidCredentialsException {
        if (username.length() < 6) {
            throw new InvalidCredentialsException("Username must be at least 6 characters long.");
        }
        
        String correctPassword = "password123"; 
        
        if (!password.equals(correctPassword)) {
            throw new InvalidCredentialsException("Password does not match.");
        }

        System.out.println("Login successful.");
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide both username and password.");
            return;
        }
        String username = args[0];
        String password = args[1];
        try {
            validateCredentials(username, password);
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}