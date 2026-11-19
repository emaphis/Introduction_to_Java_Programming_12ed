/*
 * Chapter 3
 * Section 3.10 Logical Operators
 * Listing 3.6 TestBooleanOperators.java
 */
package chapter03;

import java.util.Scanner;

/**
 * A program that checks whether a number is divisible by 2 and 3, by 2 or 3,
 * and by 2 or 3 but not both.
 *
 * @author emaph
 */
public class TestBooleanOperators {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive an input
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    if (number % 2 == 0 && number % 3 == 0)
      System.out.println(number + " is divisable by 2 and 3.");

    if (number % 2 == 0 || number % 3 == 0)
      System.out.println(number + " is divisible by 2 or 3.");

    if (number % 2 == 0 ^ number % 3 == 0)
      System.out.println(number + " is divisable by 2 or 3, but not both.");
  }
}

/*
  Enter an integer: 4
  4 is divisible by 2 or 3.
  4 is divisable by 2 or 3, but not both.

  Enter an integer: 18
  18 is divisable by 2 and 3.
  18 is divisible by 2 or 3.

  Enter an integer: 7
*/
