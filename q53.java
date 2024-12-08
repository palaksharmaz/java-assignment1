class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class q53 {

    public static void checkTemperature(double tempCelsius) throws TooHot, TooCold {
        if (tempCelsius > 35) {
            throw new TooHot("Temperature is too hot!");
        } else if (tempCelsius < 5) {
            throw new TooCold("Temperature is too cold!");
        } else {
            double tempFahrenheit = (tempCelsius * 9 / 5) + 32;
            System.out.println("Temperature is normal.");
            System.out.println("Temperature in Fahrenheit: " + tempFahrenheit);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a temperature as a command-line argument.");
            return;
        }

        try {
            double tempCelsius = Double.parseDouble(args[0]);
            checkTemperature(tempCelsius);
        } catch (TooHot e) {
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature input.");
        }
    }
}
