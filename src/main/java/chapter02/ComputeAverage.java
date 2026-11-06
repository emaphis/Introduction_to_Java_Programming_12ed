/*
 * Chapter 2
 * 2.3 Reading Input from the Console
 * Listing 2.3 ComputeAverage.java
 */
package chapter02;

import java.util.Scanner;

/**
 * An example of reading multiple inputs from the keyboard. The program reads
 * three numbers and displays their average.
 *
 * @author emaph
 */
public class ComputeAverage {

  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    //  Prompt the user to enter three numbers
    System.out.print("Enter three numbers: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();

    // Compute average
    double average = (number1 + number2 + number3) / 3;

    // Display results
    System.out.println("The average of " + number1 + " " + number2
        + " " + number3 + " is " + average);
  }
}

/*
Enter three numbers: 1 2 3
The average of 1.0 2.0 3.0 is 2.0

Enter three numbers: 10.5
11
11.5
The average of 10.5 11.0 11.5 is 11.0
 */
