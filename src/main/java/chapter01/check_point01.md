# Chapter 1 Check Point

## 1.2 1.2 What Is a Computer?

### 1.2.1 What are hardware and software?

Hardware is the actual computer equipment, CPU, peripherals, disks, monitors.

Software is the coded instructions that run the computer.

### 1.2.2 List the five major hardware components of a computer

Processor, memory,  hard disk, monitor, keyboard.

### 1.2.3 What does the acronym CPU stand for? What unit is used to measure CPU speed?

CPU - Central Processing Unit

Speed is measured in HZ - Cycles per second.

### 1.2.4 What is a bit? What is a byte?

A 'bit' is the most basic unit of information consisting of a 1 or 0 representing on or off.

A 'byte' is usually 8 bits of information, representing on character of information.

### 1.2.5 What is memory for? What does RAM stand for? Why is memory called RAM?

Memory is part of the hardware that holds the information while the computer operates.

RAM stands for Random Access Memory.

I is called Random because it can be accessed randomly as opposed to a linear tape drive.

### 1.2.6 What unit is used to measure memory size? What unit is used to measure disk size?

Memory is usually measured in gigabytes on current computers.

Disk size is usually measured in gigabytes or terabytes in current computers.

### 1.2.7 What is the primary difference between memory and a storage device?

Memory is much much faster than a storage device.  But it looses it's data when the computer is shut off.  Storage devices retain their memory,

## 1.3 Programming Languages

### 1.3.1 What language does the CPU understand?

Machine language.

### 1.3.2 What is an assembly language? What is an assembler?

Assembly language mnemonics (symbols) to represent machine code. It's easier to understand for humans than machine code.

Assembler converts assembly code to machine code for consumption by the CPU.

### 1.3.3 What is a high-level programming language? What is a source program?

High-level language that is more abstract than assembly language, and can be cross platform.

Source program is text written by programmers in a high level language that is translated into machine code by a compiler.

### 1.3.4 What is an interpreter? What is a compiler?

Interpreter is a high-level language translator that translates high-level language one statement at a time.

Compiler translates a whole program at a time into machine language.

## 1.4 Operating Systems

### 1.4.1 What is an operating system? List some popular operating systems

Operating system is software to controls the computer.  MSDos, Unix, Mac OS. Linux are some examples/

### 1.4.2 What are the major responsibilities of an operating system?

Provides Controlling programs, allocating memory, controlling access to hardware.

### 1.4.3 What are multiprogramming, multithreading, and multiprocessing?

Multiprogramming are several programs running at the same time.

Multithreading is several parts of a program running at the same time/

Multiprocessing is several CPU running several programs and/or threads at the same time.

## 1.5 Java, the World Wide Web, and Beyond

### 1.5.1 Who invented Java? Which company owns Java now?

James Gosling working for Sun Computers.  Oracle owns Java now.

### 1.5.2 What is a Java applet?

A Java applet is a small program, written in Java that runs in the context of a web browser, usually delivered over the web.

### 1.5.3 What programming language does Android use?

Java and Kotlin.

## 1.6  The Java Language Specification, API, JDK, JRE, and IDE

### 1.6.1 What is the Java language specification?

A standards document that specifies the Java language, the Java environment and the Java libraries.

### 1.6.2 What does JDK stand for? What does JRE stand for?

Java Development Kit

Java Runtime Environment

### 1.6.3 What does IDE stand for?

Integrated Development Environment.

### 1.6.4 Are tools like NetBeans and Eclipse different languages from Java, or are they dialects or extensions of Java?

The are IDEs specialized of Java development.

## 1.7 A Simple Java Program

### 1.7.1 What is a keyword? List some Java keywords

A keyword is a token that has special significance/meaning in a programming language.

class, public, private, static, void, if, else.

### 1.7.2 Is Java case sensitive? What is the case for Java keywords?

Java is case sensitive.

Keywords are in lower case.

### 1.7.3 What is a comment? Is the comment ignored by the compiler? How do you denote a comment line and a comment paragraph?

A comment is a text in a programming language file that is useful for human readers.

Comments are ignored by compilers, they are useful for human readers.

```java
//Two slashes '//' denote a one line comment in java. 

// A pair os slash stars denote a multi-line comment 
/* comment */

```

### 1.7.4 What is the statement to display a string on the console?

```java
System.out.println("output to the console");
```

### 1.7.5 Show the output of the following code

```java
public class Test {
  public static void main(String[] args) {
    System.out.println("3.5 * 4 / 2 – 2.5 is ");
    System.out.println(3.5 * 4 / 2 – 2.5);
  }
}
```

3.5 * 4 / 2 - 2.5 is
4.5

## 1.8 Creating, Compiling, and Executing a Java Program

### 1.8.1 What is the Java source filename extension, and what is the Java bytecode filename extension?

Java source filename extension is .java

Java bytecode filename extension is .class

### 1.8.2 What are the input and output of a Java compiler?

Java source code (.java) is the input, Java byte code (.class) is the output.

### 1.8.3 What is the command to compile a Java program?

> javac xxx.java

### 1.8.4 What is the command to run a Java program?

> java xxx

The .class extension does not have to be included in the command.

### 1.8.5 What is the JVM?

The JVM is the virtual machine and interpreter that runs java programs.

### 1.8.6 Can Java run on any machine? What is needed to run Java on a computer?

Java can run on any machine that has a JVM for that machine.

### 1.8.7 If a NoClassDefFoundError occurs when you run a program, what is the cause of the error?

The JVM can not find a .class file for that compiled class.

### 1.8.8 If a NoSuchMethodError occurs when you run a program, what is the cause of the error?

The JVM can find a named method in the referenced class.

## 1.9 Programming Style and Documentation

```Java
// Line comment

/* 
    block comment
*/

/**
 * Javadoc comment
 */
```

## 1.10 Programming Errors

### 1.10.1 What are syntax errors (compile errors), runtime errors, and logic errors?

A syntax error is introduced when writing some code that does not follow the Java syntax rules.

A runtime error will occur during program execution causing the program to terminate in an uncontrolled way because of some unknown event.  

I program with a logical error will compile and run but, produces unexpected results

### 1.10.2 Give examples of syntax errors, runtime errors, and logic errors

Examples of syntax errors are misspelling of keywords, missing a terminating brace, or not ending a statement with a semicolon.

Examples of runtime errors are bad/incorrect input, divide by zero.

Examples of logical errors are using the wrong formula or algorithm for calculating something.

### 1.10.3 If you forget to put a closing quotation mark on a string, what kind of error will be raised?

Forgetting to put a closing quotation mark on a string will cause a syntax error.

### 1.10.4 If your program needs to read integers, but the user entered strings, an error would occur when running this program. What kind of error is this?

A program that needs to read integer, but the user enter strings will generate an runtime error.

### 1.10.5 Suppose you write a program for computing the perimeter of a rectangle and you mistakenly write your program so it computes the area of a rectangle. What kind of error is this?

This example is a logic error.

### Identify and fix the errors in the following code

```java
public class Welcome {
    public void Main(String[] args) { // 'main' shouldn't be capitalized
      System.out.println('Welcome to Java!); // wrong string delimiters
      // missing closing brace
)  // should be a closing brace
```

```java
public class Welcome {
    public void Main(String[] args) {
      System.out.println("Welcome to Java!");
    }
}
```
