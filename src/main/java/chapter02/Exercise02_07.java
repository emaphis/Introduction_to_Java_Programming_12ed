/*
 * Chapter 2
 * Section 2.2–2.13
 * Exercise 2.7
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the maximum number of years and remain
 * ing days for the minutes. For simplicity, assume that a year has 365 days.
 */
package chapter02;

import java.util.Scanner;

/**
 * A program that prompts the user to enter the minutes (e.g., 1 billion),
 * and displays the maximum number of years and remaining days for the minutes.
 *
 * @author emaph
 */
public class Exercise02_07 {
  public static void main(String[] args) {
    final int MINUTES_PER_DAY = 24 * 60;
    final int MINUTES_PER_YEAR = 365 * MINUTES_PER_DAY;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of minutes: ");
    int minutes = input.nextInt();

    int years = minutes / MINUTES_PER_YEAR;
    int remainingMinutes = minutes % MINUTES_PER_YEAR;
    int days = remainingMinutes / MINUTES_PER_DAY;
    System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days" );
  }
}

/*
  Enter the number of minutes: 1000000000
  1000000000 minutes is approximately 1902 years and 214 days
*/
