package Chapter1;

/**
 * Program that will display the perimeter and area using a radius it's given
 *
 * @author Isaac Dabney
 */
public class C1_8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double radius = 5.5;
        double perimeter = 0;
        double area = 0;
        perimeter = 2 * radius * 3.14;
        area = radius * radius * 3.14;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
