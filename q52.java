class ArithmeticOperationException extends Exception {
    public ArithmeticOperationException(String message) {
        super(message);
    }
}

public class q52 {

    static int divide(int numerator, int denominator) throws ArithmeticOperationException {
        if (denominator == 0) {
            throw new ArithmeticOperationException("Error: Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
    static int modulus(int numerator, int denominator) throws ArithmeticOperationException {
        if (denominator == 0) {
            throw new ArithmeticOperationException("Error: Modulus by zero is not allowed.");
        }
        return numerator % denominator;
    }

    public static void main(String[] args) {
        try {
            int result1 = divide(10, 0);
            System.out.println("Division Result: " + result1);
        } catch (ArithmeticOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            int result2 = modulus(10, 0);
            System.out.println("Modulus Result: " + result2);
        } catch (ArithmeticOperationException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            int result3 = divide(10, 2);
            System.out.println("Division Result: " + result3);
        } catch (ArithmeticOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            int result4 = modulus(10, 3);
            System.out.println("Modulus Result: " + result4);
        } catch (ArithmeticOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}