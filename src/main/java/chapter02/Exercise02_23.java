/*
 * Chapter 2
 * Section 2.13–2.18
 * Exercise 2.23
 * (Cost of driving) Write a program that prompts the user to enter the distance to 
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon.
 * Then displays the cost of the trip.
 */
package chapter02;

import java.util.Scanner;

/**
 * Calculate cost of trip
 * @author emaph
 */
public class Exercise02_23 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //  Prompt the user to enter the distance to drive, the fuel efficiency
    // of the car in miles per gallon, and the price per gallon 
    System.out.print("Enter the driving distance: ");
    double drivingDistance = input.nextDouble();
		
    System.out.print("Enter miles per gallon: ");
	double milesPerGallon = input.nextDouble();
		
    System.out.print("Enter price per gallon: ");
    double pricePerGallon = input.nextDouble();
    
    // Calculate the cost of driving
    double costOfDriving = drivingDistance * pricePerGallon / milesPerGallon;
		
	// Round to the hundredths place
    costOfDriving =  ((int) (costOfDriving * 100)) / 100.0;
    
    // display the result
	System.out.println("The cost of driving is $" + costOfDriving);
  }
}

/*
  Enter the driving distance: 900.5
  Enter miles per gallon: 25.5
  Enter price per gallon: 3.55
  The cost of driving is $125.36
*/
