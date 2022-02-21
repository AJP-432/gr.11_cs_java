
package sphere_surface_area_calc;

// Importing packages
import java.util.Scanner;
import java.lang.Math;

public class Sphere_surface_area_calc {

    public static void main(String[] args) {
        // Initiating scanner
        Scanner input = new Scanner(System.in);
        // Introducing program and prompting radius input
        System.out.println("This is a sphere surface area and volume calculator.");
        System.out.println("Please enter a radius value: ");
        // Saving radius to variable radius
        double radius = input.nextDouble();
        // Computing surface area and volume with formulae
        // 4*pi*r^2 and (4/3)*pi*r^3, respectively
        double surface_area = 4 * Math.PI * Math.pow(radius, 2);
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        // Printing surface area and volume to user
        System.out.printf("The sphere with radius %.3f has surface area %.3f units² and volume %.3f units³ "
                + "\n(rounded to 3 decimals)", radius, surface_area, volume);
    }
}
