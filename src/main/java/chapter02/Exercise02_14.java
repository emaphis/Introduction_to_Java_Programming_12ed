/*
 * Chapter 2
 * Section 2.2–2.13
 * Exercise 2.14
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of 
 * health on weight. It can be calculated by taking your weight in kilograms and divid
 * ing, by the square of your height in meters. Write a program that prompts the user to 
 * enter a weight in pounds and height in inches and displays the BMI. Note one pound 
 * is 0.45359237 kilograms and one inch is 0.0254 meters.
 */
package chapter02;

import java.util.Scanner;

/**
 * A program that prompts the user to enter a weight in pounds and height in
 * inches and displays the BMI
 * 
 * @author emaph
 */
public class Exercise02_14 {
  public static void main(String[] args) {
    final double  POUNDS_PER_KG = 0.45359237;
    final double INCH_PER_METER = 0.0254;
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter a weight in pounds and height in inches
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();
    System.out.print("Enter height in inches: ");
    double height = input.nextDouble();
    
    double weightKG = weight * POUNDS_PER_KG;
    double heightMeter = height * INCH_PER_METER;
    
    // Calculate BMI
    double BMI = weightKG / (heightMeter * heightMeter);
    
    // Output results
     System.out.println("BMI is " + BMI);
  }
}

/*
  Enter weight in pounds: 95.5
  Enter height in inches: 50
  BMI is 26.857257942215885
*/
