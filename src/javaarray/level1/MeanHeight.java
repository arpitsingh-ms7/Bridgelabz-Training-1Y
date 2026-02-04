package Javaarray.level1;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // b. Create double array of size 11
        double[] heights = new double[11];
        double sum = 0.0;

        // Take input from the user
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // c. Calculate the sum of all elements
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // d. Calculate and print mean height
        double mean = sum / 11;
        System.out.println("\nMean height of the football team = " + mean);

        sc.close();
    }
}

