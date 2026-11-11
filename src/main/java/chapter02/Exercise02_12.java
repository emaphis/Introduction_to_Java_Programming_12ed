/*
 * Chapter 2
 * Section  2.2–2.13
 * Exercise 2.12
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off 
 * speed v, you can compute the minimum runway length needed for an airplane to 
 * take off using the following formula:
 *
 *            v^2
 *  length = -----
 *            2a
 *
 * Write a program that prompts the user to enter v in meters/second (m/s) and 
 * the acceleration a in meters/second squared (m/s2), then, displays the minimum 
 * runway length.
 */
package chapter02;

import java.util.Scanner;

/**
 * A program that prompts the user to enter v in meters/second (m/s) and 
 * the acceleration a in meters/second squared (m/s2), then, displays the minimum 
 * runway length.
 * 
 * @author emaph
 */
public class Exercise02_12 {
  
  public static void main(String[] args) {
    Scanner  input = new Scanner(System.in);
    
    // Propt the user for speed (velocity) and acceleration.
    System.out.print("Enter speed and acceleration: ");
    double v = input.nextDouble();
    double a = input.nextDouble();
    
    // Calculate runway length.
    double lenght = (v * v) / (2 * a);
 
    // Display results
    System.out.println("The minimum runway length for this airplane is " + lenght);
  }
}

/*
  Enter speed and acceleration: 60 3.5
  The minimum runway length for this airplane is 514.2857142857143
*/
