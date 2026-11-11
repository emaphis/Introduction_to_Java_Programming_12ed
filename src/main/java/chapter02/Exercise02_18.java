/*
 * Chapter 2
 * Section  2.2–2.13
 * Exercise 2.18
 * (Print a table) Write a program that displays the following table. Cast 
 * floating-point numbers into integers.
 *    
 *  a   b   pow(a, r)
 *  1   2   1
 *  2   3   8
 *  3   4   81
 *  4   5   1024
 *  5   6   15625
 *S
 */
package chapter02;

/**
 * A program that displays a table of powers
 * 
 * @author emaph
 */
public class Exercise02_18 {
  
  public static void main(String[] args) {
    System.out.println("a   b   pow(a, r)");
    System.out.println("1   2   " + (int)Math.pow(1, 2));
    System.out.println("2   3   " + (int)Math.pow(2, 3));
    System.out.println("3   4   " + (int)Math.pow(3, 4));
    System.out.println("4   5   " + (int)Math.pow(4, 5));
    System.out.println("5   6   " + (int)Math.pow(5, 6));
  }
}

/*
  a   b   pow(a, r)
  1   2   1
  2   3   8
  3   4   81
  4   5   1024
  5   6   15625
*/