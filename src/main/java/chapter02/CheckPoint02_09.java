/*
  * Chapter 2
  * Section 2.9 Numeric Data Types and Operations
  * Check Point 2.9
 */
package chapter02;

/**
 *
 * @author emaph
 */
public class CheckPoint02_09 {

  public static void main(String[] args) {
    System.out.println("2.9.1 Find the largest and smallest byte, short, int, long, float, and double. ");
    System.out.println("Largest byte: " + Byte.MAX_VALUE);   // 127
    System.out.println("Smallest byte: " + Byte.MIN_VALUE);  // -128
    System.out.println("Largest short: " + Short.MIN_VALUE); // -32768
    System.out.println("Smallest shortL " + Short.MAX_VALUE); // 32767
    System.out.println("Largest int: " + Integer.MIN_VALUE);  // -2147483648
    System.out.println("Smallest int: " + Integer.MAX_VALUE); // 2147483647
    System.out.println("Largest long: " + Long.MIN_VALUE);    // -9223372036854775808
    System.out.println("Smallest long: " + Long.MAX_VALUE);   // 9223372036854775807
    System.out.println("Largest float: " + Float.MAX_VALUE);  // 3.4028235E38
    System.out.println("Smallest float: " + Float.MIN_VALUE); //  1.4E-45
    System.out.println("Largest double: " + Double.MAX_VALUE);  // 1.7976931348623157E308
    System.out.println("Smallest double: " + Double.MIN_VALUE); // 4.9E-324

    System.out.println("\n2.9.2 Show the result of the following remainders:");
    System.out.println("56 % 6: " + (56 % 6));    // 2
    System.out.println("78 % -4: " + (78 % 4));   // 2
    System.out.println("-34 % 5: " + (-34 % 5));  // -4
    System.out.println("34 % 5: " + (34 % 5));    // 4
    System.out.println("5 % 1: " + (5 % 1));      // 0
    System.out.println("1 % 5: " + (1 % 5));      // 1

    System.out.println("\n2.9.2 Show the result of the following remainders:");
    System.out.println("100 days after Tuesday: " + ((2+100) % 7)); // 4 = Thursday

    // 2.9.4 What is the result of 25 / 4? How would you rewrite the expression if you wished
    //       the result to be a floating-point number?
    System.out.println("\nResult of 25 / 4: " + (25 / 4)); // 6
    System.out.println("Result of 25.0 / 4.0: " + (25.0 / 4.0)); // 6.25

    // 2.9.5 Show the result of the following code:
    System.out.println("");
    System.out.println(2 * (5 / 2 + 5 / 2));    // 8
    System.out.println(2 * 5 / 2 + 2 * 5 / 2);  // 10
    System.out.println(2 * (5 / 2));            // 4
    System.out.println(2 * 5 / 2);              // 5

    // 2.9.6 Are the following statements correct? If so, show the output.
    System.out.println("");
    System.out.println("25 / 4 is " + 25 / 4);          // 25 / 4 is 6
    System.out.println("25 / 4.0 is " + 25 / 4.0);      // 25 / 4.0 is 6.25
    System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);    // 3 * 2 / 4 is 1
    System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);// .0 * 2 / 4 is 1.5

    // 2.9.7 Write a statement to display the result of 2^3.5.
    System.out.println("\n2^3.5: " + (Math.pow(2, 3.5))); // 11.313708498984761

    // 1.0 * m * (r * r)
  }
}
