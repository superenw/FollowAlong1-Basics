package part03;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        starts at about 39:25 — stop at about 47:00, after "that is how scanners work"
// Guide: GUIDE.md in this folder, steps 5–11
//
// Part 03, topic 2 — reading what the user types (Scanner)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called UserInput.
//    Leave the "package part03;" line and the "public class UserInput" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part03;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.

// Declares a public class named UserInput
public class UserInput {
    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Creates a Scanner object that reads input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prints a question asking the user for their name
        System.out.println("What is your name? ");
        // Reads the user's input as a String and stores it in the name variable
        String name = scanner.nextLine();
        // Prints a question asking the user for their age
        System.out.println("What is your age? ");
        // Reads the user's input as an integer and stores it in the age variable
        int age = scanner.nextInt();
        // Clears the leftover newline character from the Scanner input
        scanner.nextLine();
        // Prints a question asking the user for their favorite activity
        System.out.println("What is your favorite activity? ");
        // Reads the user's input as a String and stores it in the activity variable
        String activity = scanner.nextLine();
        // Prints a greeting using the name entered by the user
        System.out.println("Hello "+name);
        // Prints the age entered by the user
        System.out.println("You are "+age+" years old");
        // Prints the activity entered by the user
        System.out.println("You like to "+activity);



    }
}
