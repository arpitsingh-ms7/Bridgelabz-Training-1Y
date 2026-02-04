package Javaarray.level2;

import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // a. Input age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // b. Find youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // c. Display results
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] +
                " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] +
                " with height " + heights[tallestIndex] + " cm.");

        sc.close();
    }
}
