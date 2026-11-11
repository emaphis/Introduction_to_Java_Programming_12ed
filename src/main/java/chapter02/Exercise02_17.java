/*
 * Chapter 2
 * Section 2.2–2.13
 * Exercise 2.17
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone is 
 * not enough to provide the answer. Other factors including wind speed, relative hu
 * midity, and sunshine play important roles in determining coldness outside. In 2001, 
 * the National Weather Service (NWS) implemented the new wind-chill temperature 
 * to measure the coldness using temperature and wind speed. The formula is
 *
 *  twc = 35.74 + 0.6215 * ta - 35.75 * v^0.16 + 0.4275 * ta * v^0.16
 *
 * where 'ta' is the outside temperature measured in degrees Fahrenheit, 'v' is the speed 
 * measured in miles per hour, and 'twc' is the wind-chill temperature. The formula cannot 
 * be used for wind speeds below 2 mph or temperatures below -58°F or above 41°F.
 *
 * Write a program that prompts the user to enter a temperature between -58°F 
 * and 41°F and a wind speed greater than or equal to 2 then displays the wind-chill 
 * temperature. Use Math.pow(a, b) to compute v^0.16.
 */
package chapter02;

import java.util.Scanner;

/**
 * A program that prompts the user to enter a temperature between -58°F and 41°F
 * and a wind speed greater than or equal to 2 then displays the wind-chill 
 * 
 * @author emaph
 */
public class Exercise02_17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // prompts the user to enter a temperature between -58°F and 41°F and a
    // wind speed greater than or equal to 2
    System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
    double ta = input.nextDouble();
    System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
    double v = input.nextDouble();
    
    // Calculate wind-chill temperature
    double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
    
    // Display the results
    System.out.println("The wind chill index is " + twc);
  }
}

/*
  Enter the temperature in Fahrenheit between -58�F and 41�F: 5.3
  Enter the wind speed (>= 2) in miles per hour: 6
  The wind chill index is -5.567068455881625

  Enter the temperature in Fahrenheit between -58�F and 41�F: 20
  Enter the wind speed (>= 2) in miles per hour: 4
  The wind chill index is 14.21540906987616
*/
