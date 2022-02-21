package school_assignments_grade11;

import java.util.Scanner;

public class SomeClass {
	
	public static void main (String [] args) {
		
	
	String yourName = null;
	Scanner uI = new Scanner (System.in);
	System.out.println("Please enter your name: ");
	yourName = uI.nextLine();
	System.out.printf("Greetings %s. You should never tell a stranger your name;\nespecially an electronic one.", yourName);
	
	}
	
	
}