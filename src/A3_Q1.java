/* --------------------------------------------------------------------
Assignment 3
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

        // Display jackpot message
        System.out.println();
        System.out.println("----$$$$-------$$$$-------$$$$-------$$$$-------$$$$----$$$$----");
        System.out.println("     Your Jackpot for Concordia mid-degree Meritas Program is:");
        System.out.println("----$$$$-------$$$$-------$$$$-------$$$$-------$$$$----$$$$----");
        System.out.println();

        // Course data storage
        int[][] coursesData = {
                {1, 232, 8},     // Category, Course number and Merit points
                {2, 248, 15},
                {3, 228, 24},
                {4, 233, 31},
                {5, 249, 37},
                {6, 282, 49},
                {7, 348, 51},
                {8, 352, 65},
                {9, 346, 79}
        };

        int cumulativeCryptoSkill = 0;

        // Process each course/category
        for (int i = 0; i < coursesData.length; i++) {
            int category = coursesData[i][0];
            int courseNumber = coursesData[i][1];
            int meritPoints = coursesData[i][2];

            System.out.print("In the merit points of ");

            // Handling for ENCS 282
            if (courseNumber == 282) {
                System.out.print("ENCS ");
            } else {
                System.out.print("COMP ");
            }

            System.out.println(courseNumber + ", the numbers that are multiple of category " + category + " are: ");

            int courseSum = 0;

            // Process the numbers for this course/category
            for (int j = category; j <= meritPoints; j += category) {
                System.out.print(j);
                courseSum += j;

                // Add comma in between numbers
                System.out.print(", ");
            }

            cumulativeCryptoSkill += courseSum;

            System.out.println(" ==> The CryptoSkill value " + cumulativeCryptoSkill + ".");

            // Formatting
            System.out.println();
        }

        // Display final message
        System.out.println("Thank you for using my bespoke Concordia mid-degree Meritas Program!");

        // Close scanner
        scanner.close();
    }
}
