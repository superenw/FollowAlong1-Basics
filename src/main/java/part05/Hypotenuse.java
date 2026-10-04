package part05;
// Imports the Scanner class so the program can read user input
import java.util.Scanner;
// Declares a public class named Hypotenuse
public class Hypotenuse {
    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Declares a double variable named x
        double x;
        // Declares a double variable named y
        double y;
        // Declares a double variable named z
        double z;
        // Creates a Scanner object that reads input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Asks the user to enter the length of side x
        System.out.println("Enter side x: ");
        // Reads the user's number and stores it in x
        x = scanner.nextDouble();
        // Asks the user to enter the length of side y
        System.out.println("Enter side y: ");
        // Reads the user's number and stores it in y
        y = scanner.nextDouble();
        // Calculates the hypotenuse using the Pythagorean theorem
        z = Math.sqrt((x * x) + (y * y));
        // Prints the calculated hypotenuse
        System.out.println("The hypotenuse is: " + z);
        // Closes the Scanner because the program is finished reading input
        scanner.close();
    }
}