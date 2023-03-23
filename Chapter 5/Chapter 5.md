# Control Statements
## if-else and switch statments
This chapter covers control statements in Java. These statements allow a program to make decisions and execute code based on certain conditions.

The chapter starts with the if-else statement, which allows a program to execute different code based on a certain condition. In Java, the if-else statement is used to execute different code based on a certain condition. The syntax for an if-else statement is as follows:

```java
if (condition) {
    // Code to execute if the condition is true
} else {
    // Code to execute if the condition is false
}
```
The condition is an expression that evaluates to a boolean value (either true or false). If the condition is true, the code in the first block (the code between the curly braces {}) is executed. If the condition is false, the code in the second block (the code after the else keyword) is executed.

Here is an example:

```java
int x = 10;

if (x > 5) {
    System.out.println("x is greater than 5");
} else {
    System.out.println("x is less than or equal to 5");
}
```
Next, the chapter covers the switch statement, which allows a program to execute different code based on the value of a variable. In Java, the switch statement is used to execute different blocks of code depending on the value of a certain expression. The syntax for a switch statement is as follows:

```java
switch (expression) {
    case value1:
        // Code to execute if the expression is equal to value1
        break;
    case value2:
        // Code to execute if the expression is equal to value2
        break;
    ...
    default:
        // Code to execute if the expression does not match any of the cases above
        break;
}
```
The **expression** is a value that is compared to the values listed in each of the case statements. If the value of the expression matches the value of one of the case statements, the code in that block is executed. If none of the case statements match the value of the expression, the code in the default block is executed.


Here is an example:

```java
int dayOfWeek = 3;

switch (dayOfWeek) {
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
    default:
        System.out.println("Weekend");
        break;
}
```

## Loops

The chapter then covers loops, starting with the while loop, which allows a program to execute code repeatedly while a certain condition is true. In Java, a while loop is a control flow statement that allows you to repeatedly execute a block of code as long as a certain condition is true. The syntax for a while loop is as follows:

```java
while (condition) {
    // Code to execute while the condition is true
}

```
The condition is an expression that is evaluated before each iteration of the loop. If the value of the condition is true, the code in the loop is executed. If the value of the condition is false, the loop is exited and control is passed to the next statement in the program.


Here is an example:
```java
int i = 0;

while (i < 10) {
    System.out.println(i);
    i++;
}
```
Next, the chapter covers the do-while loop, which is similar to the while loop but always executes the code at least once. The do-while loop is a type of loop statement in Java that is similar to the while loop, but with one key difference: the code inside the loop is always executed at least once, regardless of whether the loop condition is true or false. Here is an example of a do-while loop in Java:

```java
do {
    // code to execute
} while (condition);
```
The code inside the do block will be executed first, and then the condition is checked. If the condition is true, the loop will execute again, and so on until the condition becomes false.

Here is an example:
```java
int i = 0;

do {
    System.out.println(i);
    i++;
} while (i < 10);
```

Finally, the chapter covers the for loop, which allows a program to execute code a certain number of times.  The for loop is a control structure in Java that allows us to repeat a block of code a specified number of times. It is a very useful construct when we know ahead of time exactly how many times we want to execute a block of code.

Here is the general syntax for a for loop:
```java
for (initialization; condition; update) {
    // code to execute
}
```
Here is an example:

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

Overall, Chapter 5 of "Java The Complete Reference" provides a comprehensive overview of control statements in Java and how they can be used to make decisions and execute code based on certain conditions. The code examples demonstrate how each statement works and can be used in real-world scenarios.