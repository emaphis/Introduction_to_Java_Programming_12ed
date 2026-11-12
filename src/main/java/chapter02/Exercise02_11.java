/*
 * Chapter X
 * Section2.2–2.13
 * Exercise 2.11
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user 
 * to enter the number of years and display the population after the number of years. 
 * Use the hint in Programming Exercise 1.11 for this program.
 */
package chapter02;

import java.util.Scanner;

/**
 * Enter the number of years and display the population after the number of years.
 * 
 * @author emaph
 */
public class Exercise02_11 {
  public static void main(String[] args) {
    final int POPULATION = 312_032_486;
    final int SEC_PER_YEAR = 365 * 24 * 60 * 60;
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter the number of years
    System.out.print("Enter the number of years: ");
    int years = input.nextInt();
    
    // Calculate the current population
    int birthsPerYear = SEC_PER_YEAR / 7;
    int deathsPerYear = SEC_PER_YEAR / 13;
    int immigrantsPerYear = SEC_PER_YEAR / 45;
    int populationChangePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;
    int currentPopulation = POPULATION + (populationChangePerYear * years);
     
    // Display the result
    System.out.println("The population in " + years + " years is " + currentPopulation);
  }
}

/*
  Enter the number of years: 5
  The population in 5 years is 325932966
*/
