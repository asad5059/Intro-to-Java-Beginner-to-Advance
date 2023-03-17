/*
 * Problem: Write a program that takes the name of a 
 * day from the user and prints the corresponding number of that 
 * day of the week.
 */
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the name of a day:");
        String day = input.nextLine();
        
        int dayNumber;
        
        switch (day.toLowerCase()) {
            case "monday":
                dayNumber = 1;
                break;
            case "tuesday":
                dayNumber = 2;
                break;
            case "wednesday":
                dayNumber = 3;
                break;
            case "thursday":
                dayNumber = 4;
                break;
            case "friday":
                dayNumber = 5;
                break;
            case "saturday":
                dayNumber = 6;
                break;
            case "sunday":
                dayNumber = 7;
                break;
            default:
                dayNumber = 0;
                break;
        }
        
        if (dayNumber != 0) {
            System.out.println(day + " is the " + dayNumber + " day of the week.");
        } else {
            System.out.println("Invalid input! Please enter a valid day name.");
        }
    }
}
