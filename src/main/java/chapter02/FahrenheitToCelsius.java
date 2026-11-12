/*
  * Chapter 2
  * Section 2.12 Evaluating Expressions and Operator Precedence
  * Listing 2.6 FahrenheitToCelsius.java
 */
package chapter02;

import java.util.Scanner;

/**
   A program that converts a Fahrenheit degree to Celsius
 * @author emaph
 */
public class FahrenheitToCelsius {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble();

    // Convert Fahrenheit to Celsius
    double celsius = (5.0/ 9) * (fahrenheit - 32);
     System.out.println("Fahrenheit " + fahrenheit + " is " +
        celsius + " in Celsius");
  }
}

/*
Enter a degree in Fahrenheit: 100
Fahrenheit 100.0 is 37.77777777777778 in Celsius
*/
