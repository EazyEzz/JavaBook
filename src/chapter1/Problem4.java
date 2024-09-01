package chapter1;

//(Print a table) Write a program that displays a table:
public class Problem4{
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i == 0) {
				System.out.println(" a     a^2   a^3");
			} else if(i == 4){
				System.out.println(" "+i+ "     "+(i*i)+ "    "+(i*i*i));

			} else {
				System.out.println(" "+i+ "     "+(i*i)+ "     "+(i*i*i));

			}
		}
	}
}