//By Ajlal Paracha in Mr. Martins Gr. 11 CS Night School Class Feb 27 2021
//This program creates or validates drivers licenses according to Ontario standards

package drviers_license;

//importing packages
import java.util.Scanner; 
import java.util.Random; 

public class Drviers_license {

   
    public static void main(String[] args) {
        
        //initiating scanner and declaring all valriables
        Scanner input = new Scanner(System.in); 
        String choice; 
        String name; 
        String temp; 
        String temp2;
        String birth_date; 
        String license = "";
        boolean valid = true;
        
        //explaining program and prompting choice of program 
        System.out.println("Hello. Would you like to create a Ontarios Driver License or test and existing one's validity?");
        System.out.println("Press:\n1 for license generation\n2 for license validity check");
        
        //looping until valid input
        while(true) {
            
            //getting user choice 
            choice = input.nextLine();
            //if valid choice (i.e. 1 or 2) then break loop and continue
            if ((choice.equals("1")) || (choice.equals("2"))) {
                break;
            }
            //if invalid, ask user to re-enter choice
            else {
                System.out.println("Invalid input. Please try again.");
            }              
        }
        
        //continuation of license generation program
        if(choice.equals("1")) {
            //prompting input of name and saving to variable name. converting to uppercase as uppercase letter in license
            System.out.println("Please enter your surname: ");
            name = input.nextLine();
            name.toUpperCase();
            //prompting input of birthday and saving to variable birth_date
            System.out.println("Please enter your birth date (ex. yymmdd): ");
            birth_date = input.nextLine();
            
            //computing the license plate by grabbing the first surname, generating numbers, and adding birth_date
            
            //getting first lettor of name and adding to license
            license += Character.toString(name.charAt(0));             
            //looping 4 times and adding random number to license each time
            for(int i = 0; i <= 3; i++) {
                license += (int)(Math.random()*10); 
            }
            //adding hyphen
            license += "-";
            //adding another 4 random numbers to total 8
            for(int i = 0; i <= 3; i++) {
                license += (int)(Math.random()*10); 
            }
            //adding first birthdate character
            license += Character.toString(birth_date.charAt(0)); 
            //adding hyphen
            license += "-";
            //getting last 5 1numbers of birth_date and adding to license by creating a substring
            license +=  birth_date.substring(1,6);
            //printing license
            System.out.println("DRIVER'S LICENSE: " + license);
        }
        
        //continuation of license validity checking program
        else {
            //prompting all necessar inputs and saving to respective variables
            System.out.println("Please enter your surname: ");
            name = input.nextLine();
            name = name.toUpperCase();
            System.out.println("Please enter your birth date (ex. yymmdd): ");
            birth_date = input.nextLine();
            System.out.println("Please enter your license numebr: ");
            license = input.nextLine();
            
            //checking for license validity. If at any points, the program has concluded to be invalid, the boolean
            //valid becomes false. If false it will print invalid. Otherwise, it will remain true print the license is VALID!
            
            //checks if 1st letter of name equals 1st character in license
            if (name.charAt(0) != license.charAt(0)) {
                valid = false;
            }
            //checks if 11th license plate character equals the first number in date of birth
            if ((license.charAt(10)) != (birth_date.charAt(0))) {
                valid = false;
            }
            //checks if last 5 numbers in license are last 5 numbers in date of birth
            temp = license.substring(12,17);
            temp2 = birth_date.substring(1,6);
            if (!(temp.equals(temp2))) {
                valid = false;
            }
            //outputting final result 
            if(valid) {
                System.out.println("VALID!");
            }
            
            else {
                System.out.println("INVALID!");
            }
            
        }
        
        
    }
    
}
