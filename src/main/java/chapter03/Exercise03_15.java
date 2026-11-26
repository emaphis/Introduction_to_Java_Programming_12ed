/*
 * Chapter 3
 * Sections 3.8 - 3.16
 * Exerciss 3.15
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three
 * digit integer. The program prompts the user to enter a three-digit integer and
 * determines whether the user wins according to the following rules:
 *
 * 1. If the user input matches the lottery number in the exact order, the award is
 *      $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award
 *      is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award
 *      is $1,000.
 */
package chapter03;

import java.util.Scanner;

/**
 * Program prompts the user to enter a three-digit integer and determines
 * whether the user wins
 *
 * @author emaph
 */
public class Exercise03_15 {

  public static void main(String[] args) {
    // Generate a 3 digit lottery number
    int lottery = (int) (Math.random() * 1000);

    // Prompt the user to enter a guess
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (three digits): ");
    int guess = input.nextInt();

    // Get digits from lottery
    int lotteryDigit3 = lottery % 10;
    int remainder = lottery / 10;
    int lotteryDigit2 = remainder % 10;
    remainder /= 10;
    int lotteryDigit1 = remainder % 10;

    // Get digits from guess
    int guessDigit3 = guess % 10;
    remainder = guess / 10;
    int guessDigit2 = remainder % 10;
    remainder /= 10;
    int guessDigit1 = remainder % 10;

    System.out.println("The lottery number is " + lottery);

    // Check the guess
    if (guess == lottery) {
      System.out.println("Exact match: you win $10,000");
    } else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3)
            && (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3)
            && (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)) {
      System.out.println("Match all digits you win $3,000");
    } else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3)
            || (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3)
            || (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)) {
      System.out.println("Match one digit: you win $1,000");
    } else {
      System.out.println("Sorry, no match");

    }
  }
}

/*
  Enter your lottery pick (three digits): 123
  The lottery number is 824
  Match one digit: you win $1,000

  Enter your lottery pick (three digits): 123
  The lottery number is 595
  Sorry, no match
*/
