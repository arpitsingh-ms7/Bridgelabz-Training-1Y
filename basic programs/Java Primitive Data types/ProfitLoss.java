import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Cost Price (INR): ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter Selling Price (INR): ");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercent = (profit / costPrice) * 100;

            System.out.println("Profit = INR " + profit);
            System.out.println("Profit Percentage = " + profitPercent + "%");
        } 
        else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercent = (loss / costPrice) * 100;

            System.out.println("Loss = INR " + loss);
            System.out.println("Loss Percentage = " + lossPercent + "%");
        } 
        else {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }
}
