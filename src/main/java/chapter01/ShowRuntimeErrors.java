/*
 * 1.10 Programming Errors
 * 1.10.2 Runtime Errors
 * LisTing 1.5 ShowRuntimeErrors.java
 */
package chapter01;

/**
 *
 * @author emaph
 */
public class ShowRuntimeErrors {

  public static void main(String[] args) {
    System.out.println(1 / 0);
  }
}

/*
    org.apache.commons.exec.ExecuteException: Process exited with an error: 1 (Exit value: 1)
 */
