/* --------------------------------------------------------------------
 Assignment 3
 Written by: Ahmad-Radjai Cherifi, 40327926
 For COMP 248 Section U – Winter 2025
 --------------------------------------------------------------------
The Montreal CineFun Bookkeeping Program tracks daily revenue for a movie theater's auditoriums. It accepts input in the format "RoomName|Revenue;" for multiple theater rooms, calculates the average revenue, and classifies this average according to predefined measurements(Very high, High, Regular, Middle, or Low).
The program displays a list of theater rooms being used, the calculated average revenue, and its classification label.*/
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
        System.out.println();

        // Edge case
        if(input.equals("0")) {
            System.out.println("You are not using any theater room today!\n");
            System.out.println("Thank you for using Montreal CineFun Bookkeeping program!");
            scanner.close();
            return;
        }

        // Split input
        String[] theaterEntries = input.split(";");

        // Store data in arrays
        String[] rooms = new String[theaterEntries.length];
        int[] revenues = new int[theaterEntries.length];

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

        // Display theater rooms, average revenues and classification info
        System.out.println("Here is a list of theater rooms you are using today:\n");


        for(int i= 0; i<theaterEntries.length; i++){
            System.out.println("No." + (i+1) + " " + rooms[i]);
        }

        // Calculate average revenue
        int sum = 0;
        int count = 0;
        for (int i = 0; i < revenues.length; i++) {
            sum += revenues[i];
            count++;
        }

        double average = (double) sum / count;

        // Determine classification label
        char label;
        if (average >= 1000) {
            label = 'V'; // Very high
        } else if (average >= 800) {
            label = 'H'; // High
        } else if (average >= 500) {
            label = 'R'; // Regular
        } else if (average >= 300) {
            label = 'M'; // Middle
        } else {
            label = 'L'; // Low
        }

        // Display average revenue and classification
        System.out.printf("The average of the theater rooms revenue is $%.2f and today's average revenue is labeled as: %c\n", average, label);

        // Display closing message
        System.out.println("\nThank you for using Montreal CineFun Bookkeeping Program!");

        // Close scanner
        scanner.close();
    }
}
