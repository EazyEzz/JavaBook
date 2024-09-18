package chapter6;

//sum series
//m(i) = (1/2) + (2/3) + ... + (i/i+1)
public class Problem13 {
	public static void main(String[] args) {
		int maxNum = 20;
		System.out.printf("%-10s%s\n", "i", "m(i)");
		for(int i = 1; i <= maxNum; i++) {
			double output = sumSeries(i);
			System.out.printf("%-10d%-6.4f\n", i, output);
		}
	}
	public static double sumSeries(int num) {
		double x = 0.0;
		for (int i = 1; i <= num; i++) {
			x += (double)i / (double)(i + 1);
		}
		return x;		
	}

}
