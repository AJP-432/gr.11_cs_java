//By Ajlal Paracha on March 20th, 2021 in Mr. Martins Gr. 11 CS Night School Class
//This is a text-based role playing game inspired by Harry Potter. I hope you enjoy!


package ajlal_cpt;

//importing packages
import java.util.Scanner;
import java.util.Random; 
// start the class
public class Ajlal_cpt {
    // define the pause method
    private static void pause() throws Exception {
        //pauses are needed to greaten readability. Thus, making a function to do them as needed is powerful
        for(int i=0;i < 3; i++){
        System.out.print(".");
        Thread.sleep(1);
        }    
}
    //define the pause2 method
    private static void pause2() throws Exception {
        //another type of pause used for spacing between continuous dialogue
        Thread.sleep(3);
    }
    // The main method
    public static void main(String[] args) throws Exception { 
        
        //iniating scanner and variables
        Scanner input = new Scanner(System.in);
        String name;
        int lives = 5; 
        int number;
        int guess;
        String choice;
        //item index 0, 1, and 2 are wand, broom, and hat respectively
        boolean inventory[]=new boolean[3];
        for(int i=0;i<3;i++){
            inventory[i] = false;
        }
        
        boolean win = false;
        
        //printing title and main idea
        System.out.println("--------------");
        System.out.println("AZKABAN ESCAPE");
        System.out.println("--------------");
        //prompting name input
        System.out.println("Enter name: ");
        //saving name input to name variable
        name = input.nextLine();
        //game starts and there are pauses for dramaticity with Thread.sleep()
        pause();
        System.out.println("\nYou wake from a cold floor, eyes adjusting to the dim lights.");
        pause();
        System.out.println("\nYou faintly here a discussion from behind.");
        pause();
        System.out.print("\nThe new");
        pause();
        System.out.print("found working");
        pause();
        System.out.print("dark lord");
        pause();
        //meeting bellatrix
        System.out.println("\n\nYou get up and see Bellatrix floating upsidedown.");
        System.out.printf("\nHee hee, you've finally woken up %s. How long has it been, cellie?", name);
        System.out.println("\nHave you come to visit me in Azkaban after all these years?");
        pause2();
        //giving user the choice to pick the conversation they want by picking their response
        //informing user of the choices and how to select them
        System.out.println("\n[Press the number acossiated with your choice:]");
        System.out.println("\t[1] Of course bella! The Lord, as well as I, miss you.");
        System.out.println("\t[2] Heavens no you hag. I'm just here to get you out!");
        //saving choice to choice variable
        choice = input.nextLine();
        //outputting bella's response
        switch(choice) {
            case("1"):
                //if you are nice then Bella is on your side
                System.out.println("Oh my. The Lord asks for me? I love it! We must leave at once!");
                break;
            case("2"):
                //if you are mean you pay the consequences by death. Simply printing out dramatic narration
                System.out.println("Bella becomes visibly infuriated.");
                pause();
                System.out.println("\nShe lunges at you screaming \"YOU LOWLIFE MONKEY!!!\"");
                System.out.println("She bites your neck, ripping your flesh. You begin to bleed.");
                pause();
                System.out.println("\nConciouness fades away as Bella continues to beat you. A warmth surrounds you.");
                pause();
                System.out.println("\nAn alarm blares in the background as distant footsteps become increasingly louder.");
                pause();
                System.out.println("YOU DIED...Maybe be nicer next time?");
                //as user is are dead the program exits
                System.exit(0);
                break;
            default:
                //if any other response, i.e. invalid, the user stummers (secret path in a way)
                System.out.printf("Why are muttering gibberish %s? Have you been so knocked up "
                        + "you can't speak?", name);
                System.out.println("\nNo matter the case. We both know the time for my leave is here");
                break;
        }
            pause2();
            //You get Bella on your team. Doesn't really do anything but just to add more of a traditional
            //RPG game vibe. 
            System.out.println("\nBella has joined your party!");
            pause2();
            System.out.println("Well we have to wait 'till night. Then we leave!");
            //actual game starts here. 
            pause2();
            System.out.println("It is now night.");
            pause2();
            System.out.printf("\nOk %s, let's go through the vents.", name);
            pause();
            //prompting input for the 4 rooms
            System.out.println("\nYou are now in the vents.");
            pause2();
            System.out.printf("%s We must collect the wand, broom, and hat from our adjacent cell mates.", name);
            pause2();
            System.out.println("\nThough, they probably are not ready to share. Be weary, you can take");
            System.out.print("umm");
            Thread.sleep(1000);
            System.out.print("m");
            Thread.sleep(1000);
            System.out.print("m");
            Thread.sleep(1000);
            System.out.println("\nI'd say about 5 hits [5 hearts]");
            pause2();
            System.out.println("\n\nThen, we can fight the warden whose office is just forward.");
            pause2();
            //if they are out of health or have defeated the warden (win bool) they exit the loop
            while(lives > 0 && win == false) {
                System.out.println("Where will we go? [Current health: " + lives + " hearts.]" );
                pause2();
                System.out.println("[Press the number acossiated with your choice]");
                System.out.println("\t[1] Backward.");
                System.out.println("\t[2] Right.");
                System.out.println("\t[3] Left.");
                System.out.println("\t[4] Forward.");
                //inifinite for looping through users choice until a valid response is given at which
                //point the loop is broken
                for(;;) {
                    //taking user input
                    choice = input.nextLine();
                    //if valid response then exitting loop. Else prompting user to re-input
                    if((choice.equals("1")) || choice.equals("2")) { break;}
                    if((choice.equals("3")) || choice.equals("4")) { break;}
                    System.out.println("Invalid. Please try again.");
                }
                
                switch(choice) {
                    case "1":
                        pause();
                        if(inventory[1] == false) {
                            System.out.println("\nGary the Ogre sees you");
                            System.out.println("He challenges you to a guessing game between 1-3.");
                            pause2();
                            System.out.println("\n[Enter guess 1 or 2 or 3]");
                           //infinite while loop
                            while(true) {
                                //taking user input
                                choice = input.nextLine();
                                //if valid response then exitting loop. Else prompting user to re-input
                                if((choice.equals("1")) || choice.equals("2")) { break;}
                                if(choice.equals("3")) { break;}
                                System.out.println("Invalid. Please try again.");
                                }
                            //generating random number
                            number = (1+(int)(Math.random()*3));
                            //converting guess to int and saving in guess variable
                            guess = Integer.parseInt(choice);
                            //checking if guess is correct
                            //if correct
                            if(guess == number) {
                                pause();
                                System.out.println("You have guessed correctly! Gary gives you the broom!");
                                pause2();
                                System.out.println("You scurry back to the central point.");
                                pause2();
                                //player wins broom
                                inventory[1] = true;
                            }
                            //if incorrect
                            else {
                                pause();
                                System.out.println("You have guessed incorrectly. Gary punches you. Hearts-1");
                                pause2();
                                System.out.println("You scurry back to the central point.");
                                //loosing a heart
                                lives--;
                                pause2();
                            }
                        }
                        else {
                            //if you have already got the item there is no reason to return
                            System.out.printf("%s we already get what we need. Let's not waste time.", name);
                            pause2();
                        }
                        //exit the loop
                        break;
                        
                    case "2":
                        pause();
                        if(inventory[0] == false) {
                            System.out.println("\nA dementor sees you");
                            System.out.println("She challenges you to a guessing game between 1-4.");
                            pause2();
                            System.out.println("\n[Enter guess 1 or 2 or 3 or 4]");
                            while(true) {
                                //taking user input
                                choice = input.nextLine();
                                //if valid response then exitting loop. Else prompting user to re-input
                                if((choice.equals("1")) || choice.equals("2")) { break;}
                                if((choice.equals("3")) || choice.equals("4")) { break;}
                                System.out.println("Invalid. Please try again.");
                                }
                            //generating random number
                            number = (1+(int)(Math.random()*4));
                            //converting guess to int and saving in guess variable
                            guess = Integer.parseInt(choice);
                            //checking if guess is correct
                            //if correct
                            if(guess == number) {
                                pause();
                                System.out.println("You have guessed correctly! You gain a wand!");
                                pause2();
                                System.out.println("You scurry back to the central point.");
                                pause2();
                                //player wins wand
                                inventory[0] = true;
                            }
                            //if incorrect
                            else {
                                pause();
                                System.out.println("You have guessed incorrectly. The dementor slashes you. Hearts-1");
                                pause2();
                                System.out.println("You scurry back to the central point.");
                                //loosing one heart
                                lives--;
                                pause2();
                            }
                        }
                        else {
                            //if already got item no reason to return
                            System.out.printf("%s we already get what we need. Let's not waste time.", name);
                            pause2();
                        }
                        break;
                        
                    case "3":
                        pause();
                        pause2();
                        if(inventory[2] == false) {
                            System.out.println("\nSerious Snape sees you");
                            System.out.println("He challenges you to a guessing game between 1-5.");
                            pause2();
                            System.out.println("\n[Enter guess 1 or 2 or 3 or 4 or 5]");
                            while(true) {
                                //taking user input
                                choice = input.nextLine();
                                //if valid response then exitting loop. Else prompting user to re-input
                                if((choice.equals("1")) || choice.equals("2")) { break;}
                                if((choice.equals("3")) || choice.equals("4")) { break;}
                                if(choice.equals("5")) {break;}
                                System.out.println("Invalid. Please try again.");
                                }
                            //generating random number
                            number = (1+(int)(Math.random()*5));
                            //converting guess to int and saving in guess variable
                            guess = Integer.parseInt(choice);
                            //checking if guess is correct
                            //if correct
                            if(guess == number) {
                                pause();
                                System.out.println("You have guessed correctly! Snape gives you your hat!");
                                pause2();
                                System.out.println("You scurry back to the central point.");
                                pause2();
                                //player wins broom
                                inventory[2] = true;
                            }
                            //if incorrect
                            else {
                                pause();
                                System.out.println("You have guessed incorrectly. Snape zaps you. Hearts-1");
                                pause2();
                                System.out.println("You scurry back to the central point.");
                                //loosing one heart
                                lives--;
                                pause2();
                            }
                        }
                        else {
                            //if already got item no reason to return
                            System.out.printf("%s we already get what we need. Let's not waste time.", name);
                            pause2();
                        }
                        break;
                    case "4":
                        //if in room 4, checking if user has all the necessary items
                        //if so then battle the warden, else they go back to the central point
                        if((inventory[0] == true) && (inventory[1] == true) && (inventory[2] == true)) {
                            //if first time here, explaining the rules and whatnot
                            System.out.printf("\n\nWe are here %s, we can take Warden Minerva!", name);
                            pause2();
                            System.out.println("\nWe need to defeat her! She will either use a wand, broom, or hat");
                            pause2();
                            System.out.println("We need to pick one of our 2 items (wand, broom, or hat).");
                            System.out.println("Remember, wand blasts broom, broom sweeps hat, and hat covers wand");
                            //fighting warden until player dies or wins
                            while(lives > 0 && win == false) {
                                System.out.printf("\n[What is your choice?]\t[%d Hearts Remaining]", lives);
                                System.out.println("\n\t[1] Wand");
                                System.out.println("\t[2] Broom");
                                System.out.println("\t[3] Hat");
                                
                                choice = input.nextLine();
                                //checking for valid input. if valid, playing game
                                if((choice.equals("1")) ||(choice.equals("2")) || (choice.equals("3")) ) {
                                    //generating 3 random numbers for computers wand, broom, hat choice 
                                    number = 1+(int)(Math.random()*3);
                                    //converting choice into int
                                    guess = Integer.parseInt(choice);
                                    //if both use same "weapon"
                                    if (number == guess && number == 1){
                                        pause();
                                        System.out.println("You both are in a wand laser standstill. This round is a TIE");
                                    }
                                    if (number == guess && number == 2){
                                        pause();
                                        System.out.println("You both circle around in brooms. This round is a TIE");
                                    }
                                    if (number == guess && number == 3){
                                        pause();
                                        System.out.println("You both put on your hats and stare at each other. This round is a TIE");
                                    }
                                    //player win
                                    if(guess == 1 && number == 2) {
                                        pause();
                                        System.out.println("You blast Minerva as she rides on her broom. YOU WIN!!");
                                        win = true;
                                    }
                                    if(guess == 2 && number == 3) {
                                        pause();
                                        System.out.println("You ram Minerva on your broom as she puts on her hat. YOU WIN!!");
                                        win = true;
                                    }
                                    if(guess == 3 && number == 1) {
                                        pause();
                                        System.out.println("You cover Minerva's wand with your hat as she reaches for it"
                                                + ". Defensless, you and bella fistfight her together. \nYOU WIN!!");
                                        win = true;
                                    }
                                    //user lose
                                    if(guess == 2 && number == 1) {
                                        pause();
                                        System.out.println("Minerva blasts you while you ride on your broom. Hearts-1");
                                        lives--;
                                    }
                                    if(guess == 3 && number == 2) {
                                        pause();
                                        System.out.println("Minerva rams you with her broom as you put on your hat. Hearts-1");
                                        lives--;
                                    }
                                    if(guess == 1 && number == 3) {
                                        pause();
                                        System.out.println("Minerva covers your wand with her hat and zaps you with hers. Hearts-1");
                                        lives--;
                                    }
                                    
                                }
                                
                                else {
                                    System.out.println("Invalid. Please try again.");
                                }
                                
                                
                            }
                            
                        }
                        else {
                            System.out.printf("\n%s, we don't have all the items yet. We can't go there, "
                                    + "let's go back\n", name);
                        }
                }
            }
            //checking if win if false and outputting loseing message
            if (win == false) {
                //if they lose all their hearts they come here and that means they are dead and thus lose
                System.out.println("But as you go, conciousness begind to fade. You realize you are bleeding like crazy");
                pause2();
                System.out.println("YOU ARE DEAD -- YOU LOSE");
            }
        }
                
    }
