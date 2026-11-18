/*
 * Chapter 3
 * Section 3.3-3.7
 * Exercise 3.8
 * (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 *
 *  Lol, see: <https://codereview.stackexchange.com/questions/38247/inputting-and-sorting-three-integers>
 */
package chapter03;

import java.util.Scanner;

/**
 * A program that prompts the user to enter three integers and display the
 * integers in non-decreasing order.
 *
 * @author emaph
 */
public class Exercise03_08 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter three integers: ");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int temp;

    if (a > b) {
      temp = a;
      a = b;
      b = temp;
    }

    if (b > c) {
      temp = b;
      b = c;
      c = temp;
    }

    if (a > b) {
      temp = a;
      a = b;
      b = temp;
    }

    System.out.println("The sorted numbers are: " + a + ", " + b + ", " + c);
  }
}

/*
  Enter three integers to sort: 2 1 3
  Sorted: 1, 2, 3
*/
