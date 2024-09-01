package chapter1;

//(Approximate pi) 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + ...)
public class Problem7{
	public static void main(String[] args) {
		double pi1 = 0;
		double pi2 = 0;
		double series1 = 0;
		double series2 = 0;
		int count = 1;
				
		for(int i = 1; i <= 13;i++) {
			if(i == 1) {
				series1 = 1;
				series2 = 1;
				count++;
			} else if(i <= 11) {
				i++;
				if(count % 2 == 0) {
					series1 -= 1.0/i;
				} else {
					series1 += 1.0/i;
				}
				count++;
			} else {
				series2 = series1 + (1.0/i);
			}
		}
		pi1 = 4 * series1;
		pi2 = 4 * series2;
		System.out.println("Approximation of pi upto 1/11 = " + pi1);
		System.out.println("Approximation of pi upto 1/13 = " + pi2);
	}
}