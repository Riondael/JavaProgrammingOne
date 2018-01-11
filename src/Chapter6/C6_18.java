package Chapter6;

import java.util.Scanner;

/**
 * Program that tests whether the String it is given, qualifies for a good
 * password
 *
 * @author Isaac Dabney
 */
public class C6_18 {

    public int counter = 0;

    /**
     * Main method
     *
     * @param args command prompt necessity
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Rules:");
        System.out.print("\nMust have 8 characters\nMust consist of only numbers and letters\nMust contain at least 2 digits");
        System.out.print("\nEnter a pass>> ");
        String user = input.next();

        checkValidity(user);

        checkAmount(user);

        checkInts(user);

        System.out.println("VALID PASSWORD");
    }

    /**
     * checkAmount method
     *
     * @param user password
     */
    public static void checkAmount(String user) {
        if (user.length() < 8) {
            user = "ERROR";
            System.out.println(user + " Too short");
            System.exit(0);
        }
    }

    /**
     * checkValidity method
     *
     * @param user password
     */
    public static void checkValidity(String user) {
        for (int x = 0; x < user.length(); ++x) {
            if (!Character.isLetterOrDigit(user.charAt(x))) {
                user = "ERROR";
                System.out.println(user + " Contains invalid character");
                System.exit(0);
            }
        }
    }

    /**
     * checkInts method
     *
     * @param user password
     */
    public static void checkInts(String user) {
        int counter = 0;
        for (int x = 0; x < user.length(); ++x) {
            if (Character.isDigit(user.charAt(x))) {
                ++counter;
            }
        }
        if (counter < 2) {
            user = "ERROR";
            System.out.print(user + " Not enough integers\n");
            System.exit(0);
        }
    }

}
