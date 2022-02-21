
// By Ajlal Paracha for Mr. Martins Gr. 11 CS NightSchool Class, March 5th, 2021
// This program creates an array of 10 random numbers and sorts them

package show_what_you_know_ajlal_paracha;

//importing random and array packages
import java.util.Random; 
import java.util.Arrays;


public class Show_what_you_know_ajlal_paracha {
    
    public static void main(String[] args) {
        
        //initiating array to hold 10 integers
        final int[] numbers = new int[10];
        
        //looping through the array and putting random numbers in it
        for (int i = 0; i < numbers.length; i++) {
            
            //generating random number and assigning to a position in the array
            numbers[i] = (int)Math.round(Math.random()*99+1);            
        }
        
        //Printing the title to the scanner
        System.out.println("This program generates 10 random numbers in an array, sorts them, and prints min and max values");
        System.out.println("-----------------------------------------------------------------------------------------------");
        
        //telling user that we will print the unsorted version
        System.out.println("The unsorted version: ");
        //looping through array and printing all variables before sorting
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
        
        //ordering the numbers array via array sort function
        Arrays.sort(numbers);
        
        //telling user that we will print the sorted version
        System.out.println("\nThe sorted version: ");
        //looping through sorted version and printing all variables
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
        
        System.out.printf("\nThe min value is: %d and the max value is: %d.", numbers[0], numbers[9]);
        
        
        
    }
    
}
