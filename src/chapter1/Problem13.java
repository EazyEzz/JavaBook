package chapter1;

//(Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve a
//system of linear equation provided that ad – bc is not 0:
public class Problem13 {
	public static void main(String[] args) {
		//ax + by = e
		//cx + dy = f
		//x = (ed-bf)/(ad-bc)
		//y = (af-ec)/(ad-bc)
		
		float a = 3.4f;
		float b = 50.2f;
		float c = 2.1f;
		float d = .55f;
		float e = 44.5f;
		float f = 5.9f;
		
		float xnumer = (e * d) - (b * f);
		float xdenom = (a * d) - (b * c);
		float ynumer = (a * f) - (e * c);
		float ydenom = (a * d) - (b * c);
		
		float x = xnumer / xdenom;
		float y = ynumer / ydenom;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
