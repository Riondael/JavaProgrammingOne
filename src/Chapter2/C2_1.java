package Chapter2;

import java.util.Scanner;

/**
 * Program that converts Celcius to Fahrenheit
 *
 * @author Isaac Dabney
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args command prompt necessity
     */
    public static void main(String[] args) {
        double celcius = 0.0;
        double fahrenheit = 0.0f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celcius>> ");
        celcius = input.nextDouble();
        fahrenheit = (9.0 / 5) * celcius + 32;
        System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit.");
    }

}
