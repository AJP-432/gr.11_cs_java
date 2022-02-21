//By Ajlal Paracha for Mr. Martins Gr. 11 CS NighSchool Class on March 6th, 2021
//This is my anwsers for the remixing assignment
package remixing_ajlal_paracha;

//importing packages
import java.util.Scanner; 

public class Remixing_ajlal_paracha { 

    public static void main(String[] args) {
        
        
        //initiating scanner
        Scanner input = new Scanner(System.in);
        
        //initiating choice variable
        String choice;
        //printing title to user
        System.out.println("Please enter the number of the program you wish to use.");
        System.out.println("1\n2\n3\n4");
        
        //assigning user input to choice variable
        choice = input.nextLine();
        
        //playing the program asocciated with each input number. Determining program with switch cases
        switch(choice) {
        
            case "1":
                //declaring int array that will hold 20 values
                int [ ] numbers = new int [20];
                //declaring total variable
                int total = 0;
                //printing program title and purpose
                System.out.println("Enter 20 integers and they will be added together:");
                //looping through array and adding user input
                for (int i = 0; i <= 19; i++)
                {
                   numbers[i] = input.nextInt();
                }

                //looping through array and adding each value to total
                for (int i = 0; i <= 19; i++)
                {
                     total = total + numbers[i];
                }
                //prining anwser
                System.out.println("The sum of those numbers is:");
                System.out.println(total);
                break;
                
            case "2":
                //declaring string array that will hold 5 values
                String [ ] friends = new String [5];
                //printing program title
                System.out.println("Enter the names of five friends:");
                //looping through array and adding friend names to it
                for (int i = 0; i <= 4; i++)
                {
                    friends[i] = input.nextLine();
                }
                //Outputting anwser and the names of 2nd, 3rd, and 4th friend
                System.out.println("The second, third, and fourth names listed were:");
                System.out.println("Second: " + friends[1]);
                System.out.println("Third: " + friends[2]);  
                System.out.println("Fourth: " + friends[3]);  
                break;
                
            case "3":
                //declaring array with mark values, total and average variables
                double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6};
                double total_2 = 0;
                double average;
                //outputting current marks in array
                System.out.println("These are the marks:");
                //looping through array and printing marks
                for (int i = 0; i<=8; i= i + 1)
                {
                   System.out.println(marks[i]);
                }
                //looping through array and adding array numbers to total
                for (int i = 0; i<=8; i= i + 1)
                {
                    total_2 = total_2 + marks[i];
                }
                //computing average with formula (n1 + n2 + n3...)/(n)
                average = total_2/9;

                average = average * 10;
                average = Math.round(average);
                average = average/10;
                //outputting final anwser
                System.out.println("The average mark is:");
                System.out.println(average);
                break;
                
            case "4":
                //initiating array to hold 25 integers, boolean in, find int, and variable of the number user wishes to find
                int[] numbers_2 = new int[25];
                int value;
                boolean in = false;
                //outputting title
                System.out.println("This program generates 25 random numbers in an array.");
                System.out.println("Then, input a number that you would like to check if it is in it.");
                System.out.println("The numbers will be 1-100");
                //looping through the array and putting random numbers in it
                for (int i = 0; i < numbers_2.length; i++) {

                    //generating random number and assigning to a position in the array
                    numbers_2[i] = (int)Math.round(Math.random()*99+1);            
                }
                //prompting input
                System.out.println("What is your number?");
                //saving user input to value variable
                value = input.nextInt();
                //looping through array and trying to find the users number
                for (int i = 0; i < numbers_2.length; i++) {
                    //if number in array at position i = value (user input) then save i to find and set in to true
                    if (numbers_2[i] == value)  {
                        in = true;
                    }
                }
                //if in is true
                if (in == true) {
                    //printing anwser
                    System.out.println("Your number is in the array!");
                }
                //if in is false, i.e. number not found, response
                else {
                    System.out.println("Your number was not found :(");
                }
                //informing user program will output all numbers in array
                System.out.println("For the record, here are the numbers in the array:");
                //looping through array and printing all values
                for (int k = 0; k < numbers_2.length; k++) {
                    System.out.print(numbers_2[k] + " ");
                }
                break;
            
            //if user enters invalid input they must restart the program
            default:
                
                System.out.println("Invalid. Restart the program and try again.");
                break;            
        }
             }
        
    }
    
