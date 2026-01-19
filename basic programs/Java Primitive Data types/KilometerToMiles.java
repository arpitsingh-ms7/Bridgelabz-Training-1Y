import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {

        // Variable declaration
        double km;

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Conversion formula (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}
