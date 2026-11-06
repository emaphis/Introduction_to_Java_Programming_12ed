/*
  * Chapter 2
  * Section 2.9 Numeric Data Types and Operations
  * Subsection 2.9.2 Numeric Operators
  * Listing 2.5 DisplayTime.java
 */
package chapter02;

import java.util.Scanner;

/**
 * Program in Listing 2.5 obtains minutes and remaining seconds from an amount of time
 * in seconds.
 * @author emaph
 */
public class DisplayTime {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user for input
    System.out.print("Enter an integer for seconds: ");
    int seconds = input.nextInt();

    int minutes = seconds / 60;  // Find minutes in seconds
    int remainingSeconds = seconds % 60;  // Seconds remaining
    System.out.println(seconds + " seconds is " + minutes +
        " minutes and " + remainingSeconds + " seconds");
  }
}

/*
Enter an integer for seconds: 500
500 seconds is 8 minutes and 20 seconds

Enter an integer for seconds: 30
30 seconds is 0 minutes and 30 seconds
*/
