package Chapter5;
import java.util.Scanner;
/**
 * Program takes votes
 *
 * @author Isaac Dabney
 */


public class P5 {

    /**
     * Main Method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter 'Y' to vote yes");
        System.out.println("Enter 'N' to vote no");
        System.out.println("Enter 'Q' to quit voting");
        int y = 0;
        int n = 0;
        String user;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print(">> ");
            user = input.next();
            if (user.equals("y") || user.equals("Y")) {
                y += 1;
            }
            if (user.equals("n") || user.equals("N")) {
                n += 1;
            }
            if (user.equals("q") || user.equals("Q")) {
                break;
            }
        } while (!"Y".equals(user) || !"y".equals(user) || !"N".equals(user) || !"n".equals(user));
        System.out.printf("Yes Votes: %s \nNo Votes: %s", y, n);
    }
}
