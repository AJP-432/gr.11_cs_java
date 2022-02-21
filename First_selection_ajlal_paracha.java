
// By Ajlal Paracha in Mr. Martins Grade 11 CS Class Feb 2, 2021

package first_selection_ajlal_paracha;

import java.util.Scanner; //importing scanner class

public class First_selection_ajlal_paracha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //initating scanner
        double percent_off;
        System.out.println("Please enter the total cost to determing the amount of savings: ");
        double cost = input.nextDouble();
        
        if (cost <= 40.00) {           //determines the percentage off depeening on produce price
            percent_off = 10.00;
        } 
        
        else if (cost <= 80.00) {
            percent_off = 20.00;
        }
        
        else if (cost <= 120) {
            percent_off = 30.00;
        }
        
        else {
            percent_off = 40.00;
        }
        
        double money_off = cost * (percent_off * 0.01);
                
        System.out.printf("The total cost of items is %.2f which results in %.2f%% off yielding a saving of $%.2f and final cost $%.2f.", cost, percent_off, money_off, cost-money_off);
        // ^ outputs anwser by formatting string and calculates dollar amounit off and subsequent final price
    }
    
}
