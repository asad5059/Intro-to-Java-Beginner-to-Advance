import java.util.Scanner;

// Java program to print all even numbers between 1 to n

public class EvenNumbers {

    public static void main(String[] args) {
        
        int i = 1,x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        
        System.out.print("Even numbers between 1 and "+x +" are: ");
        
        while(i <= x) {
            
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
            
            i++;
        }
    }
}
