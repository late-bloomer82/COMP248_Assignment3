/* --------------------------------------------------------------------
Assignment 2
Written by: Ahmad-Radjai Cherifi, 40327926
For COMP 248 Section U – Winter 2025
--------------------------------------------------------------------
The Mid-degree Meritas Program calculates CryptoSkill rewards for Concordia computer science students based on multiple courses. It validates 8-digit student IDs (starting with 2 or 4), then processes nine courses. For each course, it identifies numbers within merit points that are multiples of the course's category number and calculates a reward total, displaying results in a formatted output.*/
import java.util.Scanner;
public class A3_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("____****_______****_______****_______****_______****_______");
        System.out.println("    Welcome to Concordia mid-degree Meritas Program     ");
        System.out.println("____****_______****_______****_______****_______****_______");;
        System.out.println();

        // Student ID validation
        String studentId = "";
        boolean validId = false;

        // Loop student ID request for as long as the input is invalid
        while (!validId) {
            System.out.println("Enter your student ID:");
            studentId = scanner.nextLine();

            // Check if ID is valid
            if (studentId.length() == 8 &&
                    (studentId.charAt(0) == '2' || studentId.charAt(0) == '4')) {
                validId = true;
            } else {
                System.out.println("Error: Your input/entry is not a valid student ID. Kindly retry again!");
            }
        }

    }
}
