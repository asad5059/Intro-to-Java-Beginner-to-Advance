//Program that computes the number of miles that light will travel in a specified number of days
import java.util.Scanner;

public class LightTravel {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of days
        System.out.print("Enter the number of days: ");
        Long days = input.nextLong();
        
        // Calculate the number of seconds in the specified number of days
        Long seconds = days * 24 * 60 * 60;
        
        // Calculate the distance that light will travel in the specified number of seconds
        Long distance = 186000 * seconds;
        
        
        // Print the distance that light will travel in the specified number of days
        System.out.println("Light will travel " + distance + " miles in " + days + " days");
    }
}
