import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter unit price of the item: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity to be bought: ");
        int quantity = input.nextInt();

        // Calculation
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("Total price = " + totalPrice);

        input.close();
    }
}

