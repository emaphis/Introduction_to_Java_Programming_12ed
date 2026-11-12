/*
 * Chapter 2
 * Section 2.13–2.18
 * Exercise 2.21
 * (Financial application: calculate future investment value) Write a program that 
 * reads in investment amount, annual interest rate, and number of years and dis
 * plays the future investment value using the following formula:
 *
 *  futureInvestmentValue =
 *    investmentAmount * (1 + monthlyInterestRate ^ numberOfYears * 12)
 *
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number 
 * of years 1, the future investment value is 1032.98.
 */
package chapter02;

import java.util.Scanner;

/**
 * Reads the balance and the annual percentage interest rate 
 * and displays the interest for the next month.
 * 
 * @author emaph
 */
public class Exercise02_21 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    // Input the balance and the annual percentage interest rate 
    System.out.print("Enter investment amount: ");
    double investmentAmount = input.nextDouble();
    
    System.out.print("Enter annual interest rate in percentage: ");
    double annualInterestRate = input.nextDouble();
    
    System.out.print("Enter number of years: ");
    double numberOfYears = input.nextDouble();
        
    
    double monthlyInterestRate = annualInterestRate / 1200;
    double futureInvestmentValue =
      investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
  
    // Display results
    System.out.println("Future value is $" + futureInvestmentValue);
  }
}

/*
  Enter investment amount: 1000.56
  Enter annual interest rate in percentage: 4.25
  Enter number of years: 1
  Future value is $1043.9219854307503

-----------
  Enter investment amount: 12000.45
  Enter annual interest rate in percentage: 7.5
  Enter number of years: 5.0
  Future value is $17440.186881801754
*/
