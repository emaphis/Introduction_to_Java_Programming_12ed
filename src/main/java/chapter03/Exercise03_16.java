/*
 * Chapter 3
 * Section 3.8 - 3.16
 * Exercise 3.16
 * (Random point) Write a program that displays a random coordinate in a
 * rectangle. The rectangle is centered at (0, 0) with width 100 and height 200.
 */
package chapter03;

/**
 * A  program that displays a random coordinate in a rectangle.
 * Note:  0,0 is the center of a 100,200 rectangle
 *
 * @author emaph
 */
public class Exercise03_16 {

  public static void main(String[] args) {
    // Calculate the point coordinates.
    double x = Math.random() * 100 - 50;
    double y = Math.random() * 200 - 100;

    // Display the point
    System.out.println("x = " + x + ", y = " + y);
  }
}

/*
  x = 25.098470600355796, y = 91.16172509761768

  x = 25.098470600355796, y = 91.16172509761768

  x = -21.13166929399224, y = 84.19478828997623
*/