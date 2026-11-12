/*
 * Chapter 2
 * Section 2.2–2.13
 * Exercise 2.4
 * (Convert pounds into kilograms) Write a program that converts pounds into ki-
 * lograms. The program prompts the user to enter a number in pounds, converts it
 * to kilograms, and displays the result. One pound is 0.454 kilogram.
 */
package chapter02;

import java.util.Scanner;

/**
 * A  program that converts pounds into kilograms.
 *
 * @author emaph
 */
public class Exercise02_04 {

  public static void main(String[] args) {
    final double KILOGRAM_PER_POUND = 0.454;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number in pounds: ");
    double pounds = input.nextDouble();

    double kilograms = pounds * KILOGRAM_PER_POUND;
    System.out.println(pounds + " pounds is " + kilograms + " kilograms");
  }
}

/*
  Enter a number in pounds: 55.5
  55.5 pounds is 25.197 kilograms
*/
