/*
 * Chapter 3
 * Section Sections 3.3–3.7
 * Exercise 3.6
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 * let the user enter weight, feet, and inches. For example, if a person is 5 feet and
 * 10 inches, you will enter 5 for feet and 10 for inches.
 */
package chapter03;

import java.util.Scanner;

/**
 * A program that prompts the user to enter a weight in pounds and height in
 * feet and inches and displays the BMI
 *
 * @author emaph
 */
public class Exercise03_06 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter weight in pounds
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();

    // Prompt user to enter height in feet
    System.out.print("Enter feet: ");
    double feet = input.nextDouble();

    // Prompt the user to enter height in inches
    System.out.print("Enter inches: ");
    double inches = input.nextDouble();

    double height = (feet * 12) + inches;

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
  Enter weight in pounds: 140
  Enter feet: 5
  Enter inches: 10
  BMI is 20.087702275404553
*/
