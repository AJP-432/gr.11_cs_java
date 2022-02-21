
package problemset32ex1;

import java.lang.Math;
import java.util.Scanner;

public class ProblemSet32Ex1 {

    
    public static void main(String[] args) {
        // Initializing scanner
        Scanner input = new Scanner(System.in);
        // Introducing program and asking for input
        System.out.println("This is a circle area calculator.");
        System.out.println("Please enter a radius value: ");
        // Saving input to variable radius and computing area with formula Pi*radius^2
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        // Outputting anwser 
        System.out.printf("Area of circle with radius %.2f equals %.2f (rounded to 2 decimals)", radius, area);        
    }
    
}
