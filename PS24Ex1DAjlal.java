
import java.util.Scanner; //importing scanner

public class PS24Ex1DAjlal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //initating scanner
        double fahrenheit_temperature; //initiating fahrenheit vairable
        
        System.out.println("This is a Fahrenheit to Celsius calculator. Please enter the temperature in Fahrenheit: "); //asking for input
        fahrenheit_temperature = input.nextDouble(); //saving fahrenheit input
        
        double celsius_temperature = (5.0/9.0) * (fahrenheit_temperature - 32); //(5/9) * (F - 32) -- (F to C formula) and saving to celsius varaible
        
        System.out.printf("Rounded to 3 variables, %.3f Fahrenheit is %.3f Celsius Thanks and have a nice day!", fahrenheit_temperature, celsius_temperature); //outputting anwser
        
    }
    
}
