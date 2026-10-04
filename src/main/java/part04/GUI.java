package part04;

// Imports the JOptionPane class so the program can create pop-up dialog boxes
import javax.swing.JOptionPane;

// Video: [https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s)
//        starts at about 53:11 — stop at about 58:10, at "in conclusion ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 04, topic 2 — pop-up windows with JOptionPane
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called GUI.
//    Leave the "package part04;" line and the "public class GUI" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part04;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.

// Declares a public class named GUI
public class GUI {

    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {

        // Displays an input dialog and stores the user's response in the name variable
        String name = JOptionPane.showInputDialog("What is your name");

        // Displays a message dialog that greets the user using their name
        JOptionPane.showMessageDialog(null, "Hello "+name+"! Nice to meet you!");

        // Displays an input dialog, converts the user's response to an int, and stores it in age
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));

        // Displays the user's age in a message dialog
        JOptionPane.showMessageDialog(null, "You are "+age+" years old.");

        // Displays an input dialog, converts the user's response to a double, and stores it in height
        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height? (in cm)"));

        // Displays the user's height in a message dialog
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall.");

    }
}