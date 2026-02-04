package Javaarray.level2;
import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            number = -number; // handle negative numbers
        }

        // b. Count digits
        int temp = number;
        int digitCount = 0;
        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp != 0) {
                temp /= 10;
                digitCount++;
            }
        }

        // c. Store digits in an array
        int[] digits = new int[digitCount];
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // d. Create an array to store reversed digits
        int[] reversed = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversed[i] = digits[digitCount - 1 - i];
        }

        // e. Display the reversed array
        System.out.println("\nReversed Number:");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversed[i]);
        }
        System.out.println();

        sc.close();
    }
}
