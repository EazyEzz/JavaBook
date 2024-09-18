package chapter6;

//(Conversions between feet and meters)
//meter = 0.305 * foot
//foot = 3.279 * meter
public class Problem9 {
	public static void main(String[] args) {
		double feet = 1.0;
		double meters = 20.0;
		
		System.out.printf("%-5s%10s%6s%11s%10s%n", "Feet", "Meters","|","Meters","Feet");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < 5; i++) {
			double newMeters = footToMeter(feet);
			double newFeet = meterToFoot(meters);
			System.out.printf("%-5.1f%9.3f%7s%9.1f%-8s%-3f%n", feet, newMeters, "|", meters, " ", newFeet);
			feet += 1.0;
			meters += 5.0;
			
		}
		
	}
	public static double footToMeter (double foot) {
		return 0.305 * foot;
	}
	
	public static double meterToFoot (double meter) {
		return 3.279 * meter;
	}
}
