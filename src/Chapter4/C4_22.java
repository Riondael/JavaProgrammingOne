package Chapter4;

import java.util.Scanner;

/**
 * Program calculates Net Pay
 *
 * @author Isaac Dabney
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args command prompt necessity
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = input.next();
        System.out.println("Enter hours worked: ");
        int hours = input.nextInt();
        System.out.println("Enter hourly wage: ");
        double wage = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fwithhold = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double swithhold = input.nextDouble();
        double grossPay = hours * wage;
        double fw = grossPay * fwithhold;
        double sw = grossPay * swithhold;
        double td = fw + sw;
        double netpay = grossPay - td;
        System.out.printf("\nEmployee Name: %s", name);
        System.out.printf("\nHours Worked: %d", hours);
        System.out.printf("\nPayRate: $%.2f", wage);
        System.out.printf("\nGross Pay: $%.2f", grossPay);
        System.out.printf("\nDeductions:\n Federal Witholding (%.2f%%): $%.2f\n State Witholding(%.2f%%): $ % .2f\n Total Deduction: $ % .2f", (fwithhold * 100), fw, (swithhold * 100), sw, (sw + fw));

        System.out.printf("\nNet Pay: $%.2f", netpay);
    }
}
