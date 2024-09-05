package chapter6;
import java.util.Scanner;

//(Display an integer reversed)
public class Problem4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number > 0: ");
		int num = input.nextInt();
		
		reversed(num);
	}
	public static void reversed(int number) {
		int rev = 0;
		while(number != 0) {
			int digit = number % 10;
			rev = rev * 10 + digit;
			number /= 10;
		}
		System.out.println("Your number reversed = " + rev);
	}

}
