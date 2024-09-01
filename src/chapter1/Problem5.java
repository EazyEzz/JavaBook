package chapter1;

//(Compute expressions) Write a program that displays the result of
public class Problem5 {
	public static void main(String[] args) {
		float a = 9.5f;
		float b = 4.5f;
		float c = 2.5f;
		float d = 3f;
		float e = 45.5f;
		float f = 3.5f;
		
		float numerator = (a * b) - (c * d);
		float denominator = (e - f);
		
		double sol = numerator / denominator;
		
		System.out.println("The solution is: " + sol);
	}
}