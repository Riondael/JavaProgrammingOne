package Chapter5;

import java.util.Scanner;
import java.util.Random;

/**
 * Program that literally just plays "Rock, Paper, Scissors".
 *
 * @author Isaac Dabney
 */
public class C5_34 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        String user;
        int plays = 0;
        int playerScore = 0;
        int pcuScore = 0;
        String choice = "";
        System.out.println("Welcome to 'Ro Sham Bo!'");
        System.out.println("Enter the corresponding letters to select your move!");
        System.out.println("Scissors>> 's'(1)");
        System.out.println("Rock>> 'r'(2)");
        System.out.println("Paper>> 'p'(3)");
        System.out.println("-------------------------------------------------------");
        while (plays != 4) {
            int pc = rand.nextInt(3) + 1;

            if (pc == 1) {
                choice = "s";
            }

            if (pc == 2) {
                choice = "r";
            }

            if (pc == 3) {
                choice = "p";
            }

            System.out.printf("\n\n>>");

            user = input.nextLine();

            if (user.equalsIgnoreCase("s") && pc != 1 && pc != 2 || user.equalsIgnoreCase("r") && pc != 2 && pc != 3 || user.equalsIgnoreCase("3") && pc != 3 & pc != 1) {
                ++playerScore;
                ++plays;
                System.out.printf("You chose: %s\nPC chose: %s", user, choice);
                System.out.printf("\nPC SCORE: %s \nUSER SCORE: %s", pcuScore, playerScore);

            } else {
                ++pcuScore;
                ++plays;
                System.out.printf("You chose: %s\nPC chose: %s", user, choice);
                System.out.printf("\nPC SCORE: %s \nUSER SCORE: %s", pcuScore, playerScore);

            }
        }

    }
}
