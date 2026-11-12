/*
  * Chapter 2
  * Section 2.2–2.13
  * Exercise 2.2
  * (Compute the volume of a cylinder) Write a program that reads in the radius
  * and length of a cylinder and computes the area and volume using the following
  * formulas:
  *
  *   area = radius * radius * π
  *   volume = area * length
 */
package chapter02;

import java.util.Scanner;

/**
 * A program that reads in the radius and length of a cylinder and
 * computes the area and volume.
 * @author emaph
 */
public class Exercise02_02 {

  public static void main(String[] args) {
    final double PI = 3.14159;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the radius and length of a cylinder: ");
    double radius = input.nextDouble();
    double length = input.nextDouble();

    double area = radius * radius * PI;
    double volume = area * length;

    System.out.println("The area is " + area);
    System.out.println("The volume is " + volume);
  }
}

/*
  Enter the radius and length of a cylinder: 5.5 12
  The area is 95.0330975
  The volume is 1140.39717
*/
