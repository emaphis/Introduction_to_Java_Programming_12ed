/*
 * Chapter 1
 * Exercise 1.7 (Approximate p)
 */
package chapter01;

/**
 * Computing PI with a summation
 *
 * @author emaph
 */
public class Exercise01_07 {

  public static void main(String[] args) {
    System.out.println(4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
    System.out.println(4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
  }
}

/*
    2.9760461760461765
    3.2837384837384844
 */
