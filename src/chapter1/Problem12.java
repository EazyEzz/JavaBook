package chapter1;

//(Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
//minutes, and 35 seconds. Write a program that displays the average speed in
//kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
public class Problem12 {
	public static void main(String[] args) {
		//avg speed (km/h) = distance(km) / time(hours)
		double minHour = 40.0/60;
		double secHour = 35.0/(60*60);
		
		double totalHours = minHour + secHour + 1;
		
		double kmDistance = 24 * 1.6;
		
		double avg = kmDistance / totalHours;
		
		System.out.println("Average speed in kilometers per hour = " + avg);
	}
}
