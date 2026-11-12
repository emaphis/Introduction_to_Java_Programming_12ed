/*
 * Exercises completed
 */
package main;

/**
 *
 * @author emaph
 */
public class Completed {

  static int[] exercises = {
    13, // ch 01
    23, // ch 02
  //  0, // ch 03
  //  0, // ch 04
  //  0  // ch 37
  };

  public static void main(String[] args) {
    int sum = 0;
    for (int num : exercises) {
      sum += num;
    }
    System.out.println("I have finished " + exercises.length + " chapters with "
        + sum + " exercises completed. ");
  }

}
