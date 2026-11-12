/*
 * Chapter 2 Example classes from chapber 2
 */
package chapter02;

public class Test {
  public static void main(String[] args) {
    double miles = 100;
    final double KILOMETERS_PER_MILE = 1.609;
    double kilometers = miles * KILOMETERS_PER_MILE;
    System.out.println(kilometers);
  }
}
