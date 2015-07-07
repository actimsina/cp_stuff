import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PrimeFactorsTest {

	@Test
	public void testOfPrimeFactors() {
		assertEquals(Arrays.asList(), PrimeFactors.of(1));
		assertEquals(Arrays.asList(2), PrimeFactors.of(2));
		assertEquals(Arrays.asList(3), PrimeFactors.of(3));
		assertEquals(Arrays.asList(2, 2), PrimeFactors.of(4));
		assertEquals(Arrays.asList(5), PrimeFactors.of(5));
		assertEquals(Arrays.asList(2, 3), PrimeFactors.of(6));
		assertEquals(Arrays.asList(7), PrimeFactors.of(7));
		assertEquals(Arrays.asList(2,2,2), PrimeFactors.of(8));
		assertEquals(Arrays.asList(3, 3), PrimeFactors.of(9));
		assertEquals(Arrays.asList(2,3,5,7,11,13), PrimeFactors.of(2*3*5*7*11*13));
	}
}
