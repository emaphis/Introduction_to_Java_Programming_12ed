/*
 * Chapter 1
 * Exercise 1.12 (Average speed in kilometers)
 */
package chapter01;

/**
 * A program that displays the average speed in kilometers per hour. (Note 1
 * mile is equal to 1.6 kilometers.)
 *
 * @author emaph
 */
public class Exercise01_12 {

  public static void main(String[] args) {
    System.out.print("Average speed: ");
    System.out.println((24 / (1 + (40 / 60.0) + (35 / 3600.0))) * 1.6);
  }
}

/*
    Average speed: 22.90637945318973
 */
