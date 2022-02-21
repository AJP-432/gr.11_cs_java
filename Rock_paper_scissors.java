
// By Ajlal Paracha in Mr. Martins Gr.11 CS Nightschool class Feb 20, 2021
// This is a rock aper scissors game. Enjoy!

package rock_paper_scissors;

import java.util.Scanner; //importing scanner and math packages
import java.lang.Math;

public class Rock_paper_scissors {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //initalizing scanner
        String name;
        String choice; //initializing variables
        String user_move;
        String computer_move;
        int computer_int;
        int user_wins = 0;
        int computer_wins = 0;
        int rounds;
        
        System.out.println("This is a Rock Paper Scissors Game."); //introducing game
        System.out.println("What is your full name?"); //prompting name input
        name = input.nextLine(); //saving name
        System.out.printf("Hello %s.\n\nTo outline, this ia a best of 7 matchup however one must win by 2." //outlining game rules
                    + "\nOne can win in as few as 4 games if they are up 2. Though, if there is no winner by 7 games,"
                    + "\nit will be a draw. Have Fun!\n", name);
        
        do {
            System.out.println("\nWould you like to play?"); //prompting choice to play
            System.out.println("\n(yes/no)"); //telling user acceptable responses (yes or no)

            do {                           //looping until a valid input is given

                choice = input.nextLine(); //saving user choice to choice variable

                if (choice.equals("yes")) { //if yes, then program will exit loop and continue
                    break; 
                }
                else if (choice.equals("no")) { //if no, then program exits
                    System.out.println("Ok. Have a nice day!"); //printin farewell messae
                    System.exit(0); //will exit program in case user does not want to play
                }
                else { //if invalid input then loop through input again
                    System.out.println("Invalid Response. Try again."); //output if invalid input
                }

            } while (true);
            
            System.out.println("1. Rock.\n2. Paper.\n3. Scissors."); //showing what number corresponds with rps move

            for (rounds = 1; rounds <= 7; rounds++) {  //loopingly play game until a player wins or a draw is met
                
                computer_int = ((int)(Math.random()*3)); //1 = rock, 2 = paper, 3 = scissors. Same for user
                
                do { //looping until valid input
                    System.out.println("\nWhat is your choice?");  //prompting user to input their choice
                    user_move = input.nextLine(); //saving user choice of rock paper scissors move
                                                  //chose string to remove any conversion errors
                    if (!((choice == "1") || (choice == "2") || (choice == "3"))) { //if invalid input 
                        System.out.println("Invalid Response. Try again."); //telling user invalid input
                    }
                    
                    else {
                        break;
                    }

                } while (true);
                
                if (computer_int == 1) {   //converting random number to rock paper scissors move
                    computer_move = "Rock"; 
                }
                else if (computer_int == 2) {
                    computer_move = "Paper"; 
                }
                else if(computer_int == 3) {
                    computer_move = "Scissors"; 
            }
                
                if (user_move == "1") {  //converting user number to rock paper scissors move
                    user_move = "Rock"; 
                }
                else if (user_move == "2") { 
                    user_move = "Paper"; 
                }
                else if (user_move == "3") {
                    user_move = "Scissors"; 
                }

                if (user_move.equals(computer_move)) {    //computing and printing outcome
                    System.out.printf("You both chose %s. Outcome: Tie.", user_move);
                }
                
                else if ((user_move == "Rock") && (computer_move == "Paper")) {
                    System.out.println("Computer Move: Paper, Your Move: Rock");
                    System.out.println("Paper covers rock. Outcome: You lose!");
                    System.out.printf("Score: %d wins you. %d wins computer.", user_wins, (computer_wins++)); //printing score
                }
                else if ((user_move == "Rock") && (computer_move == "Scissors")) {
                    System.out.println("Computer Move: Scissors, Your Move: Rock");
                    System.out.println("Rock smashes scissors. Outcome: You win!");
                    System.out.printf("Score: %d wins you. %d wins computer.", (user_wins++), computer_wins); //printing score
                }
                else if ((user_move == "Paper") && (computer_move == "Scissors")) {
                    System.out.println("Computer Move: Scissors, Your Move: Paper");
                    System.out.println("Scissors shreds paper. Outcome: You lose!");
                    System.out.printf("Score: %d wins you. %d wins computer.", user_wins, (computer_wins++)); //printing score
                }
                else if ((user_move == "Paper") && (computer_move == "Rock")) {
                    System.out.println("Computer Move: Rock, Your Move: Paper");
                    System.out.println("Paper covers rock. Outcome: You win!");
                    System.out.printf("Score: %d wins you. %d wins computer.", (user_wins++), computer_wins); //printing score
                }
                else if ((user_move == "Scissors") && (computer_move == "Rock")) {
                    System.out.println("Computer Move: Rock, Your Move: Scissors");
                    System.out.println("Rock smashes scissors. Outcome: You lose!");
                    System.out.printf("Score: %d wins you. %d wins computer.", user_wins, (computer_wins++)); //printing score
                }
                else if ((user_move == "Scissors") && (computer_move == "Paper")) {
                    System.out.println("Computer Move: Paper, Your Move: Scissors");
                    System.out.println("Scissors shreds Paper. Outcome: You win!");
                    System.out.printf("Score: %d wins you. %d wins computer.", (user_wins++), computer_wins); //printing score
                }

                if ((Math.abs(user_wins - computer_wins) ==  2) && (rounds >= 4)) {
                    break;
                }
            }
            
            System.out.printf("Outcome: You won %d times and the computer won %d times.", user_wins, computer_wins); //outputting final score
            
            if ((Math.abs(user_wins - computer_wins)) == 1) {
                System.out.println("-----\nITS A DRAW\n-----");
            }
            else if (user_wins > computer_wins) {
                System.out.println("-----\nYOU WIN\n-----");
            }
            else if (computer_wins > user_wins) {
                System.out.println("-----\nYOU LOSE\n-----");
            }
            
            System.out.println("Wanna go another round?");
            
        } while(true);
        
        
    }
    
}
