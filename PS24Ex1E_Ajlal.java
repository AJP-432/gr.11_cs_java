
import java.util.Scanner; //importing scanner

public class PS24Ex1E_Ajlal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //initating scanner
        int number; //initiating nunber vairable
        
        System.out.println("This is a cubing calculator for intengers between 1-10 inclusive. Please enter your number: "); //asking for input
        number = input.nextInt(); //saving number input    
        System.out.printf("The cube of %d is %d. Thanks and have a nice day!", number, (number*number*number)); //outputting anwser and computing the cube (number^3)
        
    }
    
}
