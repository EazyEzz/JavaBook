package chapter6;
import java.util.Scanner;

//(Sort three numbers)
public class Problem5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double a, b, c;
		System.out.print("Enter 3 numbers >= 0: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		sortNums(a, b ,c);
	}
	
	public static void sortNums(double num1, double num2, double num3) {
		double[] nums = {num1, num2, num3};
		if(nums[0] > nums[1]) {
			swap(nums, 0, 1);
		}
		if(nums[0] > nums[2]) {
			swap(nums, 0, 2);
		}
		if(nums[1] > nums[2]) {
			swap(nums, 1, 2);
		}
		
		System.out.println(nums[0] + "  " + nums[1] + "  " + nums[2]);

	}
	
	public static void swap(double[] nums, int a, int b) {
		double temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
