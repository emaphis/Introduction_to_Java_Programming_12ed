/*
    Chapter 2
    Class for testing code.
 */
package chapter03;

public class Test {

  public static void main(String[] args) {
    int x = 3;
    int y = 3;
    if (x > 2) {
      if (y > 2) {
        int z = x + y;
        System.out.println("z is " + z);
      } else {
        System.out.println("x is " + x);
      }
    }
  }
}
