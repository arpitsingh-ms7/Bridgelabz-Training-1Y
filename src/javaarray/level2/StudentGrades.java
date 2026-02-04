package Javaarray.level2;

import java.util.Scanner;

public class StudentGrades {

    // Method to calculate grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Input number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // b. Create arrays for marks, percentage, and grades
        double[][] marks = new double[n][3]; // 0: Physics, 1: Chemistry, 2: Maths
        double[] percentages = new double[n];
        String[] grades = new String[n];

        // c. Input marks for each student with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            // Physics
            double physics;
            do {
                System.out.print("Enter Physics marks: ");
                physics = sc.nextDouble();
                if (physics < 0) {
                    System.out.println("Invalid input! Marks must be positive.");
                }
            } while (physics < 0);
            marks[i][0] = physics;

            // Chemistry
            double chemistry;
            do {
                System.out.print("Enter Chemistry marks: ");
                chemistry = sc.nextDouble();
                if (chemistry < 0) {
                    System.out.println("Invalid input! Marks must be positive.");
                }
            } while (chemistry < 0);
            marks[i][1] = chemistry;

            // Maths
            double maths;
            do {
                System.out.print("Enter Maths marks: ");
                maths = sc.nextDouble();
                if (maths < 0) {
                    System.out.println("Invalid input! Marks must be positive.");
                }
            } while (maths < 0);
            marks[i][2] = maths;

            // d. Calculate percentage and grade
            percentages[i] = (physics + chemistry + maths) / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }

        // e. Display results
        System.out.println("\n---------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-12s %-6s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-12.2f %-6s\n",
                    marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close();
    }
}
