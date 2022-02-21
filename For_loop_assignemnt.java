// By Ajlal Paracha in Mr. Martins Gr.11 CS NightSchool Class Feb 19, 2021
// Program prints a set of numbers via for loops based on the users choice of a selection menu

package for_loop_assignemnt;

import java.util.Scanner; //importing scanner

public class For_loop_assignemnt {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //initializing scanner
        String choice;
        
        System.out.println("Hello, what would you like to count?"); //introduing program to user. 
                                                                    //chose not to include in loop as it 
                                                                    //becomes annoying

        
        do {
            
            System.out.println("Enter the number corresponding to your choice: "); //introducing choices
            System.out.println("\n1. 0-10 by 1.\n2. 100-0 by 10.\n3. 50-500 by 50.\n4. 6000-1000 by 1000.\n5. Exit.");
            System.out.println("\nInput parameters are expected to by 1-5 ONLY."); //to reinforce what they should input
            
            choice = input.nextLine(); //initializing and saving variable to store user 
                                       //selection menu chioce. Chose Strings to avoid needing conversion 
                                       //error handling. 
            
            if (choice.equals("1")) {
                System.out.println("Here you go: "); //helps with spacing
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                }
            }
            
            else if (choice.equals("2")) {
                System.out.println("Here you go: "); //helps with spacing
                for (int i = 100; i >= 0; i -= 10) {
                    System.out.println(i);
                }
            }
            
            else if (choice.equals("3")) {
                System.out.println("Here you go: "); //helps with spacing
                for (int i = 50; i <= 500; i += 50) {
                    System.out.println(i);
                }
            }
            
            else if (choice.equals("4")) {
                System.out.println("Here you go: "); //helps with spacing       
                for (int i = 6000; i >= 1000; i -= 1000) {
                    System.out.println(i);
                }
            }
            
            else if (choice.equals("5")) {
                System.out.println("Well see you later!");
            }
            
            else {
                System.out.println("Wow, invalid response. I, on multiple accounts, asked you to enter the INTEGERS FROM 1-5. HOW HARD CAN IT BE. TRY AGAIN.");
            }
           
        } while (!(choice.equals("5")));

    }
    
}
