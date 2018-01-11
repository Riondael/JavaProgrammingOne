package Chapter2;

/**
 * Program that will find the area and volume using the variables it is given
 *
 * @author Isaac Dabney
 */
import java.util.Scanner;

public class C2_2 {

    /**
     * Main Method
     *
     * @param args command prompt necessity
     */
    public static void main(String[] args) {
        double radius = 0.0;
        double length = 0.0;
        double area = 0.0f;
        double volume = 0.0f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius of a cylinder>> ");
        radius = input.nextDouble();
        System.out.print("Enter a length of a cylinder>> ");
        length = input.nextDouble();
        area = radius * radius * 3.14;
        volume = area * length;
        System.out.println("Area: " + area + " || Volume: " + volume);
    }

}
