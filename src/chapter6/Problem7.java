package chapter6;
import java.util.Scanner;

//futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
public class Problem7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int years = 30;
		double investAmt, yearIntRate = 0.0;
		
		System.out.print("Enter amount invested: ");
		investAmt = input.nextDouble();
		System.out.print("Enter annual interest: " );
		yearIntRate = input.nextDouble();

		double monthIntRate = (yearIntRate/100)/12;
		
		System.out.printf("%-10s%15s%n", "Years", "Future Value");

		for(int i = 0; i < years; i++) {
			double x = futureInvestmentValue(investAmt, monthIntRate, (i+1));
			System.out.printf("%-10d%15.2f%n", (i+1), x);
		}
		
		input.close();

	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		double x = Math.pow((1 + monthlyInterestRate), (years * 12));
		double y = investmentAmount * x;
		return y;
	}

}
