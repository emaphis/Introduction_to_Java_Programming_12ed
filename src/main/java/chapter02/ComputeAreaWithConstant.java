/*
  * Chapter 20
  * Section 2.7 Named Constants
  * Listing 2.4 ComputeAreaWithConstant.java
 */
package chapter02;

import java.util.Scanner; // Scanner is in the java.util package

/**
 *
 * @author emaph
 */
public class ComputeAreaWithConstant {
  public static void main(String[] args) {
    final double PI = 3.14159; // Declare a constant

    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a radius
    System.out.print("Enter a number for radius: ");
    double radius = input.nextDouble();

    // Compute area
    double area = radius * radius * PI;

    // Display results
    System.out.println("Te area for the circle of radius "
        + radius + " is " + area);
  }
}

/*
    Enter a number for radius: 2.5
    Te area for the circle of radius 2.5 is 19.6349375

    Enter a number for radius: 23
    Te area for the circle of radius 23.0 is 1661.90111
*/
