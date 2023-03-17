//Calculating Circle Area from User Input
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        // Calculate the area of the circle using the formula A = pi * r^2
        double area = Math.PI * Math.pow(radius, 2);
        
        // Print the area of the circle
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}
