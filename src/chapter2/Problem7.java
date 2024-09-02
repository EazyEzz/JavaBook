package chapter2;
import java.util.Scanner;

//(Find the number of years) Write a program that prompts the user to enter the
//minutes (e.g., 1 billion), and displays the maximum number of years and remaining days for the minutes.
public class Problem7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int DAYS_YEAR = 365;
		int inputMinutes;
		float years;
		int days;
		
		System.out.print("Enter the number of minutes: ");
		inputMinutes = input.nextInt();
		
		float minInDay = 60.0f * 24; //1440
		float minPerYear = minInDay * DAYS_YEAR; //525600
		
		years = inputMinutes/ minPerYear;
		
		int yearsInt = (int)years;
				
		float daysRemainder = years - yearsInt;
		days = (int)(daysRemainder * DAYS_YEAR);
		
		System.out.println(inputMinutes + " minutes is approximately " + yearsInt + " years and " + days + " days.");
	}
}
