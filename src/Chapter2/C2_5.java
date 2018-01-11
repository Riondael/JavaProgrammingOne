package Chapter2;

import java.util.Scanner;

/**
 * Program that will get the total and display it
 *
 * @author Isaac Dabney
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args command prompt necessity
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotal, gratuity, total;
        System.out.print("Enter subtotal($)>> ");
        subtotal = input.nextDouble();
        System.out.print("Enter a 'Gratuity' rate(%)>> ");
        gratuity = input.nextDouble() / 100.0;
        gratuity = gratuity * subtotal;
        total = (gratuity + subtotal);
        System.out.println("Gratuity: " + gratuity + " || TOTAL: " + total);

    }
}
