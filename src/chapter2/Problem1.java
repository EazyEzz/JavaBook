package chapter2;
import java.util.Scanner;

//(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
//double value from the console, then converts it to Fahrenheit, and displays the
//result.
public class Problem1 {
	public static void main(String[] args) {
		//conversion formula
		//F = (9/5) * celsius + 32
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double a = (9.0/5);
		double c;
		double f;
		
		System.out.print("Enter a degree in Celsius: ");
		c = input.nextDouble();
		
		f = a * c + 32;
		System.out.println(c + " Celsius is " + f + " Fahrenheit.");
	}
}
