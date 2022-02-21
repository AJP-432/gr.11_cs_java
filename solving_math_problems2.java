package school_assignments_grade11;

import java.util.Scanner;

public class solving_math_problems2 {

	public static void main(String[] args) {
		
		Scanner keyedInput = new Scanner(System.in);
		
		double b_length;  // variables for L, W, and H of object
		double b_width;
		double pyr_height;
	
		System.out.println("Hello User. This is a pyramid volume calculator.\n\nPlease enter the base length: ");
		b_length = keyedInput.nextDouble();  // saving base L
		System.out.println("And please also enter the base width: "); 
		b_width = keyedInput.nextDouble();  //saving base W
		System.out.println("And please also enter the pyramid height: ");
		pyr_height = keyedInput.nextDouble(); //saving H

		double volume = (b_length * b_width * pyr_height)/3;  // computing the volume
				
		System.out.printf("\nThe volume of the pyramid is %f units³.", volume);  // outputting the answer
	
		
	}
}