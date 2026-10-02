package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        starts at about 35:40 — stop at about 38:50, at "your assignment for today"
// Guide: GUIDE.md in this folder, steps 1–4
//
// Part 03, topic 1 — swapping two variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Swap.
//    Leave the "package part03;" line and the "public class Swap" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

// Declares a public class named Swap
public class Swap {
    // Defines the main method, which is the entry point of the program
    public static void main(String[] args){
        // Declares and initializes a String variable named x with the value "Sand"
        String x = "Sand";
        // Declares and initializes a String variable named y with the value "Mud"
        String y = "Mud";
        // Declares a temporary String variable named temp
        String temp;
        // Assigns the value of x to temp so it can be saved during the swap
        temp = x;
        // Assigns the value of y to x
        x=y;
        // Assigns the saved value in temp to y, completing the swap
        y=temp;
        // Prints the new value of x to the console
        System.out.println("x: "+x);
        // Prints the new value of y to the console
        System.out.println("y: "+y);
    }
}
