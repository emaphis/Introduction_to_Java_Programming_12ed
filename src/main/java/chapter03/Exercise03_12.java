/*
 * Chapter 3
 * Section 3.8 - 3.16
 * Exercise 3.12
 * (Palindrome integer) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer. An integer is palindrome
 * if it reads the same from right to left and from left to right. A negative integer is
 * treated the same as a positive integer
 */
package chapter03;

import java.util.Scanner;

/**
 * A program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer
 *
 * @author emaph
 */
public class Exercise03_12 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a three-digit integer: ");
    int number = input.nextInt();

    // find the digits
    int remainder = number;
    int digit3 = remainder % 10;
    remainder /= 10;
    // int digit2 = remainder %10;
    remainder /= 10;
    int digit1 = remainder %10;

    String label = (digit1 == digit3) ? " is a" : " is not a";
    System.out.println(number + label + " palindrome");
  }
}

/*
  Enter a three-digit integer: 121
  121 is a palindrome

  Enter a three-digit integer: 122
  122 is not a palindrome
*/
