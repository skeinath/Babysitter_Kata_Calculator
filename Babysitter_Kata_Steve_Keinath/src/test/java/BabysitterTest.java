import static org.junit.Assert.*;

import org.junit.Test;

public class BabysitterTest {

	@Test
	public void CheckRateForTimeWorkedBetweenStartAndBedtimeOneHourShouldBe12() {
		assertEquals(12,BabysitterCalculator.calculateWages(5,6,6));
	}
	
	@Test
	public void CheckRateForTimeWorkedBetweenStartAndBedtimeTwoHourShouldBe24() {
		assertEquals(24,BabysitterCalculator.calculateWages(5,7,7));
	}
	
	@Test
	public void CheckRateForTimeWorkedBetweenBedtimeAndMidnightOneHourShouldBe8() {
		assertEquals(8,BabysitterCalculator.calculateWages(11,11,12));
	}
	
	@Test
	public void CheckRateForTimeWorkedBetweenBedtimeAndMidnightTwoHoursShouldBe16() {
		assertEquals(16,BabysitterCalculator.calculateWages(10,10,12));
	}
	
	@Test
	public void CheckRateForTimeWorkedBetweenMidnightAndLeaveOneHourShouldBe16() {
		assertEquals(16,BabysitterCalculator.calculateWages(12,12,1));
	}
	
	@Test
	public void CheckRateForTimeWorkedBetweenMidnightAndLeaveTwoHoursShouldBe32() {
		assertEquals(32,BabysitterCalculator.calculateWages(12,12,2));
	}

}
