
public class BabysitterCalculator {

	public static Object calculateWages(int start, int bedtime, int leave) {
		int calculatedRate = 0;
		
		calculatedRate += (bedtime - start) * 12;
		
		if (leave != bedtime && bedtime < 12)
			calculatedRate += (12 - bedtime) * 8;
		
		if (leave < 5)
			calculatedRate += leave * 16;
		
		return calculatedRate;
		
	}

}
