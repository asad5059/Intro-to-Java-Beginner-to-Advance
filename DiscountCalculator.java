//Calculating the price of some product after discount
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double originalPrice = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = input.nextDouble();
        
        double discountedPrice = originalPrice - (originalPrice * discountPercentage / 100.0);
        System.out.println("The discounted price is: " + discountedPrice);
    }
}
