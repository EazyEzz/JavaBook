package chapter6;
import java.util.Scanner;

//(Palindrome integer)
public class Problem3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number > 0 : ");
		int n = input.nextInt();
		
		System.out.println("Is your number a palindome? : " + isPalindrome(n));
	}
	
	public static int reversed(int number) {
		int rev = 0;
		while(number != 0) {
			int digit = number % 10;
			rev = rev * 10 + digit;
			number /= 10;
		}
		return rev;
	}
	
	public static boolean isPalindrome(int number) {
		int check = reversed(number);
		return check == number;
	}
}
