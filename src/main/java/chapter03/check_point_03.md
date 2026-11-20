# Check points - Chapter 3

## 3.2 boolean Data Type, Values, and Expressions

### 3.2.1 List six relational operators

// >, <, >=, <=, ==, !=

### 3.2.2 Assuming x is 1, show the result of the following Boolean expressions:

```java
(x > 0)  true
(x < 0)  false
(x != 0) true
(x >= 0) true
(x != 1) false
```

### 3.2.3 Can the  following conversions involving casting be allowed? Write a test program to verify it

```java
boolean b = true;
i = (int)b;
int i = 1;
boolean b = (boolean)i;
```

Can't cast from bool to int and can't cast from int to bool.
Boolean values cannot be cast to other types.

## 3.3 if Statements

### 3.3.1 Write an if statement that assigns 1 to x if y is greater than 0

```java
if (y > 0)
    x = 1
```

### 3.3.2 Write an if statement that increases pay by 3% if score is greater than 90

```java
if (score > 90)
    pay = pay * 1.03;
```

### 3.3.3 What is wrong in the following code?

```java
if radius >= 0
{
  area = radius * radius * PI;
  System.out.println("The area for the circle of " +
" radius " + radius + " is " + area);
}
```

PI, area, and radius are undefined.
The "radius >= 0" needs to be in parentheses.

## 3.4 Two-Way if-else Statements

### 3.4.1 Write an if statement that increases pay by 3% if score is greater than 90, otherwise increases pay by 1%

```java
if (score > 90)
    pay = pay * 1.03
else
    pay = pay * 1.01
```

### 3.4.2 What is the output of the code in (a) and (b) if number is 30? What if number is 35?

```java
// a
if (number % 2 == 0)
  System.out.println(number + "is even.");

System.out.println(number + "is odd");

// b
if (number % 2 == 0)
  System.out.println(number + "is even.");
else
    System.out.println(number + "is odd");
```

```java
int number = 30;

a: 
30 is even.
30 is odd

b: 
30 is even.

int number = 35;

a: 
35 is odd
b: 
35 is odd
```

## 3.5 Nested if and Multi-Way if-else Statements

### 3.5.1 Suppose x = 3 and y = 2; show the output, if any, of the following code. What is the output if x = 3 and y = 4? What is the output if x = 2 and y = 2? Draw a flowchart of the code

```java

if (x > 2) {
    if (y > 2) {
        z = x + y;
        System.out.println("z is " + z);
    }
}
else
  System.out.println("x is " + x);
```

int x = 3
int y = 2
prints nothing.

int x = 3
int y = 4
Prints: z is 7

int x = 2
int y = 2
Prints: x = 2

## 3.5.2  Suppose x = 2 and y = 3. Show the output, if any, of the following code. What is the output if x = 3 and y = 2? What is the output if x = 3 and y = 3?

```java
if (x > 2)
    if (y > 2) {
        int z = x + y;
        System.out.println("z is " + z);
  }
else
    System.out.println("x is " + x);
```

x = 2
y = 3
Prints nothing.  

x = 3
y = 2
Prints: x is 3

x = 3
y = 3
Prints: z is 6

### 3.5.3 What is wrong in the following code?

```java
if (score >= 60)
  System.out.println("D");
else if (score >= 70)
  System.out.println("C");
else if (score >= 80)
  System.out.println("B");
else if (score >= 90)
  System.out.println("A");
else
  System.out.println("F");
```

Logic is backwards.
"D" is selected for grades over 59
"F" grade is selected otherwise.

## 3.6 Common Errors and Pitfalls

### 3.6.1 Which of the following statements are equivalent? Which ones are correctly indented?

A, C, D are equivalent.
B, C are well indented.

### 3.6.2 Rewrite the following statement using a Boolean expression

```java
if (count % 10 == 0)
  newLine = true;
else 
  newLine = false;
```

bool newLine = (count % 10 == 0);

### 3.6.3 Are the following statements correct? Which one is better?

Both are correct.
B is better.

### 3.6.4 What is the output of the following code if number is 14, 15, or 30?

```java
(a)
if (number % 2 == 0) 
  System.out.println(number + " is even"); 
if (number % 5 == 0)
  System.out.println(number + " is multiple of 5"); 

(b)
if (number % 2 == 0) 
  System.out.println(number + " is even"); 
else if (number % 5 == 0)
  System.out.println(number + " is multiple of 5"); 
```

number = 14
A - 14 is even
B - 14 is even

number = 15
A - 15 is a multiple of 5
B - 15 is a multiple of 5

number = 30
A - 30 id even
    30 is a multiple of 5
B - 30 is even

## 3.7 Generating Random Numbers

### 3.7.1 Which of the following is a possible output from invoking Math.random()?

Possible:  0.5, 0.0, 0.234
Impossible: 1.0, 323.4, 34

### 3.7.2

a. How do you generate a random integer i such that 0 <= i <= 20?

(int)(Math.random() * 20)

b. How do you generate a random integer i such that 10 <= i < 20?

(int)(Math.random() * 10) + 10

c. How do you generate a random integer i such that 10 <=  i <= 50?

(int)(Math.random() * 41) + 10

d. Write an expression that returns 0 or 1 randomly.

(int)(Math.random() * 2)

