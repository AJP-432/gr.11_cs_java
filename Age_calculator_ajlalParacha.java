/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_calculator_ajlalparacha;

import java.util.Scanner;

/**
 *
 * @author AJ
 */
public class Age_calculator_ajlalParacha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);

        System.out.println("This is an age calculator"); 


        String name;  //initializing variables
        int current_yr;  
        int birth_yr; 
        int age; 


        System.out.println ("\nEnter your name: ");
        name = keyedInput.nextLine(); //saves name
        System.out.println ("\nEnter current year: ");
        current_yr = keyedInput.nextInt(); //saves current year
        System.out.println ("Enter Birth year:");
        birth_yr = keyedInput.nextInt(); //saves birth year
        
        age = current_yr - birth_yr; //calculates age
        
        System.out.printf("%s, you are %d years old!", name, age);
    }
    
}
