/*
 * Chapter 1
 * Exercise 1.13
 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the
 * following 2 * 2 system of linear equation provided that ad – bc is not 0:
 *
 *  ax + by = e      ed - bf        af - ec
 *              x = ---------  y = ---------
 *  cx + dy = f      ad - bc        ad - bc
 *
 * Write a program that solves the following equation and displays the value for
 * x and y
 * (Hint: replace the symbols in the formula with numbers to compute x and y. This
 * exercise can be done in Chapter 1 without using materials in later chapters.)
 *
 *  3.4x + 50.2y = 44.5
 *  2.1x + .55y = 5.9
 */
package chapter01;

/**
 *
 * @author emaph
 */
public class Exercise01_13 {

  public static void main(String[] args) {
    System.out.println("    (44.5 * .55) - (50.2 * 5.9)");
    System.out.println("x = ----------------------------");
    System.out.println("    (3.4  * .55) - (50.2 * 2.1)");
    System.out.println((((44.5 * .55) - (50.2 * 5.9))
        / ((3.4 * .55) - (50.2 * 2.1))));
    System.out.println();
    System.out.println("    (3.4 * 5.9) - (44.5 * 2.1)");
    System.out.println("y = --------------------------");
    System.out.println("    (3.4 * .55) - (50.2 * 2.1)");
    System.out.println((((3.4 * 5.9) - (44.5 * 2.1))
        / ((3.4 * .55) - (50.2 * 2.1))));
  }
}

/*
   (44.5 * .55) - (50.2 * 5.9)
x = ----------------------------
    (3.4  * .55) - (50.2 * 2.1)
2.623901496861419

    (3.4 * 5.9) - (44.5 * 2.1)
y = --------------------------
    (3.4 * .55) - (50.2 * 2.1)
0.7087397392563978
 */
