package school_assignments_grade11;

import java.util.Scanner;

public class first_few_programs_2 {

	public static void main(String[] args) {
		
		final double cst_USB = 19.99;    // constant costs of the goods
		final double cst_kyb = 49.99; 
		final double cst_mouse = 25.99;
		double buying_USB;               //variable for amount of goods that customer will buy
		double buying_kyb;  
		double buying_mouse;
		
		
		Scanner keyedInput = new Scanner(System.in);
		
		System.out.println("Hi User. This program aims to calculate the subtotal, amount of tax, and grand total of the amount of\n\ncomputer USBs ($"+cst_USB+")\nkeyboards ($"+ cst_kyb+")\nand mice ($"+cst_mouse+") \n \nbeing bought.\n\n");
		System.out.println("So, going in the order mentioned above, how many USBs are you purchasing? ");
		buying_USB = keyedInput.nextDouble();  // saving amount of usb's
		System.out.println("Next, how many keyboards are you purchasing? ");
		buying_kyb = keyedInput.nextDouble(); // saving amount of keyboards
		System.out.println("Lastly, how many mice are you purchasing? ");
		buying_mouse = keyedInput.nextDouble();  // saving amount of mice
		
		double subtotal = (buying_USB * cst_USB) + (buying_kyb * cst_kyb) + (buying_mouse * cst_mouse);
		double taxtotal = subtotal * 0.13; //HST in Ontario (didn't use HST as we want to output the cost of just tax in the output) 
		double total = subtotal + taxtotal; 
		
		System.out.printf("Your subtotal is $%.2f which generates $%.2f of tax which totals to $%.2f. Thanks for choosing BestBuy and have a nice day!", subtotal, taxtotal, total);
		 // outputting result
	}
}