## 3.8 Case Study: Computing Body Mass Index

## 3.9 Case Study: Computing Taxes

### 3.9.1 Are the following two statements equivalent?

```java
if (income <= 10000)
  tax = income * 0.1;
else if (income <= 20000)
  tax = 1000 +
    (income − 10000) * 0.15;
//------------------------------
if (income <= 10000)
  tax = income * 0.1;
else if (income > 10000 &&
         income <= 20000)
  tax = 1000 +
    (income − 10000) * 0.15;
```

Yes  The `(... && income <= 20000)`clause doesn't do anything.

## 3.10 Logical Operators

### 3.10.1 Assuming that x is 1, show the result of the following Boolean expressions:

```java
int x = 1
(true) && (3 > 4)       // false
 !(x > 0) && (x > 0)    // false
 (x > 0) || (x < 0)     // true
 (x != 0) || (x == 0)   // true
 (x >= 0) || (x < 0)    // true
 (x != 1) == !(x == 1)  // true
```

### 3.10.2 (a) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100. (b) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100 or the number is negative

```java
// a
(num > 1) && (num < 100)

// b
(num > 1) && (num < 100) || (num < 0)

```

### 3.10.3 (a) Write a Boolean expression for |x - 5| < 4.5. (b) Write a Boolean expression for |x - 5| > 4.5

```java
// a
(x - 5) < 4.5 && (x - 5) > -4.5

// b
(x - 5) > 4.5 || (x - 5) < -4.5
```

### 3.10.4 Assume x and y are int type. Which of the following are legal Java expressions?

```Java
x > y > 0   // not legal
x = y && y  // not legal
x /= y      // legal
x or y      // not legal
x and y     // not legal
(x != 0) || (x = 0) // not legal, assigns 0 to x
```

## 3.10.5 Are the following two expressions the same?

```java
// a
x % 2 == 0 && x % 3 == 0

// b
x % 6 == 0
```

Yes.

## 3.10.6 What is the value of the expression x >= 50 && x <= 100 if x is 45, 67, or 101?

45 - false
67 - true
101 - false

## 3.10.7 Suppose, when you run the following program, you enter the input 2 3 6 from the console. What is the output?

```java
public class Test {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    double x = input.nextDouble();
    double y = input.nextDouble();
    double z = input.nextDouble();
    
    System.out.println("(x < y && y < z) is " + (x < y && y < z));
    System.out.println("(x < y || y < z) is " + (x < y || y < z));
    System.out.println("!(x < y) is " + !(x < y));
    System.out.println("(x + y < z) is " + (x + y < z));
    System.out.println("(x + y > z) is " + (x + y > z));
  }
}
```

(x < y && y < z) is true
(x < y || y < z) is true
!(x < y) is false
(x + y < z) is true
(x + y > z) is false

### 3.10.8 Write a Boolean expression that evaluates to true if age is greater than 13 and less than 18

```java
int age ...

(age > 13) && (age < 18>)
```

### 3.10.9 Write a Boolean expression that evaluates to true if weight is greater than 50 pounds or height is greater than 60 inches

```java
int weight = ...
int height = ...

(weight > 50) || (height > 60)
```

### 3.10.11 Write a Boolean expression that evaluates to true if either weight is greater than 50 pounds or height is greater than 60 inches, but not both.

```Java
(weight > 50) ^ (height > 60)
```

## 3.11 Case Study: Determining Leap Year

### 3.11.1 How many days in the February of a leap year? Which of the following is a leap year? 500, 1000, 2000, 2016, and 2020?

29 days in a leap year February.

500  - false
1000 - false
2000 - true
2016 - true
2020 - true

## 3.12 Case Study: Lottery

### 3.12.1 What happens if you enter an integer as 05?

One number (0) can't match.

## 3.13 switch Statements

### 3.13.1 What data types are required for a switch variable? If the keyword break is not used after a case is processed, what is the next statement to be executed? Can you convert a switch statement to an equivalent if statement, or vice versa? What are the advantages of using a switch statement?

Types are char, int, long, string

The next statement to execute is the next case statement.  (fallthrough)

Yes, any case statement can be translated to an if statement.

Case statements are mor concise than long if statements.

### 3.13.2 What is y after the following switch statement is executed? Rewrite the code using an if-else statement

```java
x = 3; y = 3;
switch (x + 3) {
  case 6: y = 1;
  default: y += 1;
}
```
 
 x = 6

```java
if (x + 3 == 6)
  y = 1
else
  y += 1

```

### 3.13.3 What is x after the following if-else statement is executed? Use a switch statement to rewrite it and draw the flowchart for the new switch statement

```java
int x = 1, a = 3;
if (a == 1)
  x += 5;
else if (a == 2)
  x += 10;
else if (a == 3)
  x += 16;
else if (a == 4)
  x += 34;

```

x = 17

```java
int x = 1, a = 3;
switch (a) {
  case 1:
    x += 5;
    break;
  case 2:
    x += 10;
    break;
  case 3:
    x += 16;
    break;
  case 4:
    x += 34;
    break;
  default:
    break;
}
```

### 3.13.4 Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, respectively

```java
int day = ...
switch (day) {
  case 0:
    System.out.println("Sunday");
    break;
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
}
```

### 3.13.5 Rewrite Listing 3.9 using an if-else statement.