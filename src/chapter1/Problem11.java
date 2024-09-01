package chapter1;

//*(Population projection)
public class Problem11 {
	public static void main(String[] args) {
		//one birth every 7 seconds
		//one death every 13 seconds
		//one new immigrant ever 45 seconds
		//display the population for each of the next five years.
		double currentPop = 312032486.0;
		
		//seconds per hour = 60 sec/min * 60 min/hour = 3600 seconds/hour
		double secHour = 60 * 60;
		//seconds per day = 24 hours/day * 3600 seconds/hour = 86400 seconds/day.
		double secDay = 24.0 * secHour;
		//births per day = 86400/7 = 12342.85714
		double birthsDay = secDay/7.0;
		//deaths per day = 86400/13 = 6646.153846
		double deathsDay = secDay/13.0;
		//immigrants per day = 86400/45 = 1920
		double immigrantsDay = secDay/45.0;
		//single day population = 12342.85714 + 1920 - 6646.153846
		double singleDayPop = birthsDay + immigrantsDay - deathsDay;
		System.out.println("SIngle Day Population = " + singleDayPop);
		//single year population = singleDayPop * 365.
		double singleYearPop = singleDayPop * 365.0;
		System.out.println("Single Year Population =  " + singleYearPop);
		
		System.out.println("Current population: " + (int)currentPop);
		for(int i = 0; i < 5; i++) {
			currentPop += singleYearPop;
			System.out.printf("Population after %d year(s) = %.4f%n",(i+1),currentPop);
		}
	}
}
