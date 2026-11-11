/*
 * Chapter 2
 * Section 2.2–2.13
 * Exercise 2.9
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as given by the following formula:
 *
 *         v1 - v0
 *    a = ---------
 *            t
 *
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * then displays the average acceleration.
 */
package chapter02;

import java.util.Scanner;

/**
 * A program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * then displays the average acceleration.
 *
 * @author emaph
 */
public class Exercise02_09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the starting velocity v0 in meters/second.
    // The ending velocity v1 in meters/second, and the time span t in seconds.
    System.out.print("Enter v0, v1, and t: ");
    double v0 = input.nextDouble();
    double v1 = input.nextDouble();
    double t = input.nextDouble();

    // Calculate the average acceleration
    double acc = (v1 - v0) / t;

    // Display result
    System.out.println("The average acceleration is " + acc);
  }
}

/*
  Enter v0, v1, and t: 5.5 50.9 4.5
  The average acceleration is 10.088888888888889
*/
