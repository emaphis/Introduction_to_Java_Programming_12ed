/*
 * Chapter 2
 * Section 2.2–2.13
 * Exercise 2.8
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 * the current time in GMT. Revise the program so it prompts the user to enter the
 * time zone offset to GMT and displays the time in the specified time zone.
 */
package chapter02;

import java.util.Scanner;

/**
 * Prompts the user to enter the time zone offset to GMT and displays the
 * time in the specified time zone.
 *
 * @author emaph
 */
public class Exercise02_08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the time zone offset to GMT: ");
    int offset = input.nextInt();

    // Get the current time in total millisoconds since midnight, Jan 1 1970
    long currentTimeMilliseconds = System.currentTimeMillis();

    // Objtain the total seconds since midnight  Jan 1, 1970
    long totalSeconds = currentTimeMilliseconds / 1000;

    // Compute the current second in the minute in the hour
    long currentSecond = totalSeconds % 60;

    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;

    // Compute the current minute in the hour
    long currentMinute = totalMinutes % 60;

    // Obtain the total hours
    long totalHours = (totalMinutes / 60) + offset;

    // Compute the current hour
    long currentHour = totalHours % 24;

     // Display results
     System.out.println("Current time is " + currentHour + ":"
      + currentMinute + ":" + currentSecond + " GMT");
  }
}

/*
  Enter the time zone offset to GMT: -5
  Current time is 19:56:46 GMT
*/
