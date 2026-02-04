package Javaarray.level2;

import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for a number
        System.out.print("Enter a number: ");
        long number = sc.nextLong(); // use long to handle large numbers

        // b. Find the count of digits
        long temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // c. Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // d. Find the frequency of each digit
        int[] frequency = new int[10]; // indices 0 to 9
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // e. Display the frequency of each digit
        System.out.println("\nDigit frequencies in the number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
