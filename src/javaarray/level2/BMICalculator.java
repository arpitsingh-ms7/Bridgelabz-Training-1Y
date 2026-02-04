package Javaarray.level2;

import java.util.Scanner;

public class BMICalculator {

    // Method to determine weight status based on BMI
    public static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // b. Create arrays to store weight, height, BMI, and status
        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        // c. Input weight and height, calculate BMI and status
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight in kg: ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height in meters: ");
            heights[i] = sc.nextDouble();

            // d. Calculate BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status
            statuses[i] = getWeightStatus(bmis[i]);
        }

        // e. Display results in a table
        System.out.println("\n------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    heights[i], weights[i], bmis[i], statuses[i]);
        }

        sc.close();
    }
}
