package chapter6;
import java.util.Scanner;

//(Display patterns)
public class Problem6 {
	public static void main(String[] args) {
//		int n = 4;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if((i + j) < (n-1)) {
//					System.out.print(" ");
//				} else if((i + j) == (n-1)) {
//					System.out.print(i + 1);
//				} else {
//					int x = n + i;
//					int y = i + j;
//					int z = x - y;
//					System.out.print(z);
//				}
//			}
//			System.out.println();
//		}
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of your pattern: ");
		int num = input.nextInt();
		
		displayPattern(num);
	}
	public static void displayPattern(int n) {
		int d = n*2;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				if((i+j) < (d-1)) {
					System.out.print(" ");
				} else if((i+j) == (d-1)) {
					System.out.print(i + 1);
				} else {
					int x = d + i;
					int y = i + j;
					int z = x - y;
					System.out.print(z);
				}
			}
			System.out.println();
		}
	}

}
