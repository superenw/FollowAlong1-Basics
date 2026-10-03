package part01;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=470s
//        starts at 7:50 — stop at about 17:30, at "tips and tricks"
// Guide: GUIDE.md in this folder — the same lesson, written out step by step
//
// Part 01 — print, println, escape sequences, comments
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. So is yours.
//    Leave the "package part01;" line alone. Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Main {
    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Calls the println() method to print "I love the Eagles" to the console and moves to a new line
        System.out.println("I love the Eagles");
        // Calls the println() method and uses escape sequences to print quotation marks around "Go Birds!"
        System.out.println("\"Go Birds!\"");
        // Calls the print() method and uses the \n escape sequence to move to a new line after the text
        System.out.print("I also love the 76ers\n");
        // Calls the println() method and uses escape sequences to print quotation marks around "Go Sixers!"
        System.out.println("\"Go Sixers!\"");

    }

}