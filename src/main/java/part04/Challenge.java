package part04;

import javax.swing.JOptionPane;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.


public class Challenge {

    public static void main(String[] args) {

        double mealCost = Double.parseDouble(
                JOptionPane.showInputDialog("What is the cost of the meal?")
        );

        int tipPercent = Integer.parseInt(
                JOptionPane.showInputDialog("What tip percent would you like?")
        );

        int people = Integer.parseInt(
                JOptionPane.showInputDialog("How many people are splitting the bill?")
        );

        double tip = mealCost * tipPercent / 100;
        double total = mealCost + tip;
        double eachPerson = total / people;

        int wholeDollarEach = (int) eachPerson;

        int wholeTotal = (int) total;
        int dollarsShort = wholeTotal % people;

        JOptionPane.showMessageDialog(
                null,
                "Tip: $" + tip + "\nTotal: $" + total
        );

        JOptionPane.showMessageDialog(
                null,
                "Each person pays $" + eachPerson
                        + "\nWhole-dollar amount each: $" + wholeDollarEach
                        + "\nIf everyone pays whole dollars, $" + dollarsShort + " is left over."
        );

    }
}