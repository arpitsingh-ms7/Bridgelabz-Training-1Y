package Javaarray.level2;

import java.util.Scanner;

public class BMICalculator2D {

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

        // a. Input number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // b. Create 2D array for height, weight, BMI
        double[][] personData = new double[number][3]; // 0: height, 1: weight, 2: BMI
        String[] weightStatus = new String[number];

        // c. Input weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Input weight
            double weight;
            do {
                System.out.print("Enter weight in kg (positive value): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Invalid input! Weight must be positive.");
                }
            } while (weight <= 0);
            personData[i][1] = weight;

            // Input height
            double height;
            do {
                System.out.print("Enter height in meters (positive value): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Invalid input! Height must be positive.");
                }
            } while (height <= 0);
            personData[i][0] = height;

            // d. Calculate BMI and store
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status
            weightStatus[i] = getWeightStatus(bmi);
        }

        // e. Display results
        System.out.println("\n------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}

