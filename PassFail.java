/*
 * Problem: A student has to achieve a minimum percentage of 40% in 
 * each subject to pass the exam. Write a program that takes the
 *  percentage of three subjects from the user and prints whether 
 * the student has passed or failed.
 */

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the percentage of three subjects:");
        double subject1 = input.nextDouble();
        double subject2 = input.nextDouble();
        double subject3 = input.nextDouble();
        
        double total = (subject1 + subject2 + subject3) / 3;
        
        if (total >= 40) {
            System.out.println("Congratulations! You have passed the exam.");
        } else if (total < 40 && total >= 0) {
            System.out.println("Sorry! You have failed the exam.");
        } else {
            System.out.println("Invalid input! Please enter a valid percentage.");
        }
    }
}
