/*
 * Chapter 2
 * Section 2.13–2.18
 * Exercise 2.20
 * (Financial application: calculate interest) If you know the balance and the an
 * nual percentage interest rate, you can compute the interest on the next monthly 
 * payment using the following formula:
 *
 *  interest = balance * (annualInterestRate / 1200)
 *
 * Write a program that reads the balance and the annual percentage interest rate 
 * and displays the interest for the next month.
 */
package chapter02;

import java.util.Scanner;

/**
 * Program that reads the balance and the annual percentage interest rate 
 * and displays the interest for the next month
 * 
 * @author emaph
 */
public class Exercise02_20 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Reads the balance and the annual percentage interest rate 
    System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
    double balance = input.nextDouble();
    double annualInterestRate = input.nextDouble();
    
    // Calculate the interest
    double interest = balance * (annualInterestRate / 1200);
    
    // Display results
    System.out.println("The interest is " + interest);
  }
}

/*
  Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
  The interest is 2.916666666666667
*/
