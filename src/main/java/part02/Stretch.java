package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 if you forget how to make a variable of each type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {

    public static void main(String[] args) {

        /* MY GUESS:
           7
           7.0
           a + b
           a: 7
           77
           14!
           A
           true
        */

        int a = 7;
        double b = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b");
        System.out.println("a: " + a);
        System.out.println("" + a + a);
        System.out.println(a + a + "!");
        char c = 'A';
        System.out.println(c);
        boolean on = true;
        System.out.println(on);


        // Stretch B1
        String name = "Sando";
        int age = 20;
        double gpa = 4.0;
        boolean commuter = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Commuter: " + commuter);


        // Stretch B2
        char initial = 'S';
        int days = 4;
        double hours = 12.5;
        boolean likesCoding = true;
        String subject = "Java";

        System.out.println(initial + " practices " + subject + " " + days
                + " days a week for " + hours + " hours. Likes coding: " + likesCoding);


        // Stretch B3

        // "string" was incorrect because the String type must start with a capital S
        String city = "Dover";

        // The number is too large for an int, so L is needed to make it a long literal
        long people = 4000000000L;

        // A char uses single quotation marks instead of double quotation marks
        char grade = 'B';

        // A float decimal needs an f at the end
        float temp = 72.5f;

        System.out.println(city + " " + people + " " + grade + " " + temp);

    }
}
