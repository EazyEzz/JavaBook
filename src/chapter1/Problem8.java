package chapter1;

//(Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius of 5.5 
public class Problem8 {
	public static void main(String[] args) {
		double perimeter = 0;
		double area = 0;
		double radius = 5.5;
		final double pi = Math.PI;
		
		perimeter = 2 * radius * pi;
		area = radius * radius * pi;
		
		System.out.println("Area of a circle with radius of " + radius + " = " + area);
		System.out.println("Perimeter of a circle with radius of " + radius + " = " + perimeter);

	}
}
