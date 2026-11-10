/*
 * Chapter 2
 * Section 2.2–2.13
 * Exercise 2.6
 * (Sum the digits in an integer) Write a program that reads an integer between 0
 * and 1000 and adds all the digits in the integer. For example, if an integer is 932,
 * the sum of all its digits is 14.
 */
package chapter02;

import java.util.Scanner;

/**
 * Reads an integer between 0 and 1000 and adds all the digits in the integer.
 *
 * @author emaph
 */
public class Exercise02_06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000: ");
    int number = input.nextInt();

    int digit1 = number % 10;
    int digit2 = (number / 10) % 10;
    int digit3 = (number / 100) % 10;
    int sum = digit1 + digit2 + digit3;

    System.out.println("The sum of the digits is " + sum);
  }
}

/*
  Enter a number between 0 and 1000: 999
  The sum of the digits is 27

  Enter a number between 0 and 1000: 123
  The sum of the digits is

  Enter a number between 0 and 1000: 56
  The sum of the digits is 11
*/
