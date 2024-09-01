package chapter1;

//(Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes
//and 30 seconds. Write a program that displays the average speed in miles per
//hour. (Note 1 mile is equal to 1.6 kilometers.)
public class Problem10 {
	public static void main(String[] args) {
		float kilometers = 14f;
		float miles = kilometers/1.6f;
		float minHour = 45.0f/60.0f;
		float secHour = 30.0f/3600.0f;
		float time = minHour + secHour;
		
		float avg = miles/time;
		
		System.out.println("Runner average speed in MPH = " + avg);
		
		float pace = 45.0f/miles;
		
		System.out.println("Runner pace = " + pace + " min/mile.");
	}
}
