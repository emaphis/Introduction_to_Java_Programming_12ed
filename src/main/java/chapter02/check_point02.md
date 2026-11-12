# Check points - Chapter 2

## 2.2 Writing a Simple Program

### 2.2.1 Identify and fix the errors in the following code

```java
public class Test {
    public void main(string[] args) {  // `string` is unknown type, captialize
        double i = 50.0;
        double k = i + 50.0;
        double j = k + 1;

        System.out.println("j is " + j + " and  // break in string
            k is " + k);
   }
}
```

```java
public class Test {
    public void main(String[] args) {
        double i = 50.0;
        double k = i + 50.0;
        double j = k + 1;

        System.out.println("j is " + j + " and k is " + k);
   }
}
```

## 2.3 Reading Input from the Console

### 2.3.1 How do you write a statement to let the user enter a double value from the keyboard? What happens if you entered 5a when executing the following code?

Scanner input = new Scanner(System.in);
double radius = input.nextDouble();

A. You get a run-time error.

### 2.3.2 Are there any performance differences between the following two import statements?

import java.util.Scanner;
import java.util.*;

A. No performance difference.

## 2.4 Identifiers

### 2.4.1 Which of the following identifiers are valid? Which are Java keywords?

```java
//Valid identifiers:
miles, Test,  $4,  apps, x, y, radius

// Not valid
#44, a++, ––a, 4#R

// Keywords
class, public, int
```

## 2.5 Variables

### 2.5.1 Identify and fix the errors in the following code

```java
public class Test {
    public static void main(String[] args) {
        int i = k + 2;   // Cannot find symbol k
        System.out.println(i);
    }
}
```

```java
public class Test {
    public static void main(String[] args) {
        int k = 1;  
        int i = k + 2;
        System.out.println(i);
    }
}
```

## 2.6  Assignment Statements and Assignment Expressions

### 2.6.1 Identify and fix the errors in the following code

```java
public class Test {
  public static void main(String[] args) {
    int i = j = k = 2;  // Cannot assign and define several vars in one statement.
    System.out.println(i + " " + j + " " + k);
  }
}
```

Fixed:

```java
public class Test {
  public static void main(String[] args) {
    int i, j, k;  
    i = j = k = 2;
  
    System.out.println(i + " " + j + " " + k);
  }
}
```

## 2.7 Named Constants

### 2.7.1 What are the benefits of using constants? Declare an int constant SIZE with value 20

Constants retain the same value for the duration of the program but are a valuable abstraction.

Using names for constants can make code easier to read.

If the value of the constant needs to change it only needs updated in one place

```java
final int SIZE = 20;
```

### 2.7.2 Translate the following algorithm into Java code

Step 1: Declare a double variable named miles with an initial value 100.

Step 2: Declare a double constant named KILOMETERS_PER_MILE with value 1.609.

Step 3: Declare a double variable named kilometers, multiply miles and KILOMETERS_PER_MILE, and assign the result to kilometers.

Step 4: Display kilometers to the console.

```java
double miles = 100;
final double KILOMETERS_PER_MILE = 1.609;
double kilometers = miles * KILOMETERS_PER_MILE;
System.out.println(kilometers);

```

What is kilometers after Step 4?

A. 160.9

## 2.9 Numeric Data Types and Operations

See CheckPoint02_09.java

## 2.10 Numeric Literals

### 2.10.1  How many accurate digits are stored in a float or double type variable?

A `float` has 7 to 8 significant digits

A `double` has 15 to 17 significant digits

### 2.10.2  Which of the following are correct literals for floating-point numbers?

```java
// all are correct

12.3, 12.3e+2, 23.4e-2, -334.4, 20.5, 39F, 40D

// all are doubles but 39F is a float

```

### 2.10.3  Which of the following are the same as 52.534?

```java
// Correct
5.2534e+1, 0.52534e+2, 525.34e-1

// Not
5.2534e+0
```

### 2.10.4 Which of the following are correct literals

5_2534e+1  // valid
_2534      // not valid
5_2        // valid int
5_         // not valid

## 2.12 Evaluating Expressions and Operator Precedence

### 2.12.1 How would you write the following arithmetic expressions in Java?

```java
4 / (3 * (r + 34)) - 9 * (a + b * c) + (3 + d * (2 + a)) / (a + b * d)

5.5 * Math.pow(r + 2.5, 2.5 + t)
```

## 2.13 Case Study: Displaying the Current Time

### 2.13.1 How do you obtain the current second, minute, and hour?

```java
long now = System.currentTimeMillis();
long seconds = now / 1000;
long minutes = second / 60;
long hours = minutes / 60;
```
