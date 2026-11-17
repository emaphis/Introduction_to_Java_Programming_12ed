/*
 * Chapter 3
 * Section Sections 3.3–3.7
 * Exercise 3.7
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange.
 * java, to display the nonzero denominations only, using singular words for single
 * units such as 1 dollar and 1 penny, and plural words for more than one unit such
 * as 2 dollars and 3 pennies.
 */
package chapter03;

import java.util.Scanner;

/**
 * A program that breaks a large amount of money into smaller units
 *
 * @author emaph
 */
public class Exercise03_07 {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount
    System.out.print("Enter an amount in double, for example 11.56: ");
    double amount = input.nextDouble();

    int remainingAmount = (int)(amount * 100);

    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels in remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;

    // Display results
    System.out.println("Your amount " + amount + " consists of");

    if (numberOfOneDollars == 1)
      System.out.println(" 1 dollar");
    else if (numberOfOneDollars > 1)
      System.out.println(" " + numberOfOneDollars + " dollars");

    if (numberOfQuarters == 1)
      System.out.println(" 1 quarter");
    else if (numberOfQuarters > 1)
      System.out.println(" " + numberOfQuarters + " quarters");

    if (numberOfDimes == 1)
      System.out.println(" 1 dime");
    else if (numberOfDimes > 1)
      System.out.println(" " + numberOfDimes + " dimes");

    if (numberOfNickels == 1)
      System.out.println(" 1 nickle");
    else if (numberOfNickels == 1)
      System.out.println(" " + numberOfNickels + " nickels");

    if (numberOfPennies == 1)
      System.out.println(" 1 penny");
    else if (numberOfPennies > 1)
      System.out.println(" " + numberOfPennies + " pennies");
  }
}

/*
  Enter an amount in double, for example 11.56: 11.56
  Your amount 11.56 consists of
   11 dollars
   2 quarters
   1 nickle
   1 penny
*/
