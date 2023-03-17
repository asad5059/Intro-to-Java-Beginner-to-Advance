
## Arithmetic Operators:
In Java, there are several arithmetic operators that can be used to perform mathematical calculations. These operators are:

1. Addition: +
The addition operator is used to add two values together.

2. Subtraction: -
The subtraction operator is used to subtract one value from another.

3. Multiplication: *
The multiplication operator is used to multiply two values together.

4. Division: /
The division operator is used to divide one value by another.

5. Modulus: %
The modulus operator is used to find the remainder when one value is divided by another.
Here's an example program that shows the usage of these arithmetic operators in Java:

```java
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);
        
        // Subtraction
        int diff = a - b;
        System.out.println("Difference: " + diff);
        
        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);
        
        // Division
        double quotient = (double) a / b;
        System.out.println("Quotient: " + quotient);
        
        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);
    }
}
```
## Conditional Operator:
In Java, there are several conditional operators that can be used to create logical expressions. These operators are:

1. Equal to: ==
The equal to operator checks if two values are equal to each other.

2. Not equal to: !=
The not equal to operator checks if two values are not equal to each other.

3. Greater than: >
The greater than operator checks if one value is greater than another.

4. Less than: <
The less than operator checks if one value is less than another.

5. Greater than or equal to: >=
The greater than or equal to operator checks if one value is greater than or equal to another.

6. Less than or equal to: <=
The less than or equal to operator checks if one value is less than or equal to another.

Here's an example program that shows the usage of these conditional operators in Java:

```java
public class ConditionalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        // Equal to
        boolean equal = a == b;
        System.out.println("Equal: " + equal);
        
        // Not equal to
        boolean notEqual = a != b;
        System.out.println("Not equal: " + notEqual);
        
        // Greater than
        boolean greaterThan = a > b;
        System.out.println("Greater than: " + greaterThan);
        
        // Less than
        boolean lessThan = a < b;
        System.out.println("Less than: " + lessThan);
        
        // Greater than or equal to
        boolean greaterThanOrEqual = a >= b;
        System.out.println("Greater than or equal to: " + greaterThanOrEqual);
        
        // Less than or equal to
        boolean lessThanOrEqual = a <= b;
        System.out.println("Less than or equal to: " + lessThanOrEqual);
    }
}

```

## Bitwise Operators:
In Java, there are several bitwise operators that can be used to perform bitwise operations on integer types. These operators are:

1. Bitwise AND: &
The bitwise AND operator compares the binary representation of two integer operands and produces an integer result with a 1 bit in each position where both operands have a 1 bit.

2. Bitwise OR: |
The bitwise OR operator compares the binary representation of two integer operands and produces an integer result with a 1 bit in each position where at least one operand has a 1 bit.

3. Bitwise XOR: ^
The bitwise XOR operator compares the binary representation of two integer operands and produces an integer result with a 1 bit in each position where the operands have different values (i.e., one has a 1 bit and the other has a 0 bit).

4. Bitwise complement: ~
The bitwise complement operator inverts the bits of its integer operand.

5. Left shift: <<
The left shift operator shifts the bits of its integer operand to the left by a specified number of positions, effectively multiplying the operand by 2 raised to the power of the shift amount.

6. Right shift: >>
The right shift operator shifts the bits of its integer operand to the right by a specified number of positions, effectively dividing the operand by 2 raised to the power of the shift amount.

7. Unsigned right shift: >>>
The unsigned right shift operator shifts the bits of its integer operand to the right by a specified number of positions, filling the leftmost bits with 0s.

Here's an example program that shows the usage of these bitwise operators in Java:
```java
public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 7;  // Binary representation: 0111
        int b = 3;  // Binary representation: 0011
        
        // Bitwise AND
        int resultAnd = a & b;  // Binary representation: 0011
        System.out.println("Bitwise AND: " + resultAnd);
        
        // Bitwise OR
        int resultOr = a | b;  // Binary representation: 0111
        System.out.println("Bitwise OR: " + resultOr);
        
        // Bitwise XOR
        int resultXor = a ^ b;  // Binary representation: 0100
        System.out.println("Bitwise XOR: " + resultXor);
        
        // Bitwise complement
        int resultComplement = ~a;  // Binary representation: 1000
        System.out.println("Bitwise complement: " + resultComplement);
        
        // Left shift
        int resultLeftShift = a << 2;  // Binary representation: 011100
        System.out.println("Left shift: " + resultLeftShift);
        
        // Right shift
        int resultRightShift = a >> 1;  // Binary representation: 0011
        System.out.println("Right shift: " + resultRightShift);
        
        // Unsigned right shift
        int resultUnsignedRightShift = a >>> 1;  // Binary representation: 0011
        System.out.println("Unsigned right shift: " + resultUnsignedRightShift);
    }
}
```

## Ternary Operator:
In Java, the ternary operator (also called the conditional operator) is a shorthand way to write an if-else statement. The syntax for the ternary operator is:
```java
(condition) ? (expression1) : (expression2);
```
Here, condition is a boolean expression that is evaluated to either true or false. If condition is true, then expression1 is evaluated and its result is returned. Otherwise, expression2 is evaluated and its result is returned.