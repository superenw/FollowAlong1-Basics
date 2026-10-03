package part00;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//
// Part 00 — your first test. This is practice for part 06. From part 06 on,
// every part's challenge comes with a test like this one.
//
// A test in src/test/java/part00/ChallengeTest.java calls the method below and checks
// what it returns. Right now it returns "" — an empty String — so the test is red.
// Your job: change the one line marked YOUR CODE so the test goes green.

// Declares a public class named Challenge
public class Challenge {

    // Shows examples of what the greeting method should return
    // greeting("Jordan") should return "Hello, Jordan!"
    // greeting("Sam")    should return "Hello, Sam!"

    // Declares a public static method named greeting that takes a String parameter named name
    public static String greeting(String name) {

        // Returns a greeting by combining "Hello, ", the name parameter, and an exclamation mark
        return "Hello, " + name + "!";
    }

}