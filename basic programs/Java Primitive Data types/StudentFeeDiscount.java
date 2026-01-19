import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {

       
        double fee;

        
        double discountPercent;

       
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter Student Fee: ");
        fee = input.nextDouble();

        
        System.out.print("Enter University Discount (%): ");
        discountPercent = input.nextDouble();

       
        double discount = (fee * discountPercent) / 100;

        
        double finalFee = fee - discount;

       
        System.out.println("Discount Amount = " + discount);
        System.out.println("Fee to be Paid = " + finalFee);

        input.close();
    }
}
