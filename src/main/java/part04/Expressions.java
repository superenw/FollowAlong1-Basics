package part04;

// Video: [https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2888s](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2888s)
//        starts at about 48:08 — stop at about 52:25, at "get started with expressions"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 04, topic 1 — expressions: + - * / % ++ -- and casting
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Expressions.
//    Leave the "package part04;" line and the "public class Expressions" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

// Declares a public class named Expressions
public class Expressions {

    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {

        // Declares and initializes a double variable named friends with the value 10
        double friends = 10;

        // Divides friends by 2 and stores the result back in the friends variable
        friends = (double) friends / 2;

        // Prints the value stored in friends to the console
        System.out.println(friends);

    }
}