package chapter2;
import java.util.Scanner;

//(Sum the digits in an integer) Write a program that reads an integer between 0
//and 1000 and adds all the digits in the integer. For example, if an integer is 932,
//the sum of all its digits is 14.
public class Problem6 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		
		do {
			System.out.print("Enter a number between 0 and 1000: ");
			num = input.nextInt();
		}while(num < 0 || num > 1000);

		
		while(num > 0) {
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		
		System.out.println("The sum of the digits is " + sum);
	}
}
