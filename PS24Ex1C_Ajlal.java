
import java.util.Scanner; //importing scanner

public class PS24Ex1C_Ajlal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //initating scanner
        double cost; //initiating cost vairable
        
        System.out.println("This is an object's tax calculator. Please enter the cost: "); //asking for input
        cost = input.nextDouble(); //saving cost input
        
        double tax = cost * 0.13; //computing cost * tax for just amount of money tax will bring extra and saving to tax variable
        
        System.out.printf("The object costs $%.2f, recieves $%.2f tax, which added brings your total to $%.2f Thanks and have a nice day!", cost, tax, (cost + tax)); //outputting anwser
        
    }
    
}
