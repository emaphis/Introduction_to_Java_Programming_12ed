/*
  * Chapter 2
  * Sections 2.2–2.13
  * Exercise 2.1
  * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
  * double value from the console, then converts it to Fahrenheit, and displays the
  * result. The formula for the conversion is as follows:
  *
  *   fahrenheit = (9 / 5) * celsius + 32
  */
package chapter02;

import java.util.Scanner;

/**
 * A program that reads a Celsius degree in a double value from
 * the console, then converts it to Fahrenheit, and displays the result.
 * @author emaph
 */
public class Exercise02_01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a degree in Celsius: ");
    double celsius = input.nextDouble();

    double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }
}

/*
  Enter a degree in Celsius: 43.5
  43.5 Celsius is 110.3 Fahrenheit
*/
