
// By Ajlal Paracha in Mr. Martins Gr11 Night School CS Class Feb 13, 2021

package loop_assignment_feb13_2021;

import java.util.Scanner;

public class Loop_assignment_feb13_2021 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //initating scanner

        int choice; //initiating variables
        double number; 
        double power;
        double exponent;
                
        do {
            // Below is title
            System.out.println("Hi, this is a calculator. Press:\n1 to square a number\n2 to cube a number\n3 to computer any power\n4 to exit");
            System.out.println("What is your choice?"); //prompting user for choice
            choice = input.nextInt(); //accepting user input to determine what they want to do
            
            if (choice == 1) {                 //if statements to eecute whatever as determined by the user choice
            
                System.out.println("What number would you like to sqaure? ");  //prompting user for value
                number = input.nextDouble();                                    // Saving value to sqaure
                System.out.println(number * number);                           //computing and outputting anwser
            }
            
            else if (choice == 2) {
            
                System.out.println("What number would you like to cube? ");        //prompting for user input
                number = input.nextDouble();                                        //saving value to cube
                System.out.println(number * number * number);                       // computing and printing anwser
                
            }
            
            else if (choice == 3) {
                
                System.out.println("What is the base of the power? ");              //prompting for input
                number = input.nextDouble();                                        //saving base value
                System.out.println("What is the exponent of the power? ");          //promppting for input
                exponent  = input.nextDouble();                                     //saving exponent value
                System.out.println(Math.pow(number, exponent));                     //computing and printing anwser
                
            }
            
            else if (choice == 4 ) {                                            //nothing if 4 is selected
                System.out.println("Goodbye dear user. :( ");
            }
            
            else {
            
                System.out.println("Not a valid anwser, please try again.");    //if user initially chooses a value that is not 1, 2, 3, 4
                                                                                //print the invalidity of their choice
            }
        
        } while (choice != 4);                                                  //break if choice is 4, continue if not
        
        
    }
    
}
