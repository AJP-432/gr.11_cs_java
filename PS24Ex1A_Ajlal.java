
import java.util.Scanner; //importing scanner

public class PS24Ex1A_Ajlal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //initating scanner
        double radius; //initiating radius vairable
        
        System.out.println("This is a circle circumfrence calculator. Please enter the radius: "); //asking for input
        radius = input.nextDouble(); //saving radius input
        
        double circumfrence = 2 * 3.1415926535 * radius; //computing 2 * pi * radius (circumfrence formula) and saving to circumfrence variable
        
        System.out.printf("The circumfrence is, rounded to 3 decimals, %.3f units. Thanks and have a nice day!", circumfrence); //outputting anwser
        
    }
    
}
