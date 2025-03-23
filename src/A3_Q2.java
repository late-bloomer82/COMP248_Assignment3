/* --------------------------------------------------------------------
 Assignment 3
 Written by: Ahmad-Radjai Cherifi, 40327926
 For COMP 248 Section U – Winter 2025
 --------------------------------------------------------------------
 The Quebec Housing Rental Price Index Program calculates the rental price index base don the type and location of a property. The program prompts the user to enter the housing type and location. It then uses ratios to compute the rental price index using the formula. The final index value is displayed to the user.*/
import java.util.Scanner;
public class A3_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print welcome message
        System.out.println("\\---------------------------------------------------------\\");
        System.out.println("/           Montreal CineFun Bookkeeping Program          /");
        System.out.println("\\---------------------------------------------------------\\");

        // Request and read input from user
        System.out.println("Please enter the theather rooms you are using today (room|revenue and separated by a semicolon):");
        String input =  scanner.nextLine();

        // Edge case
        if(input.equals("0")) {
            System.out.println("You are not using any theater room today!");
            System.out.println("Thank you for using Montreal CineFun Bookkeeping program!");
        }

        // Split input and store it inside an array
        String[] theaterEntries = input.split(";");

        // Store data in arrays
        String[] rooms = new String[theaterEntries.length];
        int[] revenues = new int[theaterEntries.length];

        //“Cinema_1|350;Cinema_24|875,RecRoom|0;”

        // Parse each room entry
        for (int i = 0; i < theaterEntries.length; i++) {
            if (!theaterEntries[i].isEmpty()) {
                String[] parts = theaterEntries[i].split("\\|");
                if (parts.length == 2) {
                    rooms[i] = parts[0];
                    revenues[i] = Integer.parseInt(parts[1]);
                }
            }
        }




    }
}
