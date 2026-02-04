package Javaarray.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10;

        // b. Arrays to store salary and years of service
        double[] salaries = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];

        // c. Arrays to store bonus and new salary
        double[] bonusAmount = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        // Variables to store totals
        double totalOldSalary = 0.0;
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;

        // d. Input loop
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            double salaryInput = sc.nextDouble();
            if (salaryInput <= 0) {
                System.out.println("Invalid salary. Please enter again.");
                i--; // decrement index to retry
                continue;
            }

            System.out.print("Years of Service: ");
            double yearsInput = sc.nextDouble();
            if (yearsInput < 0) {
                System.out.println("Invalid years of service. Please enter again.");
                i--; // decrement index to retry
                continue;
            }

            salaries[i] = salaryInput;
            yearsOfService[i] = yearsInput;
        }

        // e. Calculate bonus and new salary
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonusAmount[i] = salaries[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salaries[i] + bonusAmount[i];

            // Update totals
            totalOldSalary += salaries[i];
            totalBonus += bonusAmount[i];
            totalNewSalary += newSalary[i];
        }

        // f. Display results
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] +
                    ", Bonus = " + bonusAmount[i] + ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
