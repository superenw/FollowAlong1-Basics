package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1340s
//        starts at about 22:20 — stop at about 35:00, after he prints "Hello Bro"
// Guide: GUIDE.md in this folder — the same lesson, written out step by step
//
// Part 02 — variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Variables.
//    Leave the "package part02;" line and the "public class Variables" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Variables {
    public static void main(String[] args) {    // Defines the main method, which is the entry point of the program
        int a;         // Declares an integer variable named a
        a = 1000;        // Assigns the value 1000 to the variable a
        System.out.println("I can count to "+a );        // Prints text along with the value stored in a to the console
        long b;        // Declares a long variable named b
        b= 2000000000000L;        // Assigns a large long integer value to b
        System.out.println("I can really count up to "+b);        // Prints text along with the value stored in b to the console
        byte c = 127;        // Declares and initializes a byte variable named c with the value 127
        System.out.println("I can only count up to "+c);        // Prints text along with the value stored in c to the console
        float d;        // Declares a float variable named d
        d = 6.77f;        // Assigns the decimal value 6.77 to the float variable d
        System.out.println("I can count up to a weird number like "+d);        // Prints text along with the value stored in d to the console
        double e;        // Declares a double variable named e
        e = 15.12345678910;        // Assigns a decimal value to the double variable e
        System.out.println("I can REALLY count up to a weird number like "+e);        // Prints text along with the value stored in e to the console
        boolean f = true;        // Declares and initializes a boolean variable named f with the value true
        System.out.println(f);        // Prints the boolean value stored in f to the console
        boolean g = false;        // Declares and initializes a boolean variable named g with the value false
        System.out.println(g);        // Prints the boolean value stored in g to the console
        char harold = '1';        // Declares and initializes a char variable named harold with the character '1'
        System.out.println(harold);        // Prints the character stored in harold to the console
        String name = "Igloo";        // Declares and initializes a String variable named name with the text "Igloo"
        System.out.println("It's an "+name);        // Prints text along with the String stored in name to the console

    }
}