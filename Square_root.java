
package square_root;

// Importing packages
import java.util.Scanner;
import java.lang.Math;
public class Square_root {

    public static void main(String[] args) {
        // Initiating scanner
        Scanner input = new Scanner(System.in);
        // Introducing program and prompting input
        System.out.println("This is a square root calculator for integers between 0 and 100.");
        System.out.println("Please enter an integer: ");
        // Saving input to variable number
        int number = input.nextInt();
        // Computing square root 
        double root = Math.sqrt(number);
        // Outputting result
        System.out.printf("The square root of %d is %.2f (rounded to 2 decimals)", number, root);
    }
    
}
