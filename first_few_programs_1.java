package school_assignments_grade11;

import java.util.Scanner;

public class first_few_programs_1 {

	public static void main(String[] args) {
		
		final double wtr_used = 1.5;	//amount of water/desktop & monitor combo
		double amnt_of_combos;			//variable for how many combo's user has
		
		Scanner keyedInput = new Scanner(System.in); 
		
		System.out.println("Hi User! Did you know it takes ~1.5 tons on water on average to manufacture 1 computer & monitor combo?\n"
				+ "This program aims to calculate how much water water all your computer & monitor combos have used.\n\nSo how many computer & monitor combos do you own?");
		
		amnt_of_combos = keyedInput.nextDouble(); //saving amount of combo's
		
		System.out.printf("In total, your computer and monitor combos used %.1f tons of water!", (amnt_of_combos*wtr_used)); //outputting result

	}
}