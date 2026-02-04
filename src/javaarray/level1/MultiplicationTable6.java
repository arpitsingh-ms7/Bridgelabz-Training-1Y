package Javaarray.level1;

import java.util.Scanner;

public class MultiplicationTable6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take integer input and declare array
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[4]; // for 6,7,8,9

        // b. Use for loop to calculate multiplication table from 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // c. Display the result in required format
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        sc.close();
    }
}
