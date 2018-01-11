package Chapter3;

/**
 * Program takes a number and finds out if it's divisible by 5 or 6
 *
 * @author Isaac Dabney
 */
import java.util.Scanner;

public class C3_26 {

    /**
     * Main Method
     *
     * @param args command prompt necessity
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inpt = input.nextInt();
        if ((inpt % 5 == 0) && (inpt % 6 == 0)) {
            System.out.println("Is " + inpt + " divisible by 5 and 6, yes.");
            System.out.println("Is " + inpt + " divisible by 5 or 6, but not both, no.");
        }
        if ((inpt % 5 == 0) || (inpt % 6 == 0)) {
            System.out.println("Is " + inpt + " divisible by 5 or 6, yes");
        }
        if ((inpt % 5 == 0) && (inpt % 6 != 0)) {
            System.out.println("Is " + inpt + " divisible by 5 or 6, but not both, yes");
            System.out.println("Is " + inpt + " divisible by 5 and 6, no.");
        }
        if ((inpt % 5 != 0) && (inpt % 6 == 0)) {
            System.out.println("Is " + inpt + " divisible by 5 or 6, but not both, yes");
            System.out.println("Is " + inpt + " divisible by 5 and 6, no.");
        }
    }
}
