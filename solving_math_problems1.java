/* About_Me_Paracha_Ajlal.java by Ajlal Paracha, Grade 11
 * Dated: 7th Jan, 2021
 * Mr. Martins
 */

package school_assignments_grade11;

import java.util.Scanner;

public class solving_math_problems1 {

	public static void main(String[] args) {
		
		Scanner keyedInput = new Scanner(System.in);
		
		double distance;  // variables for rectangle L and W
		double time;
	
		System.out.println("Hello User. This is a speed calculator for an object motion by using its known distance travelled and the time it took.\n\nPlease enter the distance travelled in meters: ");
		distance = keyedInput.nextDouble(); //saving distance value
		System.out.println("And please also enter the time in seconds: ");
		time = keyedInput.nextDouble();  // saving time value

		double speed = distance / time; //computing area and saving to speed variable
				
		System.out.printf("\nThe speed of the object was %f m/s.", speed);  // outputting answer
	
		
	}
}