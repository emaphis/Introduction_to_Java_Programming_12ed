/*
 * Chapter 1
 * Exercise 1.11 (Population projection)
 */
package chapter01;

/**
 * A program to display the population for each of the next five years.
 *
 * @author emaph
 */
public class Exercise01_11 {

  public static void main(String[] args) {
    System.out.print("Year 1 projection: ");
    System.out.println(312032486
        + (((31536000 / 7)
        - (31536000 / 13)
        + (31536000 / 45)) * 1));

    System.out.print("Year 2 projection: ");
    System.out.println(312032486
        + (((31536000 / 7)
        - (31536000 / 13)
        + (31536000 / 45)) * 2));

    System.out.print("Year 3 projection: ");
    System.out.println(312032486
        + (((31536000 / 7)
        - (31536000 / 13)
        + (31536000 / 45)) * 3));

    System.out.print("Year 4 projection: ");
    System.out.println(312032486
        + (((31536000 / 7)
        - (31536000 / 13)
        + (31536000 / 45)) * 4));

    System.out.print("Year 5 projection: ");
    System.out.println(312032486
        + (((31536000 / 7)
        - (31536000 / 13)
        + (31536000 / 45)) * 5));
  }
}

/*
Year 1 projection: 314812582
Year 2 projection: 317592678
Year 3 projection: 320372774
Year 4 projection: 323152870
Year 5 projection: 325932966
 */
