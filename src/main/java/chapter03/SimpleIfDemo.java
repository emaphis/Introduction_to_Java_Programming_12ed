/*
 * Chapter 3
 * Section 3.3 if Statements
 * Listing LisTing 3.2 SimpleIfDemo.java
 */
package chapter03;

import java.util.Scanner;

/**
 * A  a program that prompts the user to enter an integer. If the number is
 * a multiple of 5, the program displays HiFive. If the number is divisible by 2,
 * it displays HiEven.
 *
 * @author emaph
 */
public class SimpleIfDemo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    if (number % 5 == 0)
      System.out.println("HiFive");

    if (number % 2 == 0)
      System.out.println("HiEven");
  }
}

/*
  Enter an integer: 4
  HiEven

  Enter an integer: 15
  HiFive

  Enter an integer: 30
  HiFive
  HiEven
*/
