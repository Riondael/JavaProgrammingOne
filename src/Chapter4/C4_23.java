package Chapter4;

/**
 * Program will check if user input is valid
 *
 * @author Isaac Dabney
 */
import java.util.Scanner;

public class C4_23 {

    public static String Major;
    public static String Grade;

    /**
     * Main Method
     *
     * @param args command prompt necessity
     */
    public static void main(String[] args) {
        boolean x = false;
        boolean y = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Majors: ");
        System.out.println("Mathematics(M) || Computer Science(C) || Information Technology(I)");
        System.out.print("Grade: ");
        System.out.println("Freshman(1) || Sophomore(2) || Junior(3) || Senior(4)");
        System.out.println("Please enter a MAJOR and GRADE... e.g; M1 = Mathematics Freshman...");
        System.out.print(">> ");
        String user = input.next();
        if (user.contains("M")) {
            Major = "Mathematics";
            y = true;
        }
        if (user.contains("C")) {
            Major = "Computer Science";

            y = true;
        }
        if (user.contains("I")) {
            Major = "Information Technology";
            y = true;
        }
        if (user.contains("1")) {
            Grade = "Freshman";
            x = true;
        }
        if (user.contains("2")) {
            Grade = "Sophomore";
            x = true;
        }
        if (user.contains("3")) {
            Grade = "Junior";
            x = true;
        }
        if (user.contains("4")) {
            Grade = "Senior";
            x = true;
        }
        if (x & y) {
            System.out.println(Major + " " + Grade);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
