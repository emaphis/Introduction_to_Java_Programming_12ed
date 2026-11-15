/*
 * Chapter 3
 * Section 3.2
 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java,
 * generates two integers and prompts the user to enter the sum of these two
 * integers.
 * Revise the program to generate three single-digit integers and prompt the
 * user to enter the sum of these three integers.
 */
package chapter03;

import java.util.Scanner;

/**
 * program generateS three single-digit integers and prompt the user to enter
 * the sum of these three integers.
 *
 * @author emaph
 */
public class Exercise03_02 {

  public static void main(String[] args) {
    int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis() * 7 % 10);
    int number3 = (int)(System.currentTimeMillis() * 3 % 10);

    int correct = number1 + number2 + number3;

    Scanner input = new Scanner(System.in);
    System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
    int answer = input.nextInt();

     System.out.println(number1 + " + " + number2 + " + " + number3
        + " is " + (correct == answer));
  }
}

/*
  What is 8 + 6 + 4 ? 18
  8 + 6 + 4 is true

  What is 6 + 2 + 8 ? 16
  6 + 2 + 8 is true

  What is 3 + 1 + 9 ? 12
  3 + 1 + 9 is false
*/
