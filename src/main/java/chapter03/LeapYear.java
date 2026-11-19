/*
 * Chapter 3
 * Section 3.11 Case Study: Determining Leap Year
 * Listing 3.7 LeapYear.java
 */
package chapter03;

import java.util.Scanner;

/**
 * A program that lets the user enter a year and checks whether it is a leap year
 *
 * @author emaph
 */
public class LeapYear {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // Check if the year is a leap year.
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // Display the result
    System.out.println(year + " is a leap year? " + isLeapYear);
  }
}

/*
  Enter a year: 2008
  2008 is a leap year? true

  Enter a year: 1900
  1900 is a leap year? false
*/
