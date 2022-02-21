
//Program written by Ajlal Paracha to work with decision statements
// Teacher: Mr. Martins Gr11 CS Nightschool 
// Dated: Feb 14th, 2021

// create a new package
package choose_your_own_adventure_ajlal;

// import the packages
import java.util.Scanner;
import java.lang.Thread;
// The executable class
public class Choose_your_own_adventure_ajlal {
// The main method
    public static void main(String[] args) {
// Variable declaration        
        Scanner input = new Scanner(System.in); //initating scanner

        String name;        //initiaing variable
        String choice;
        int choice_case;
        int time = 30;  
        
        //displays the tite of the entire program
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("");//line spacing
        System.out.println("---THE HIGHSCHOOL ADVENTURE---"); //displays a message for the user indicating the title of the program
        System.out.println("");//line spacing
        System.out.println("-------------------------------------");
        
        System.out.println("Hello, what is your name?");
        name = input.nextLine();
        System.out.printf("\nWould you like to play %s? \n(yes/no)", name); //asking for name and saving it
        choice = input.nextLine();
        
        if (choice.equals("yes")) {
        // Body of if statement    
            System.out.printf("\nYou step out of your car %s. Its the first day of highschool and you're nervous." //game intro
                    + "You need to go to Mr. Martins Grade 9 CS Class by 8:30.\n Its currently 8:00, you have 30 minutes.", name); 
            System.out.println("Do you go inside? \n(yes/no)"); //asking if want to go inside and executing depending on choice
            choice = input.nextLine();
            
            if (choice.equals("yes")) {
            // body of if statement
                System.out.printf("\nYou have %d minutes\n", time); //printing options and executing based on it
                System.out.println("1. Follow the crowd");
                System.out.println("2. Go to the left");
                System.out.println("3. Go to the right");
                System.out.println("4. Go straight\n");
                
                choice_case = input.nextInt();//reads typed value and stores it in assigned variable 
                
                switch (choice_case){
                    case 1:
                        System.out.println("You follwed the croud and now are lost. You lost 5 minuites."); 
                        time-=5;
                        break;
                    case 2:
                        System.out.println("You are in the english Hallway. You lost 2 minuites.");
                        time-=2;
                        break;
                    case 3:
                        System.out.println("You are in the cafeteria. You lost 3 minuites"); 
                        time-=3;
                        break;
                    case 4:
                        System.out.println("You go straight and see someone kissing. You run away screaming EWWW");
                        break;
                    default:            //Incase of invalid number
                        System.out.println("Invalid option. No more game for you");
                        System.exit(0);
         }
                System.out.println("\nWE ARE RUNNING OUT OF TIME");
                System.out.println("What should I do next?");

                System.out.printf("You have %d minutes\n", time);

                System.out.println("1. You ask a fellow student"); //asking for choice and executing on it
                System.out.println("2. Call your parents");
                System.out.println("3.Follow the hallway and hope to find the classroom");
                System.out.println("4. Ask a teacher\n");
                
                choice_case = input.nextInt();//reads typed value and stores it in assigned variable 

                switch (choice_case){
                    case 1:
                        System.out.println("\nHe says \"Mister Martins class is somewhere around the corner I could not tell you. I don't even go to class HEHE.\"\nYou lost 5 minutes.");
                         time-=10;
                         break;
                    case 2:
                        System.out.println("They says \"What do you want us to do? I don't think we can help you.\"\nYou lost 2 minuites.");
                         time-=12;
                         break;
                    case 3:
                        System.out.println("You follwed the hallways and now are in the science section."); 
                        break;
                    case 4:
                        System.out.println("The teacher tells you that the math section is near the geography section.");
                        break;
                    default:            //Incase of invalid number
                        System.out.println("Invalid option. No more game for you");
                        System.exit(0);
                        }
                System.out.println("WE GOTTA GO FASTER"); 
                System.out.println("You encounter an end with 2 ways");
                System.out.println("What should I do next?\n");

                System.out.printf("You have %d minutes\n", time);

                System.out.println("1. Go left");   //asking for input and saving value
                System.out.println("2. Go right\n");
    
                choice_case = input.nextInt();//reads typed value and stores it in assigned variable 
                System.out.println(""); //line spacing
                switch (choice_case){
                    case 1:
                        System.out.println("You go left and now are back at the entrance. You lost 8 minuites.");
                        time-=15;
                        break;
                    case 2:
                        System.out.println("You went right and now find the geography hallway.");
                        break;
                    default:            //Incase of invalid number
                        System.out.println("Invalid option. No more game for you");
                        System.exit(0);
                        }
 
 
                System.out.println("\nALMOST THERE");
                System.out.println("What should I do next?\n");

                System.out.printf("You have %d minutes\n", time);

                System.out.println("1. Go towards the Geography hallway"); //asking for input and saving value
                System.out.println("2. Go towards the Gym");
                System.out.println("3. Read the school map on the wall");
                System.out.println("4. Follow a student carrying a math textbook\n\n");

                choice_case = input.nextInt();//reads typed value and stores it in assigned variable 

                 switch (choice_case){ 
                     case 1:
                         System.out.println("There is nothing here its a dead end. You accidentally entered the geology section. You lost 5 minuites.");
                          time-=5;
                          break;
                     case 2:
                         System.out.println("You went towards the Gym and saw Mister Martins. You decided to follow him.");
                          break;
                     case 3:
                         System.out.println("The school map was too complex. You lost 3 minuites."); 
                         time-=3;
                         break;
                     case 4:
                         System.out.println("The student took you to the math section. But you lost 5 minuites.");
                         time-=3;
                         break;
                     default:            //Incase of invalid number
                        System.out.println("Invalid option. No more game for you");
                        System.exit(0);
                         }
                 
                System.out.printf("\n\nYou have %d minutes", time);
                System.out.println("You eventually made it to Mister Martins Class");
                
                if(time<=0){
                    
                    System.out.println("Mister Martins says \"WHY ARE YOU LATE. YOU GET DETENTION\""); 
                    System.out.printf("Outcome: Successful but Late so yea, Time: %d minutes after class class", Math.abs(time)); //pring end result

                    }
                else{
                System.out.println(" Mr. Martins says \"Welcome to my class\"");
                System.out.printf("Outcome: Successful, Time: %d minutes before class", time); //pring end result
                }
     
        }
            
            
            else if (choice.equals("no")) {
                System.out.println("Ok so you roam around outside the school. You notice someone being bullied, do you help? \n(yes/no)");
                time -= 2; //asking for input and saving value
                System.out.printf("%d minutes until class.", time);
                choice = input.nextLine();
                
                if (choice.equals("yes")) {
                    
                    System.out.println("\nYou cry, \"Hey buddy, pick on someone your own size! Get off him!\"");
                    System.out.println("\nWhats it to you newbie. You trying to mess on my turf!");
                    System.out.println("\nSuddently, you are ganged by a couple bullies who are all much older and stronger than you. Do you run or fight? (run/fight)");
                    time -= 1;
                    System.out.printf("\n%d minutes until class.", time);
                    
                    choice = input.nextLine();
                    
                    if (choice.equals("run")) {
                        System.out.println("\nYou frantically start running. Do you go to the teacher or washrooms? (teacher/washroom)");
                        choice = input.nextLine();
                        if (choice.equals("teacher")) {
                            System.out.println("\nYou start running towards the teachers beside the parking lot.");
                            System.out.println("\nWould you like to call out to them? (yes/no)"); 
                            choice = input.nextLine();
                            
                            if (choice.equals("yes")) {
                                System.out.println("\nYou shout \"HELP IM BEING CHASED BY LUNATICS WHO WERE HURTING THIS KID\"");
                                System.out.println("\n4 teachers run to you. \"Good job alerting us buddy, we got this\"");
                                System.out.println("\nThe bullies are taken care of. One of the teachers asks \"Good job. I'm Mr. Martin, let me know if you need with anything champ\"");
                                System.out.println("\nYou say, \"Well, actually I'm im your period 1 class. Could you help me get there?\"");
                                System.out.println("\nHE SCREAMS \"NO\"....you become alarmed");
                                System.out.println("\nThe teachers laugh\"HA HA HA\"...He then says \"I'm just joking, of course. Come with me champ\"");
                                System.out.println("\nThe rest of the day precedes great. A successful and memorable first day. You pioneer the bully alert club and become an activist in the fights against bullying which becomes your career.");
                                System.out.printf("\nOutcome: Win by finding Mr. Martin, Time: %d", time); //printing ending
                            }
                            else if (choice.equals("no")) {
                                System.out.println("The bullies catch up and start pounding you. After all, they are much stronger and older.");
                                System.out.printf("\nOutcome: Losing by Unconciousness, Time: %d minutes before class", time); //printing outcome
                                
                            }
                            else {
                                System.out.println("Putting an invalid anwser. Nice try wiseguy. You are so funny and cool. Its because of people like you that programmers have to do so much work. Bye.");
                            }
                            
                        }
                       
                        else if (choice.equals("washroom")) {
                            time -= 3;
                            System.out.println("\nYou run into the washroom. The bullies chase...");
                            System.out.println("\nYou are now in a deadend.");
                            System.out.println("\nYou get beaten up and left on the washroom floor; stupid decision on your part.");
                            System.out.printf("\nOutcome: Losing by Washroom Beat Up, Time: %d minutes before class."); //printing outcome
                        }
                        else {
                            System.out.println("Putting an invalid anwser. Nice try wiseguy. You are so funny and cool. Its because of people like you that programmers have to do so much work. Bye.");
                        }
                    }
                    else if (choice.equals("fight")) {
                        System.out.println("\nYou frantically start swinging your hands. You hit the main bully! You are winn..");
                        System.out.println("\nYOU GET SUCKER PUNCHED IN THE JAW");
                        System.out.println("\n\"What the hell were you thinking with that weak stuff bruh\" says the main bully, "
                                + "\n\"You are about to get it!\"");
                        System.out.println("\nYou get kicked multiple times and lose conciousness");
                        System.out.printf("\nYou hear \"Hey %s, I don't know if you can hear me. I'm not going to lie, that was dumb. "
                                + "\nThere were MULTIPLE stronger, and older guys. But hey, you live, you learn. Maybe next time\"", name);
                        System.out.println("\nYou are now unconciousess. Have a nice nap.");
                        System.out.printf("\nOutcome: Losing by unconciousness, Time: %d minutes before class", time); //printint outcome
                    }
                    else {}
                }
                else if (choice.equals("no")) {
                    time -= 10;
                    System.out.println("You watch for 5 minutes until the principal comes around and sees what is happening. "
                            + "\nAs a bystander, you were part of the problem...");
                    System.out.println("You are lectured with the bullies about bullying and many teachers have their eyes on you, "
                            + "\nincluding Mr. Martins who thinks you are evil...");
                    System.out.println("You get to class only to be scorned by everyone. Very unseccesful first day, but hey, you "
                            + "\nmade it to class on time.");
                    System.out.printf("Outcome: You get to class but are universally accepted as evil, Time: %d minutes before class", time); //printing outcome
                    
                }
                else {
                    System.out.println("Putting an invalid anwser. Nice try wiseguy. You are so funny and cool. Its because of people like "
                            + "\nyou that programmers have to do so much work. Bye.");
                }
            }
            else {
                System.out.println("Putting an invalid anwser. Nice try wiseguy. You are so funny and cool. Its because of people like you"
                        + "\n that programmers have to do so much work. Bye.");
            }

            
            
        }
        
        else if (choice.equals("no")) {
            System.out.println("Ok. Have a nice day.");
        }
        
        else {
            System.out.println("Putting an invalid anwser. Nice try wiseguy. You are so funny and cool. Its because of people like you "
                    + "\nthat programmers have to do so much work. Bye.");            
        }
    }
    
}
