/*
 * Chapter 2
 * Section 
 * Section 2.2–2.13
 * Exercise 2.16
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the 
 * side of a hexagon and displays its area. The formula for computing the area of a 
 * hexagon is
 *
 *          3 * sqrt(3)
 *  area = ------------- * s^2
 *              2
 *
 * where 's' is the length of a side.
 */
package chapter02;

import java.util.Scanner;

/**
 * program that prompts the user to enter the 
 * side of a hexagon and displays its area.
 * 
 * @author emaph
 */
public class Exercise02_16 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // program that prompts the user to enter the side of a hexagon and displays its area.
    System.out.print("Enter the length of the side: ");
    double side = input.nextDouble();

    // Calculate the area of the hexagon
    double constant = (3 * Math.pow(3, 0.5)) / 2;
    double area = constant * Math.pow(side, 2);

    // Display the results
    System.out.println("The area of the hexagon is " + area);
  }

}

/*
  Enter the length of the side: 5.5
  The area of the hexagon is 78.59180539343781
*/
