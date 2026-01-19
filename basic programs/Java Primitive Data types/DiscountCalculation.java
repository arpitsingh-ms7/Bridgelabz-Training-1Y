import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter course fee (INR): ");
        double fee = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        
        double discountAmount = (fee * discount) / 100;
        double finalPrice = fee - discountAmount;

        
        System.out.println("Discount Amount = INR " + discountAmount);
        System.out.println("Discounted Price = INR " + finalPrice);

        sc.close();
    }
}
