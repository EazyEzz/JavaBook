package chapter6;

public class Problem14 {
	public static void main(String[] args) {
		double result = 0.0;
		
		System.out.printf("%-15s%s\n", "i", "m(i)");
		
		for(int i = 0; i < 10; i++) {
			int iCount = i;
			if (i == 0) {
				result = pi(i + 1);
				iCount = 1;
			} else {
				result = pi(i * 100 + 1);
				iCount = i * 100 + 1;
			}
			System.out.printf("%-15d%-7.4f\n", iCount , result);

		}
	}
	public static double pi(int i) {
		if(i == 1) {
			return 4.0;
		} else {
			double res = 0.0;
			int num;
			int denom;
			for(int j = 1; j <= i; j++) {
				if(j % 2 == 0) {
					num = -1;
				} else {
					num = 1;
				}
				denom = 2 * j - 1;
				
				res += (double) num/denom;
			}
			return 4.0 * res;
		}
	}

}
