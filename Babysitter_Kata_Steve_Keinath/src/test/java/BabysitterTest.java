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
	
	//

}
