/*
 * Chapter 3
 * Section 3.2 boolean Data Type, Values, and Expressions
 * Listing LisTing 3.1 AdditionQuiz.java
 */
package chapter03;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class AdditionQuiz {

  public static void main(String[] args) {
    int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis() / 10 % 10);
    
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("What is " + number1 + " + " + number2 + "? ");
    
    int answer = input.nextInt();
    
    System.out.println(number1 + " + " + number2 + " = " + answer + " is " +
        (number1 + number2 == answer));
  }
}

/*
  What is 7 + 0? 7
  7 + 0 = 7 is true

  What is 9 + 6? 11
  9 + 6 = 11 is false
*/
