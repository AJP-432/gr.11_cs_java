/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypotenure_calc_ajlal;
import java.util.Scanner;
/**
 *
 * @author AJ
 */
public class Hypotenure_Calc_AJLAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        double side1; //initalizing variables
        double side2; 
        
        System.out.println("This program computes the hypotenuse of a right-triangle with its side lengths."
                + "\nPlease enter the first side-length: ");//indicates program purpose
            
        
        side1 = keyedInput.nextDouble(); //saving length a

        System.out.println ("Enter the length of side b:");
        side2 = keyedInput.nextDouble(); //saving side length b


        double hyp = Math.sqrt((side1*side1) + (side2*side2)); //calculate hypotenuse with formula sqrt(a^2 + b^2)

        System.out.printf("The hypotenuse of the right triangle is %f cm", hyp);
    }
    
}
