/*
 * Chapter 3
 * Sections 3.8 - 3.16
 * Exercise 3.14
 * (Game: heads or tails) Write a program that lets the user guess whether the flip
 * of a coin results in heads or tails. The program randomly generates an integer
 * 0 or 1, which represents head or tail. The program prompts the user to enter a
 * guess, and reports whether the guess is correct or incorrect.
 */
package chapter03;

import java.util.Scanner;

/**
 * A program that lets the user guess whether the flip
 * of a coin results in heads or tails.
 *
 * @author emaph
 */
public class Exercise03_14 {

  public static void main(String[] args) {
    // Compute the computers guess
    int computer = (int)(Math.random() * 2);

    // Prompt the user to enter a guess
    Scanner input = new Scanner(System.in);
    System.out.print("Guess heads or tails? " +
      "Enter 0 for heads and 1 for tails: ");
    int guess = input.nextInt();

    // Check the guess
    if (guess == computer)
      System.out.println("Correct guess");
    else if (computer == 0)
      System.out.println("Sorry, it is a heads");
    else
      System.out.println("Sorry, it is a tails");
  }
}

/*
  Guess heads or tails? Enter 0 for heads and 1 for tails: 0
  Correct guess

  Guess head or tails? Enter 0 for heads and 1 for tails: 0
  Sorry, it is a tails

  Guess heads or tails? Enter 0 for heads and 1 for tails: 1
  Sorry, it is a heads
*/
