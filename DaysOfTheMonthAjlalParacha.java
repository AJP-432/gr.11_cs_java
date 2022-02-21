// By Ajlal Paracha for Mr. Mertins Grade 11 CS NightSchool Class 
// Feb 26, 2021. This program determines the amount of days in a month
// given the month and the year

package daysofthemonthajlalparacha;

import java.util.Scanner; //importing scanner

public class DaysOfTheMonthAjlalParacha {
    
    public static void main(String[] args) {
        
        //initating scanner
        Scanner input = new Scanner(System.in); 
        
        //declaring variables
        String s_year; 
        int i_year;
        String month;
        boolean bool1 = true;
        
        //Explaining program to user
        System.out.println("This program takes month and year to determine the days in the given month.");
        //prompting year input
        System.out.println("Please enter a year (INTEGER VALUE): "); 
        
        while (true) { //looping until we revieve valid input

            s_year = input.nextLine(); //saving year input
            
            try {   //trying to convert year input to number. If error, we know the input was invalid
                i_year = Integer.parseInt(s_year);  //try to convert to integer and save to i_year.
                break;                              //if it goes through, then valid input we can exit loop
                                                    //else it will raise exception which we catch below
            }                                       
            catch (NumberFormatException e){ //if invalid input then we ask to resubmit year and inform of 
                System.out.println("Invalid input. Please try again."); //invalid input
                continue; //reloop until valid input
            }
        
        }
        //prompting month input
        System.out.println("Please enter the full name of a month (ex. January): ");

        while (bool1) { //looping uptil valid input of month
            month = input.nextLine(); //saving input to variable month
            month = month.toUpperCase(); //converting to uppercase to remove capitalization issues
            
            //checking if month input is valid by checking if it equals to one of the following month strings
            switch(month){
            case "JANUARY": 
            case "MARCH":
            case "MAY":                 //checking if month is one with 31 days
            case "JULY":
            case "AUGUST":
            case "OCTOBER":
            case "DECEMBER":
                
                System.out.printf("\n%s, %d has 31 days", month, i_year);  //outputting anwser
                bool1 = false; //to break loop
                break; //exit switch

                
            case "APRIL": 
            case "JUNE":
            case "SEPTEMBER":                 //checking if month is one with 30 days
            case "NOVEMBER":
                            
                System.out.printf("\n%s, %d has 30 days", month, i_year);  //outputting anwser
                bool1 = false; //to break loop
                break; //exit switch


            
            case "FEBRUARY": //if month is Feb
                
                //computing if year is leap and outputting accompanying output
                if ((i_year % 4 == 0) && (i_year % 100 != 0)) { 
                    System.out.println("ITS A LEAP YEAR!\n"); 
                    System.out.printf("%s, %d has 29 days", month, i_year); 
                }
                else if ((i_year % 4 == 0) && (i_year % 100 == 0) && (i_year % 400 == 0)) {
                    System.out.println("ITS A LEAP YEAR!\n"); 
                    System.out.printf("%s, %d has 29 days", month, i_year); 

                }
                else {
                    System.out.printf("%s, %d has 28 days", month, i_year); 
                }
                
                bool1 = false; //to break loop
                break;
                
            default:
                System.out.println("Invalid input. Please try again."); //letting user know if input is invalid
                continue; //reloop if invalid input
                               
        }   
    }
        
        

                
                
        
        
    }
    
}
