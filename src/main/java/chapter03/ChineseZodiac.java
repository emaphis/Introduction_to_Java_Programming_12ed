/*
 * Chapter 3
 * Section 3.13 switch Statements
 * Listing LisTing 3.9 ChineseZodiac.java
 */
package chapter03;

import java.util.Scanner;

/**
 * A1963 program to find out the Chinese Zodiac sign for a given year.
 * @author emaph
 */
public class ChineseZodiac {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a year: ");
    int year = input.nextInt();

    switch (year % 12) {
      case 0: System.out.println("monkey"); break;
      case 1: System.out.println("rooster"); break;
      case 2: System.out.println("dog"); break;
      case 3: System.out.println("pig"); break;
      case 4: System.out.println("rat"); break;
      case 5: System.out.println("ox"); break;
      case 6: System.out.println("tiger"); break;
      case 7: System.out.println("rabbit"); break;
      case 8: System.out.println("dragon"); break;
      case 9: System.out.println("snake"); break;
      case 10: System.out.println("horse"); break;
      case 11: System.out.println("sheep");
    }
  }
}

/*
  Enter a year: 1963
  rabbit

  Enter a year: 1877
  ox

  Enter a year: 1966
  horse
*/
