
public class BabysitterCalculator {

	public static int startToBedtimePayRate = 12;
	public static int bedtimeToMidnightRate = 8;
	public static int midnightToLeaveRate = 16;
	
	public static Object calculateWages(int start, int bedtime, int leave) {
		int calculatedRate = 0;
		
		calculatedRate += (bedtime - start) * startToBedtimePayRate;
		
		if (leave != bedtime && bedtime < 12)
			calculatedRate += (12 - bedtime) * bedtimeToMidnightRate;
		
		if (leave < 5)
			calculatedRate += leave * midnightToLeaveRate;
		
		return calculatedRate;
		
	}

}
