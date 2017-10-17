import static org.junit.Assert.*;

import org.junit.Test;

public class BabysitterTest {
	
	public static int startToBedtimePayRate = 12;
	public static int bedtimeToMidnightRate = 8;
	public static int midnightToLeaveRate = 16;
	
	@Test
	public void CheckRateForTimeWorkedBetweenStartAndBedtimeOneHourShouldBe12() {
		assertEquals((1 * startToBedtimePayRate),BabysitterCalculator.calculateWages(5,6,6));
	}
	
	@Test
	public void CheckRateForTimeWorkedBetweenStartAndBedtimeTwoHourShouldBe24() {
		assertEquals((2 * startToBedtimePayRate),BabysitterCalculator.calculateWages(5,7,7));
	}
	
	@Test
	public void CheckRateForTimeWorkedBetweenBedtimeAndMidnightOneHourShouldBe8() {
		assertEquals((1 * bedtimeToMidnightRate),BabysitterCalculator.calculateWages(11,11,12));
	}
	
	@Test
	public void CheckRateForTimeWorkedBetweenBedtimeAndMidnightTwoHoursShouldBe16() {
		assertEquals((2 * bedtimeToMidnightRate),BabysitterCalculator.calculateWages(10,10,12));
	}
	
	@Test
	public void CheckRateForTimeWorkedBetweenMidnightAndLeaveOneHourShouldBe16() {
		assertEquals((1 * midnightToLeaveRate),BabysitterCalculator.calculateWages(12,12,1));
	}
	
	@Test
	public void CheckRateForTimeWorkedBetweenMidnightAndLeaveTwoHoursShouldBe32() {
		assertEquals((2 * midnightToLeaveRate),BabysitterCalculator.calculateWages(12,12,2));
	}
	
	@Test
	public void CheckRateCalcWhenStartIs6AndBedtimeis8AndLeaveIs12ShouldBe56() {
		assertEquals((2 * startToBedtimePayRate)+(4 * bedtimeToMidnightRate)+(0 * midnightToLeaveRate),BabysitterCalculator.calculateWages(6,8,12));
	}
	
	@Test
	public void CheckRateCalcWhenStartIs6AndBedtimeis8AndLeaveIs2ShouldBe88() {
		assertEquals((2 * startToBedtimePayRate)+(4 * bedtimeToMidnightRate)+(2 * midnightToLeaveRate),BabysitterCalculator.calculateWages(6,8,2));
	}

}
