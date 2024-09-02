package chapter2;
import java.util.Scanner;

//(Compute the volume of a cylinder) Write a program that reads in the radius
//and length of a cylinder and computes the area and volume
public class Problem2 {
	public static void main(String[] args) {
		//area = radius * radius * pi
		//volume = area * length
		final double PI = Math.PI;
		double radius;
		double area;
		double length;
		double volume;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a cylinder: ");
		radius = input.nextDouble();
		length = input.nextDouble();
		
		area = radius * radius * PI;
		volume = area * length;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
	}
}
