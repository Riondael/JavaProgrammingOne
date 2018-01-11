package Chapter3;

/**
 * Program is a simple coin flip game
 *
 * @author Isaac Dabney
 */
import java.util.Scanner;

public class C3_14 {

    /**
     * Main Method
     *
     * @param args command prompt necessity
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int RandomNum = (int) (Math.random() * 2);
        String user;
        System.out.println("Heads, or Tails? >> ");
        user = input.nextLine();
        if (RandomNum == 0 && user.equals("heads") || RandomNum == 1
                && user.equals("tails")) {
            System.out.println("Congrats! The coin has landed on 'Heads'!");
        } else if (RandomNum != 0 && user.equals("heads") || RandomNum != 1
                && user.equals("tails")) {
            System.out.println("Oops! The coin has NOT landed on " + user);
        } else {
            System.out.println("AN ERROR HAS OCCURED");
        }
    }
}
