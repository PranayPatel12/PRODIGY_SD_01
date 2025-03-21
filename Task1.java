import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature : ");
        double temp = sc.nextDouble();
        System.out.print("Enter the Units : ");
        String units = sc.next();
        if(units.equalsIgnoreCase("celsius")){
            double fahrenheit = (temp*9/5)+32;
            double kelvin = temp+273.15;
            System.out.println("Celsius to Fahrenheit : "+fahrenheit);
            System.out.println("Celsius to Kelvin : "+kelvin);
        }
        else if(units.equalsIgnoreCase("fahrenheit")){
            double celsius = (temp-32)*5/9;
            double kelvin = (temp-32)*5/9+273.15;
            System.out.println("Fahrenheit to Celsius : "+celsius);
            System.out.println("Fahrenheit to Kelvin : "+kelvin);
        }
        else if(units.equalsIgnoreCase("Kelvin")){
            double celsius = temp-273.15;
            double fahrenheit = (temp-273.15) * 9/5 + 32;
            System.out.println("Kelvin to Celsius : "+celsius);
            System.out.println("Kelvin to Fahrenheit : "+fahrenheit);
        }
        else{
            System.out.println("Enter valid units");
        }
    }
}
