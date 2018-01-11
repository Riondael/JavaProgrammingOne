package Chapter4;

import java.util.Scanner;

/**
 * Program takes two bidders and sees who is a better and cheaper option to
 * choose from
 *
 * @author Isaac Dabney
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args command prompt necessity
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bidderOne, bidderTwo;
        int workOne, workTwo;
        double wageOne, wageTwo;
        System.out.print("Enter bidder name: ");
        bidderOne = input.next();
        System.out.printf("\nEnter hours for %s: ", bidderOne);
        workOne = input.nextInt();
        System.out.printf("\nEnter wage requestes by %s: ", bidderOne);
        wageOne = input.nextDouble();

        System.out.print("\nEnter second bidder name: ");
        bidderTwo = input.next();
        System.out.printf("\nEnter hours for %s: ", bidderTwo);
        workTwo = input.nextInt();
        System.out.printf("\nEnter wage requestes by %s: ", bidderTwo);
        wageTwo = input.nextDouble();

        double costOne = workOne * wageOne;
        System.out.printf("\n%s's cost will be: %.2f ", bidderOne, costOne);
        double costTwo = workTwo * wageTwo;
        System.out.printf("\n%s's cost will be: %.2f ", bidderTwo, costTwo);

        if (costOne < costTwo) {
            System.out.printf("\n%s is the winner", bidderOne);
            System.out.println("");
            System.out.printf("Cost is: %.2f", costOne);
        }
        if (costTwo < costOne) {
            System.out.printf("\n%s is the winner!", bidderTwo);
            System.out.println("");
            System.out.printf("\nCost is: %.2f", costTwo);
        }
        if (costOne == costTwo && wageOne != wageTwo) {
            if (workOne < workTwo) {
                System.out.printf("\n%s is the winner", bidderOne);
                System.out.println("");
                System.out.printf("Cost is: %.2f", costOne);
            }

            if (workOne > workTwo) {
                System.out.printf("\n%s is the winner!", bidderTwo);
                System.out.println("");
                System.out.printf("\nCost is: %.2f", costTwo);
            }
        }

        if (costOne == costTwo && wageOne == wageTwo) {
            System.out.printf("\n and \n are tied! Both costs are the same...", bidderOne, bidderTwo);
        }

    }
}
