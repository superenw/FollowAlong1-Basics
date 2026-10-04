package part05;

// Imports the Random class so the program can generate random values
import java.util.Random;

// Video: [https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3850s](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3850s)
//        random numbers start at about 64:10 — stop at about 68:28
// Guide: GUIDE.md in this folder, steps 11–16
//
// Part 05 — random numbers: nextInt, nextDouble, nextBoolean
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called RandomNumbers.
//    (Do NOT name it Random. Java already has a class called Random.)
//    Leave the "package part05;" line and the "public class RandomNumbers" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

// Declares a public class named RandomNumbers
public class RandomNumbers {
    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Creates a Random object named random
        Random random = new Random();
        // Generates a random integer and stores it in x
        int x = random.nextInt();
        // Generates a random double between 0.0 and 1.0 and stores it in y
        double y = random.nextDouble();
        // Generates a random boolean value and stores it in z
        boolean z = random.nextBoolean();
        // Prints the random integer stored in x
        System.out.println(x);
        // Prints the random double stored in y
        System.out.println(y);
        // Prints the random boolean stored in z
        System.out.println(z);
    }
}