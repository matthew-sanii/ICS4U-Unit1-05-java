/*
* The Dice program randomly chooses a number
* from 1 to 6, and tells the user to guess the number.
*
* @author Matthew Sanii
* @version 1.0
* @since 2021-23-11
*/

import java.util.Scanner;
/**
* This is the Dice program.
*/

final class BoardFoot {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * If this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static double lengthCalculation(double wide, double high) {
         double lengtth;
         lengtth = 144 / (wide * high);
         return lengtth;
}
    /**
    * BoardFoot program.
    * Asks for width and height, tells what length will be.
    */

    public static void main(final String[] args) {
        double width = 0;
        double height = 0;
        System.out.print("This program calculates the length of a wooden " +
                         "board that is 1 board foot in dimension (144 inches³ of wood.) ");
        final Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the width(inch): ");
        try {
            width = input.nextDouble();
            System.out.print("Enter the height(inch): ");
            height = input.nextDouble();
        } catch(java.util.InputMismatchException errorCode) {
            System.out.print("Something wasn't correct.");
            System.out.print("\nDone.");
            System.exit(0);
        }
        double length = lengthCalculation(width, height);
        System.out.print("The board will be " + length + " inches long.");

        System.out.print("\nDone.");
        System.out.print("\n ");
}
}
