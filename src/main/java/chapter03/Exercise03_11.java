/*
 * Chapter 3
 * Section 3.8–3.16
 * Exercise 3.11
 * (Find the number of days in a month) Write a program that prompts the user
 * to enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should display
 * that February 2012 has 29 days. If the user entered month 3 and year 2015, the
 * program should display that March 2015 has 31 days.
 */
package chapter03;

import java.util.Scanner;

/**
 * A program that prompts the user to enter the month and year and displays
 * the number of days in the month.
 *
 * @author emaph
 */
public class Exercise03_11 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get month and year from user
    System.out.print("Enter a month: ");
    int month = input.nextInt();
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // Check for leap year
    boolean isLeapYear =
        (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    int febDays = (isLeapYear ? 29 : 28);

    String output;
    if (month == 1)
      output = "January " + year + " has 31 days";
    else if (month == 2)
       output = "February " + year + " has " + febDays + " days";
    //else if
  }
}
