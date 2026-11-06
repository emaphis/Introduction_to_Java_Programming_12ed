/*
 * Chapter 2
 * 2.3 Reading Input from the Console
 * Listing 2.2 ComputeAreaWithConsoleInput.java
 */
package chapter02;

import java.util.Scanner;  // Scanner is in the java.util package

/**
 * Prompt the user to enter a radius, 1calculate area of circle given that
 * radius..
 *
 * @author emaph
 */
public class ComputeAreaWithConsoleInput {

  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a radius
    System.out.print("Enter a number for radius: ");
    double radius = input.nextDouble();

    // Compute area
    double area = radius * radius * 3.14159;

    // Display results
    System.out.println("Te area for the circle of rasdius "
        + radius + " is " + area);
  }
}

/*
    Enter a number for radius: 2.5
    Te area for the circle of rasdius 2.5 is 19.6349375

    Enter a number for radius: 23
    Te area for the circle of rasdius 23.0 is 1661.90111
 */
