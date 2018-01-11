package Chapter4;

import java.util.Scanner;

/**
 * Program will take a substring and see if it is inside another string
 *
 * @author Isaac Dabney
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args command prompt necessity
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string>> ");
        String s1 = input.nextLine();
        System.out.print("Enter a substring>> ");
        String sub1 = input.nextLine();
        if (s1.toLowerCase().contains(sub1.toLowerCase())) {
            System.out.println(" String: '" + s1 + "' DOES contain Substring: " + sub1);
        } else {
            System.out.println(" String: '" + s1 + "' DOES NOT contain Substring: " + sub1);
        }
    }
}
