package chapter6;

//(Use the isPrime Method)
//A number cannot be divisible by any number greater than half of itself (except for the number itself). For example:
//If a number n = 20, its largest possible divisor (other than itself) is 10, which is half of 20.
public class Problem10 {
	public static void main(String[] args) {
		System.out.println("The first 1000 prime numbers are: ");
		final int MAX_NUM = 1000;
		final int PRIME_PER_LINE = 10;
		int count = 0;
		int number = 2;
		
		while(count < MAX_NUM) {
			if(isPrime(number)) {
				count++;
				
				if(count % PRIME_PER_LINE == 0) {
					System.out.printf("%-5d\n", number);
				} else {
					System.out.printf("%-5d", number);
				}
			}
			number++;			
		}
		
	}
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if(number % divisor == 0) { //if true, number is not prime
				return false; //number is not prime
			}
		}
		return true; //number is prime
	}
}
