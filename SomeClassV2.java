package school_assignments_grade11;

import java.util.Scanner;

public class SomeClassV2 {
	
	public static void main (String [] args) {
		
		int yourNum = 0;
		Scanner uI = new Scanner (System.in);
		System.out.println("Please a number: ");
		yourNum = uI.nextInt();
		System.out.printf("You entered the number %d", yourNum);
	}
	
}