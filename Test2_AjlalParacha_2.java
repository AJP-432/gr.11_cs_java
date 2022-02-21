
// By Ajlal Paracha in Mr. Martins Gr11 CS Night School Class Feb 9, 2021 Test 2 Question 2
package test2_ajlalparacha_.pkg2;

import java.lang.Math; //importing math package

public class Test2_AjlalParacha_2 {

   
    public static void main(String[] args) {
        
        int random_number = (int)Math.round(Math.random()*9+1); //creating a random number from 1-10
        System.out.println("Welcome to Random Number Generator of Numbers and Quotes!"); //title
        
        if ((random_number % 2) == 0) { //checking if number is even 
            
            System.out.printf("Number Generated: %d\n", random_number); //printing generated numebr
            
            switch (random_number) {
        
            case 2:  //depending on the number we will output different sums. In 1-10 there are 5 evens: 2, 4, 6, 8, 10.
                
                System.out.println("Sum of 1 + 2 = 3");
                
                break;
            case 4:
                
                System.out.println("Sum of 1 + 2 + 3 + 4 = 10");
                break;
            case 6:
                
                System.out.println("Sum of 1 + 2 + 3 + 4 + 5 + 6 = 21");
                break;
            case 8:
                System.out.println("Sum of 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36");
                break;
            case 10:
                System.out.println("Sum of 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55 ");
                break;
            }
            
        }
            
                   
        else { //will run if generated number is odd
            
            System.out.printf("Number Generated: %d\n", random_number); //printing gneerated number
            switch (random_number) { //picking a quote depending on the generated number. There are 5 quotes each acossitaed with 1 odd number.
                                     //there are 5 odd numbers between 1-10: 1, 3, 5, 7, 9
        
            case 1:  
                System.out.println("\"Act as if what you do makes a difference. It does\" - William James");
                break;
            case 3:
                System.out.println("\"Believe you can and you're halfway there\" - Theodore Roosevelt");
             break;
            case 5:
                System.out.println("\"When you have a dream, you've got to grab it and never let go\" - Carol Burnett");
                break;
            case 7:
                System.out.println("\"Limit your 'ALWAYS' and your 'NEVERS'\" - Amy Poehler");
                break;
            case 9:
                System.out.println("\"Nothing is IMPOSSIBLE. The word itself says I'M POSSIBLE!\" - Audrey Hepburn");
                break;
            }   
        
    }
    }
}
