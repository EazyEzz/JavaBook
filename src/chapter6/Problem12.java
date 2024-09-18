package chapter6;

//Display Characters from "1" to "F"
public class Problem12 {
	public static void main(String[] args) {
		int numberPerLine = 10;
		char start = '1';
		char end = 'Z';
		
		printChars (start, end, numberPerLine);
		
	}
	public static void printChars (char ch1, char ch2, int numberPerLine) {
		int count = 0;
		for(int i = (int) ch1; i <= (int) ch2; i++) {
			count++;
			if(count % numberPerLine == 0) {
				System.out.printf("%-3c\n", (char)i);
			} else {
				System.out.printf("%-3c", (char)i);
			}
		}
	}

}
