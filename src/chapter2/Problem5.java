package chapter2;
import java.util.Scanner;

//(Financial application: calculate tips) Write a program that reads the subtotal
//and the gratuity rate, then computes the gratuity and total. For example, if the
//user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
//as gratuity and $11.5 as total.
public class Problem5 {
	public static void main(String[] args) {
		float gratuityRate;
		float subtotal;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		subtotal = input.nextFloat();
		gratuityRate = input.nextFloat();
		
		float gratuity = subtotal * (gratuityRate/100);
		float total = subtotal + gratuity;
		
		System.out.printf("The gratuity is $%.2f and total is $%.2f%n", gratuity, total);
		
	}
}
