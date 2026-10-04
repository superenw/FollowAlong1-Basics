package part05;

// Imports the Scanner class so the program can read user input
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        Math class starts at about 58:38 — stop at about 61:29, "here's a project"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 05 — the Math class: max, min, abs, sqrt, round, ceil, floor
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called MathMethods.
//    Leave the "package part05;" line and the "public class MathMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

// Declares a public class named MathMethods
public class MathMethods {
    // Defines the main method, which is the entry point of the program
    public static void main(String[] args){
        // Declares a double variable named x
        double x;
        // Declares a double variable named y
        double y;
        // Declares a double variable named z
        double z;
        // Creates a Scanner object that reads input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prints a message asking the user to enter the value of side x
        System.out.println("Enter side x: ");
        // Reads a double from the user and stores it in x
        x = scanner.nextDouble();
        // Prints a message asking the user to enter the value of side y
        System.out.println("Enter side y: ");
        // Reads a double from the user and stores it in y
        y = scanner.nextDouble();
        // Uses Math.sqrt() to calculate the hypotenuse and stores the result in z
        z = Math.sqrt((x*x)+(y*y));
        // Prints the calculated hypotenuse to the console
        System.out.println("The hypotenuse  is: "+ z);
        // Closes the Scanner after the program is finished reading input
        scanner.close();
    }
}