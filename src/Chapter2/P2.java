package Chapter2;

/**
 * Program will add up the prices of food and display total price
 *
 * @author Isaac Dabney
 */
import java.util.Scanner;

public class P2 {

    /**
     * Main Method
     *
     * @param args command prompt necessity
     */
    public static void main(String[] args) {
        double meal, drink, dessert, tax, tip;
        Scanner input = new Scanner(System.in);
        System.out.print("Meal Price(Double): ");
        meal = input.nextDouble();
        System.out.print("Drink Price(Double):");
        drink = input.nextDouble();
        System.out.print("Dessert Price(Double):");
        dessert = input.nextDouble();
        tax = (meal + drink + dessert) * .10;
        tip = (meal + drink + dessert + tax) * .15;
        double total = meal + drink + dessert + tax + tip;
        System.out.println("Meal: " + meal);
        System.out.println("Drink: " + drink);
        System.out.println("Dessert: " + dessert);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);
    }
}
