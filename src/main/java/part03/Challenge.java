package part03;

import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.


public class Challenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a basketball player:");
        String player = scanner.nextLine();

        System.out.println("Name an opponent:");
        String opponent = scanner.nextLine();

        System.out.println("How many points did the player score?");
        int points = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Name a place to play basketball:");
        String place = scanner.nextLine();

        System.out.println(player + " walked into " + place + " ready for the big game.");
        System.out.println(player + " scored " + points + " points against " + opponent + ".");
        System.out.println("The crowd thought " + player + " had completely taken over the game.");

        String temp = player;
        player = opponent;
        opponent = temp;

        System.out.println("Plot twist: " + player + " became the star, and " + opponent + " became the opponent!");

    }
}