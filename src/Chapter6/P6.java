package Chapter6;

import java.util.Scanner;

/**
 * Program calculates worth of money
 *
 * @author Isaac Dabney
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args command prompt necessity
     */
    public static void main(String[] args) {
        String user;
        Scanner input = new Scanner(System.in);
        double EuroWorth, PoundWorth, YenWorth, UserAmount;
        String selection;
        double money = 0;
        System.out.print("How many Euros can ONE DOLLAR buy>> ");
        EuroWorth = input.nextInt();//Assigns EuroWorth to user input
        System.out.print("How many Pound Sterlings(Pounds) can ONE DOLLAR buy>> ");
        PoundWorth = input.nextInt();//Assigns PoundWorth to user input
        System.out.print("How many Yen can ONE DOLLAR buy>> ");
        YenWorth = input.nextInt();//Assigns YenWorth to user input
        do {
            System.out.print("Enter 'E' to buy Euros\nEnter 'P' to buy Pounds\nEnter 'Y' to buy Yen>>\n>> ");
            selection = input.next();
            System.out.print("Enter the amount of dollars to convert>> ");
            UserAmount = input.nextInt();
            if (selection.equalsIgnoreCase("E")) {
                money = Conversion(UserAmount, EuroWorth);
                System.out.printf("When ONE DOLLAR is worth:%s\nAmount of dollars: %s; buys %s %s ", EuroWorth, UserAmount, money, selection.toUpperCase());
            }
            if (selection.equalsIgnoreCase("Y")) {
                money = Conversion(UserAmount, YenWorth);
                System.out.printf("When ONE DOLLAR is worth:%s\nAmount of dollars: %s; buys %s ", EuroWorth, UserAmount, money, selection.toUpperCase());
            }
            if (selection.equalsIgnoreCase("P")) {
                money = Conversion(UserAmount, PoundWorth);
                System.out.printf("When ONE DOLLAR is worth:%s\nAmount of dollars: %s; buys %s ", EuroWorth, UserAmount, money, selection.toUpperCase());
            }
            System.out.print("\nContinue converting?(Y or N)>> ");
            user = input.next();
        } while (!user.equalsIgnoreCase("N"));
    }

    /**
     * Conversion Method
     *
     * @param UserAmount amount of money the user enters
     * @param Worth amount each bill is worth
     * @return converted currency
     */
    public static double Conversion(double UserAmount, double Worth) {
        double money = 0;
        if (UserAmount > 100) {
            money = (UserAmount * Worth) - (UserAmount * 0.05);
        }
        if (UserAmount <= 100) {
            money = (UserAmount * Worth);
            money = money - (money * 0.10);
        }
        return money;
    }

}
