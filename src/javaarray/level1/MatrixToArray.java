package Javaarray.level1;

import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        // Take input for the 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // b. Create 1D array of size rows*columns
        int[] array = new int[rows * columns];
        int index = 0;

        // c & d. Nested loops to copy elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display the 1D array
        System.out.println("\nElements of the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
