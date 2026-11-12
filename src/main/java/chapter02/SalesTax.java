/*
  * Chapter 2
  * Section 2.16 Numeric Type Conversions
  * Listing 2.8 SalesTax.java
 */
package chapter02;

import java.util.Scanner;

/**
 * Displays the sales tax with two digits after the decimal point
 * 
 * @author emaph
 */
public class SalesTax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter purchase amount: ");
    double purchaseAmount = input.nextDouble();
    
    double tax = purchaseAmount * 0.06;
    System.out.println("Sales tas is $" + (int)(tax * 100) / 100.0);
  }
}

/*
  Enter purchase amount: 197.55
  Sales tas is $11.85
*/
