/*
 * Chapter 3
 * Section 3.2
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
 * `ax2 + bx + c = 0` can be obtained using the following formula:
 *
 * `b^2 - 4*a*c is called the discriminant of the quadratic equation. If it is positive,
 # the equation has two real roots. If it is zero, the equation has one root. If it is nega
 * tive, the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 * has no real roots.”
 */
package chapter03;

import java.util.Scanner;

/**
 * A a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant.
 *
 * @author emaph
 */
public class Exercise03_01 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter values for a, b, and c.
    System.out.print("Enter a, b, c: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    // Calculate the discriminant.
    double discriminant = Math.pow(b*b - 4.0 * a * c, 0.5);

    // Calculate roots and output roots
    if (discriminant > 0.0) {
      double root1 = (-b + discriminant) / (2 * a);
      double root2 = (-b - discriminant) / (2 * a);
      System.out.println("The equation has two roots " + root1 + " and " + root2);
    }
    else if (discriminant == 0) {
      double root = (-b + discriminant) / (2 * a);
      System.out.println("The equation has one root " + root);
    } else
      System.out.println("The equation has no real roots");
  }
}

/*
  Enter a, b, c: 1.0 3 1
  The equation has two roots -0.3819661.00112501051 and -2.618033988749895

  Enter a, b, c: 1 2.0 1
  The equation has one root -1.0

  Enter a, b, c: 1 2 3
  The equation has no real roots
*/
