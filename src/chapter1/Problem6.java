package chapter1;

//6 (Summation of a series)
public class Problem6{
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < 10; i++) {
			if(i == 9) {
				System.out.print(i + " = ");
			} else {
				System.out.print(i + " + ");
			}
			sum += i;
		}
		System.out.print(sum);
	}
}