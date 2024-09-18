package chapter6;

//(Conversions between Celsius and Fahrenheit)
//fahrenheit = (9.0 / 5) * celsius + 32
//celsius = (5.0 / 9) * (fahrenheit – 32)
public class Problem8 {
	public static void main(String[] args) {
		double celsius = 40.0;
		double fahrenheit = 120.0;
		
		System.out.printf("%-10s%11s%4s%13s%11s%n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius"); 
		System.out.println("-------------------------------------------------");
		for(int i = 0; i < 10; i++) {
			double newF = celsiusToFahrenheit(celsius);
			double newC = fahrenheitTOCelsius(fahrenheit);
			System.out.printf("%-11.1f%-13.1f%-4s%-14.1f%.2f%n", celsius, newF, "|", fahrenheit, newC);
			celsius--;
			fahrenheit -= 10;			
		}
		
	}
	public static double celsiusToFahrenheit(double celsius) {
		double f = 0.0;
		f = (9.0 / 5) * celsius + 32;
		return f;
	}
	public static double fahrenheitTOCelsius(double fahrenheit) {
		double c = 0.0;
		c = (5.0 /9) * (fahrenheit - 32);
		return c;
	}
}
