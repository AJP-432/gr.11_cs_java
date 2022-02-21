//By Ajlal Paracha in Mr. Martins Gr. 11 CS Nightschool Class on Feb 20, 2021
//This is a Rock Paper Scissors Game. I hope you enjoy!

package rps_game_ajlalparacha;

import java.util.Scanner; //importing scanner and math packages
import java.lang.Math;

public class Rps_game_ajlalParacha {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //initializing scanner
        
        int int_computer_move; //declaring all variables
        int computer_wins = 0;
        int user_wins = 0;
        String computer_move;
        String user_move;
        String like_to_play;
        String name;
        int rounds; 
        
        
        //Outlining program and asking if user wants to play
        System.out.println("Hello this is a Rock Paper Scissors Game best to 7 and win by 2.");
        System.out.println("What is your name?"); //asking for name
        name = input.nextLine();                  //saving name
        System.out.printf("Hello there %s", name); //saying hi
        
        while(true) {
            System.out.println("\nWould you like to play? (yes/no)"); //asking if they want to play

            while(true) {                        //Looping until given valid response

                like_to_play = input.nextLine(); //taking input on whether user wants to play

                if(like_to_play.equals("yes")) { //if user wants to play, break loop and continue
                    break;
                }
                else if(like_to_play.equals("no")) { //if user does not want to play, exit program
                    System.out.println("Have a nice day!");
                    System.exit(0);
                }
                else {
                    System.out.println("Invalid response. Please try again"); //if invalid input, print "try again" and loop
                }        
            }
            
            for(rounds = 0; rounds <= 7; rounds++) {
                int_computer_move = (int)((Math.random()*3)+1); //generating random number for computer move

                if (int_computer_move == 1) {       //converting random computer number to a move where
                    computer_move = "Rock";         //1 = Rock, 2 = Paper, and 3 = Scissors
                }
                else if (int_computer_move == 2) {
                    computer_move = "Paper";
                }
                else {
                    computer_move = "Scissors";
                }

                System.out.println("What is your move?"); //asking for user move
                System.out.println("\nRock\nPaper\nScissors\n(Rock/Paper/Scissors)\n");

                while (true) { //looping until valid input

                    user_move = input.nextLine(); //saving input

                    if ((user_move.equals("Rock")) || ((user_move.equals("Paper")) || (user_move.equals("Scissors")))) {
                        break; //exit loop if valid input
                    }

                    else {
                        System.out.println("Invalid input. Please try again."); //if invalid they have to enter choice again
                    }
                }
                
                //printing everyones choices
                System.out.printf("You chose %s and the computer chose %s\n", user_move, computer_move);
                
                //computing who wins the round
                if (user_move.equals(computer_move)) { 
                    System.out.println("It's a tie!"); 
                }
                else if ((user_move.equals("Rock")) && (computer_move.equals("Paper"))) {
                    System.out.println("Paper surrounds rock. Computer + 1");
                    computer_wins++;
                }
                else if ((user_move.equals("Rock")) && (computer_move.equals("Scissors"))) {
                    System.out.printf("Rock smashes Scissors. %s + 1\n", name);
                    user_wins++;
                }
                else if ((user_move.equals("Paper")) && (computer_move.equals("Rock"))) {
                    System.out.printf("Paper surrounds rock. %s + 1\n", name);
                    user_wins++;
                }
                else if ((user_move.equals("Paper")) && (computer_move.equals("Scissors"))) {
                    System.out.println("Scissors shreds paper. Computer + 1");
                    computer_wins++;
                }
                else if ((user_move.equals("Scissors")) && (computer_move.equals("Rock"))) {
                    System.out.println("Rock smashes scissors. Computer + 1");
                    computer_wins++;
                }
                else if ((user_move.equals("Scissors")) && (computer_move.equals("Paper"))) {
                    System.out.printf("Scissors shreds paper. %s + 1\n", name);
                    user_wins++;
                }
                
                //if someone has met winning conditions game is over
                if ((rounds >= 3) && ((Math.abs(user_wins - computer_wins)) == 2)) { 
                    break;
                }
                //print current score
                System.out.printf("Current Score: %s has %d wins and Computer has %d wins\n", name, user_wins, computer_wins);   
            }
            
            System.out.printf("Ok %s. You won %d times and I won %d times\n", name, user_wins, computer_wins);
            
            if ((Math.abs(user_wins - computer_wins)) == 1) { //if no one won by 2 its a draw print this
                System.out.println("As no one won by 2, its a draw.");
                System.out.println("-----\nDRAW\n-----\n\nAgain?");
            }
            
            else if (user_wins > computer_wins) { //if user won print this
                System.out.println("So you won. Good job.");
                System.out.println("-----\nYOU WIN\n-----\n\nAgain?");
            }
            
            else { //if computer won print this
                System.out.println("I WON! HAHAHAHAH. Good game though. GG.");
                System.out.println("-----\nI WIN\n-----\n\nAgain?");
            }
            
            
        }
        
        
        
    }
    
}
