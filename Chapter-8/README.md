# Inheritance in Java

Inheritance is a mechanism in Java that allows one class to inherit the properties and methods of another class. The class that inherits from another class is called the **subclass** or **derived class**, while the class that is being inherited from is called the **superclass** or **base class**.

## Syntax

The syntax for creating a subclass in Java is as follows:

```java
class Subclass extends Superclass {
    // Subclass methods and properties
}
```
The extends keyword is used to indicate that the Subclass is inheriting from the Superclass. The subclass can then access all public and protected members of the superclass, including methods and properties.

### Types of Inheritance
There are four types of inheritance in Java:

1. Single inheritance: When a subclass inherits from a single superclass.

2. Multilevel inheritance: When a subclass inherits from a superclass, which itself inherits from another superclass.

3. Hierarchical inheritance: When multiple subclasses inherit from a single superclass.

4. Multiple inheritance (not supported in Java): When a subclass inherits from multiple superclasses.

### Overriding Methods
Inheritance also allows a subclass to override methods defined in its superclass. This means that the subclass can provide its own implementation of the method, which will be used instead of the superclass's implementation. To override a method in Java, the subclass method must have the same name, return type, and parameter list as the superclass method.

```java
class Superclass {
    public void doSomething() {
        System.out.println("Hello from Superclass!");
    }
}

class Subclass extends Superclass {
    public void doSomething() {
        System.out.println("Hello from Subclass!");
    }
}
```

### Conclusion
Inheritance is a powerful feature of Java that allows classes to be organized into a hierarchy, with subclasses inheriting properties and methods from their superclasses. This makes it easier to write code that is reusable, maintainable, and extensible.