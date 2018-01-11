package Chapter5;

import java.util.Scanner;

/**
 * Program that takes a string, reverses it, then outputs the resulting String.
 *
 * @author Isaac Dabney
 */
public class C5_46 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string>> ");
        String user = input.next();
        String userReversed = new StringBuilder(user).reverse().toString();
        System.out.printf("\nYou entered '%s'; the reversed string is '%s'", user, userReversed);
    }
}
