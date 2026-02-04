package Javaarray.level2;

import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            number = -number; // handle negative numbers
        }

        // b. Define array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. Index variable
        int index = 0;

        // d & e. Loop to extract digits
        while (number != 0) {
            int lastDigit = number % 10; // get last digit
            digits[index] = lastDigit;   // store in array
            index++;                     // increment index
            number = number / 10;        // remove last digit

            // f. Stop if maxDigit reached
            if (index == maxDigit) {
                break;
            }
        }

        // g. Variables for largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Loop through array to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // i. Display results
        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
