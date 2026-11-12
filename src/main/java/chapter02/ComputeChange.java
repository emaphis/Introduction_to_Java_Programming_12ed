/*
 * Chapter 2
 * Section 2.18 Case Study: Counting Monetary Units
 * Listing 2.10 ComputeChange.java
 */
package chapter02;

import java.util.Scanner;

/**
 * A program that breaks a large amount of money into smaller units\
 * 
 * @author emaph
 */
public class ComputeChange {
  
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    
    // Receive the amount
    System.out.print("Enter an amount in double, for example 11.56: ");
    double amount = input.nextDouble();
    
    int remainintAmount = (int)(amount * 100);
    
    // Find the number of one dollars
    int numberOfOneDollars = remainintAmount / 100;
    remainintAmount = remainintAmount % 100;
    
    // Find the number of auarters in the ramaining amount
    int numberOfQuarters = remainintAmount / 25;
    remainintAmount = remainintAmount % 25;
    
    // Find the number of dimes in the ramaining amouint
    int numberOfDimes = remainintAmount / 10;
    remainintAmount = remainintAmount % 10;
    
    // Find the number of nickels in remaining amount
    int numberOfNickels = remainintAmount / 5;
    remainintAmount = remainintAmount % 5;
    
    // Find the number of pennies in the ramaining amounmt
    int numberOfPennies = remainintAmount;
    
    // Display results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println(" " + numberOfOneDollars + " dollars");
    System.out.println(" " + numberOfQuarters + " quarters");
    System.out.println(" " + numberOfDimes + " dimes");
    System.out.println(" " + numberOfNickels + " nickels");
    System.out.println(" " + numberOfPennies + " pennies");
  }  
}

/*
Enter an amount in double, for example 11.56: 11.56
Your amount 11.56 consists of
 11 dollars
 6 quarters 
 0 dimes
 0 nickels
 2 pennies
*/
