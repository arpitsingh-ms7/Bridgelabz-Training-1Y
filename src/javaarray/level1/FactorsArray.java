package Javaarray.level1;

import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Initial array to store factors
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // c. Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // i is a factor
                // d. If array is full, double its size
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // assign new larger array
                }
                factors[index] = i;
                index++;
            }
        }

        // e. Display the factors
        System.out.println("\nFactors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}

