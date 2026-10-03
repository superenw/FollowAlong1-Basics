package part01;

// Video: [https://www.youtube.com/watch?v=xk4_1vDrzzo&t=750s](https://www.youtube.com/watch?v=xk4_1vDrzzo\&t=750s)
//        rewatch 12:30–17:30 if you forget how print, \n, \t, \" or \\ work
// Guide: GUIDE.md in this folder, steps 3–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

// Declares a public class named Stretch
public class Stretch {

    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {

        // Uses print() to display "A" without moving to a new line
        System.out.print("A");

        // Uses println() to display "B" and then moves to a new line
        System.out.println("B");

        // Uses the \n escape sequence to print "C" and move to a new line
        System.out.print("C\n");

        // Uses \t for a tab and \\ to print a backslash
        System.out.println("\tD\\");

        // Uses \" escape sequences to print quotation marks around E
        System.out.println("\"E\"");

        // Uses println() to print "F" and move to a new line
        System.out.println("F");

        // Uses print() to display "G" without automatically moving to a new line
        System.out.print("G");

        // Uses println() with no text to move to a new line
        System.out.println();

//AB
//C
//  D\
//"E"
//F
//G

    }
}