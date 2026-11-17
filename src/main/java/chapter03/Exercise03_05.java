/*
 * Chapter 3
 * Section Sections 3.3–3.7
 * Exercise 3.5
 * (Random month) Write a program that randomly generates an integer between 1
 * and 12 and displays the English month names January, February, . . . , December
 * for the numbers 1, 2, . . . , 12, accordingly.
 */
package chapter03;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class Exercise03_05 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final int DAYS_IN_A_WEEK = 7;

    // Prompt user foy day and days ellapesed.
    System.out.print("Enter today's day: ");
    int day = input.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    int elapesed = input.nextInt();

    String dayName;
    if (day == 0)
      dayName = "Sunday";
    else if (day == 1)
      dayName = "Monday";
    else if (day == 2)
      dayName = "Tuesday";
    else if (day == 3)
      dayName = "Wednesday";
    else if (day == 4)
      dayName ="Thursday";
    else if (day == 5)
      dayName = "Friday";
    else
      dayName = "Saturday";

    int nextDay = (day + elapesed) % 7;

    String nextName;
    if (nextDay == 0)
      nextName = "Sunday";
    else if (nextDay == 1)
      nextName = "Monday";
    else if (nextDay == 2)
      nextName = "Tuesday";
    else if (nextDay == 3)
      nextName = "Wednesday";
    else if (nextDay == 4)
      nextName ="Thursday";
    else if (nextDay == 5)
      nextName = "Friday";
    else
      nextName = "Saturday";

    // Display output.
    System.out.println("Today is " + dayName + " and the future day is " + nextName);
  }
}

/*
  Enter today's day: 1
  Enter the number of days elapsed since today: 3
  Today is Monday and the future day is Thursday

  Enter today's day: 0
  Enter the number of days elapsed since today: 31
  Today is Sunday and the future day is Wednesday
*/
