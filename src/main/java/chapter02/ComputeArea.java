/*
 * Chapter 2
 * 2.2 Writing a Simple
 * Listing 2.1 ComputeArea.java
 */
package chapter02;

/**
 * Read in the circle’s radius.
 * <p>
 * Compute the area using the following formula:
 *
 * @author emaph
 */
public class ComputeArea {

  public static void main(String[] args) {
    double radius;
    double area;

    // Step 1:Assign radius
    radius = 20;

    // Step 2: Compute area
    area = radius * radius * 3.14159;

    // Step 3: Display the area
    System.out.println("Te area for the circle of radius "
        + radius + " is " + area);
  }
}

/*
    Te area for the circle of radius 20.0 is 1256.636
 */
