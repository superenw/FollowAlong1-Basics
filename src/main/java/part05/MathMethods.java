package part05;

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
    public static void main(String[] args) {
        // Declares and initializes a double variable named x with the value 3.14
        double x = 3.14;
        // Declares and initializes a double variable named y with the value -10
        double y = -10;
        // Uses Math.max() to find the larger value between x and y
        double z = Math.max(x, y);
        // Prints the larger value stored in z
        System.out.println(z);
        // Uses Math.min() to find the smaller value between x and y
        z = Math.min(x, y);
        // Prints the smaller value stored in z
        System.out.println(z);
        // Uses Math.abs() to find the absolute value of y
        z = Math.abs(y);
        // Prints the absolute value stored in z
        System.out.println(z);
        // Uses Math.sqrt() to try to find the square root of y
        z = Math.sqrt(y);
        // Prints the result, which is NaN because y is negative
        System.out.println(z);
        // Changes the value of y to 3.16
        y = 3.16;
        // Uses Math.sqrt() to find the square root of the new value of y
        z = Math.sqrt(y);
        // Prints the square root stored in z
        System.out.println(z);
        // Uses Math.round() to round x to the nearest whole number
        z = Math.round(x);
        // Prints the rounded value
        System.out.println(z);
        // Uses Math.ceil() to round x up to the next whole number
        z = Math.ceil(x);
        // Prints the value rounded up
        System.out.println(z);
        // Uses Math.floor() to round x down to the previous whole number
        z = Math.floor(x);
        // Prints the value rounded down
        System.out.println(z);
    }
}