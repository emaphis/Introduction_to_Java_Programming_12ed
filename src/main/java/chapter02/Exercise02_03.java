/*
 * Chapter 2
 * Section 2.2–2.13
 * Exercise 2.3
 * (Convert feet into meters) Write a program that reads a number in feet,
 * converts it to meters, and displays the result. One foot is 0.305 meter.
 */
package chapter02;

import java.util.Scanner;

/**
 * A program that reads a number in feet, converts it
 * to meters, and displays the result.
 *
 * @author emaph
 */
public class Exercise02_03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final double FEET_PER_METER = 0.305;

    System.out.print("Enter a value for feet: ");
    double feet = input.nextDouble();

    double meters = feet * FEET_PER_METER;
    System.out.println(feet + " feet is " + meters + " meters");
  }
}

/*
Enter a value for feet: 16.5
16.5 feet is 5.0325 meters
*/
