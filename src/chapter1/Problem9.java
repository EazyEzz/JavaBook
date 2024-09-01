package chapter1;

//Area and perimeter of a rectangle) Write a program that displays the area and
//perimeter of a rectangle with a width of 4.5 and a height of 7.9 
public class Problem9 {
	public static void main(String[] args) {
		double area = 0;
		double perimeter = 0;
		final double width = 4.5;
		final double height = 7.9;
		
		area = width * height;
		perimeter = (2 * width) + (2 * height);
		
		System.out.println("The area = " + area);
		System.out.println("The perimeter = " + perimeter);
	}
}
