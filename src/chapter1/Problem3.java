package chapter1;

//(Display a pattern) Write a program that displays the following pattern: J A V A
public class Problem3 {
    public static void main(String[] args) {
    	String[] pattern = {
    			"     J     A     V     V    A   ",
    			"     J    A A     V   V    A A  ",
    			" J   J   AAAAA     V V    AAAAA ",
    			"  J J   A     A     V    A     A"
    	};
    	
    	for(String line: pattern) {
    		System.out.println(line);
    	}
    }
}