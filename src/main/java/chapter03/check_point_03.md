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

### 3.4.1 Write an if statement that increases pay by 3% if score is greater than 90, oth erwise increases pay by 1%

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
