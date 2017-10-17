
public class BabysitterCalculator {

	public static Object calculateWages(int start, int bedtime, int leave) {
		int calculatedRate = 0;
		
		calculatedRate += (bedtime - start) * 12;
		
		return calculatedRate;
		
	}

}
