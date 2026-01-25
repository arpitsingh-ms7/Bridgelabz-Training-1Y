import java.util.Scanner;

public class OddEvenBetweenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        }

        sc.close();
    }
}
