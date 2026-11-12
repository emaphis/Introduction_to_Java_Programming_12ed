/*
 * Chapter 2
 * Section 2.13 Case Study: Displaying the Current Time
 * Listing 2.7 ShowCurrentTime.java
 */
package chapter02;

/**
 * A  program that displays the current time in GMT (Greenwich Mean
 * Time) in the format hour:minute:second, such as 13:19:8.
 * @author emaph
 */
public class ShowCurrentTime {
  public static void main(String[] args) {
    // Obtain the total milliseconds since midnight, Jan 1, 1970
    long totalMilliseconds = System.currentTimeMillis();

    // Obtain the total seconds since midnight, Jan 1, 1970
    long totalSeconds = totalMilliseconds / 1000;

    // Compute the current seconds in the minute in the hour
    long currentSecond = totalSeconds % 60;

    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;

    // Compute the current minute in the hour
    long currentMinute = totalMinutes % 60;

    // Obtain the total hours
    long totalHours = totalMinutes / 60;

    // Compute the current hour
    long currentHour = totalHours % 24;

    // Display results
    System.out.println("Current time is " + currentHour + ":"
      + currentMinute + ":" + currentSecond + " GMT");
  }
}

/*
  Current time is 1:41:25 GMT
*/
