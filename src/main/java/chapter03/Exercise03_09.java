/*
 * Chapter 3
 * Section 3.3-3.7
 * Exercise 3.9
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
 * which is calculated from the other 9 digits using the following formula
 *
 *  (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
 *    d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
 *
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer.
 */
package chapter03;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class Exercise03_09 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    int inputNumber = input.nextInt();
    int number = inputNumber;

    // Separate digits
    int d9 = number % 10;
    number = number / 10;

    int d8 = number % 10;
    number = number / 10;

    int d7 = number % 10;
    number = number / 10;

    int d6 = number % 10;
    number = number / 10;

    int d5 = number % 10;
    number = number / 10;

    int d4 = number % 10;
    number = number / 10;

    int d3 = number % 10;
    number = number / 10;

    int d2 = number % 10;
    number = number / 10;

    int d1 = number % 10;

    // Calculate and format checksum
    int check = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7
        + d8 * 8 + d9 * 9) % 11;

    // Set label
    String label;
    if (check == 10)
      label = "X";
    else
      label = "" + check;

    System.out.println("The ISBN-10 number is 0" + inputNumber + label);
  }
}

/*
  Enter the first 9 digits of an ISBN as integer: 013601267
  The ISBN-10 number is 0136012671

  Enter the first 9 digits of an ISBN as integer: 013031997
  The ISBN-10 number is 013031997X
*/
