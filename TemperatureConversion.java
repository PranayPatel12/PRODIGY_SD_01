import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Enter the Units (Celsius/Fahrenheit/Kelvin): ");
        String units = sc.next().toLowerCase();  // Convert input to lowercase for consistency

        switch (units) {
            case "celsius":
                double fahrenheit = (temp * 9 / 5) + 32;
                double kelvin = temp + 273.15;
                System.out.println("Celsius to Fahrenheit: " + fahrenheit);
                System.out.println("Celsius to Kelvin: " + kelvin);
                break;

            case "fahrenheit":
                double celsiusFromF = (temp - 32) * 5 / 9;
                double kelvinFromF = celsiusFromF + 273.15;
                System.out.println("Fahrenheit to Celsius: " + celsiusFromF);
                System.out.println("Fahrenheit to Kelvin: " + kelvinFromF);
                break;

            case "kelvin":
                double celsiusFromK = temp - 273.15;
                double fahrenheitFromK = (celsiusFromK * 9 / 5) + 32;
                System.out.println("Kelvin to Celsius: " + celsiusFromK);
                System.out.println("Kelvin to Fahrenheit: " + fahrenheitFromK);
                break;

            default:
                System.out.println("Invalid unit! Please enter Celsius, Fahrenheit, or Kelvin.");
        }

        sc.close(); // Close the scanner to prevent resource leak
    }
}
