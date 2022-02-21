
import java.util.Scanner; //importing scanner

public class PS24Ex1B_Ajlal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //initating scanner
        int radius; //initiating radius vairable
                
        System.out.println("This is a sphere volume and surface area calculator.\n\nPlease enter an integer number for the radius of the sphere: "); //asking for input
        radius = input.nextInt(); //saving radius input
        
        double volume = 4.0/3.0 * 3.1415926535 * (radius * radius * radius); //computing 4/3 * pi * radius³ (sphere volume formula) and saving to volume variable
        double surface_area = 4 * 3.1415926535 * radius * radius; //computing 4 * pi * radius² (sphere surface area) and saving to surface_area variable
        
        System.out.printf("The sphere's volume and surface area, rounded to 3 decimals, are %.3f units³ and surface area %.3f units², respectively. Thanks and have a nice day!", volume, surface_area); //outputting anwser
        
    }
    
}
