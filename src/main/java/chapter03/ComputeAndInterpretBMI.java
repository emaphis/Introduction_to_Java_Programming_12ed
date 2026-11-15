/*
 * Chapter 3
 * Section 3.8 Case Study: Computing Body Mass Index
 * Listing 3.4 ComputeAndInterpretBMI.java
 */
package chapter03;

import java.util.Scanner;

/**
 * A program that prompts the user to enter a weight in pounds and height in
 * inches and displays the BMI
 * .
 * @author emaph
 */
public class ComputeAndInterpretBMI {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter weight in pounds
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();

    // Prompt the user to enter height in inches
     System.out.print("Enter height in inches: ");
    double height = input.nextDouble();

    // Contants
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;

    // Compute BMI
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;
    double bmi = weightInKilograms / (heightInMeters * heightInMeters);

    // Display resutl
    System.out.println("BMI is " + bmi);
    if (bmi < 18.5)
      System.out.println("Underweight");
    else if (bmi < 25)
      System.out.println("Normal");
    else if (bmi < 30)
      System.out.println("Overweight");
    else
      System.out.println("Obese");
  }
}

/*
  Enter weight in pounds: 146
  Enter height in inches: 70
  BMI is 20.948603801493316
  Normal
*/
