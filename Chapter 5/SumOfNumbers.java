import java.util.Scanner;

// Java program to calculate the sum of first n natural numbers

public class SumOfNumbers {

    public static void main(String[] args) {
        
        int sum = 0, n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Sum of first "+n +" natural numbers is: " + sum);
    }
}
