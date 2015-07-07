import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PrimeFactorsTest {

	@Test
	public void testOfPrimeFactors() {
		assertEquals(Arrays.asList(), PrimeFactors.of(1));
		// if (num > 1) {factors.add(num); }
		assertEquals(Arrays.asList(2), PrimeFactors.of(2));
		assertEquals(Arrays.asList(3), PrimeFactors.of(3));
		// if(num % 2 == 0) {factors.add(num); num /= 2;} if (num > 1) {factors.add(num);}
		assertEquals(Arrays.asList(2, 2), PrimeFactors.of(4));
		assertEquals(Arrays.asList(5), PrimeFactors.of(5));
		assertEquals(Arrays.asList(2, 3), PrimeFactors.of(6));
		assertEquals(Arrays.asList(7), PrimeFactors.of(7));
		// while(num % 2 == 0) {factors.add(num); num /= 2}
		assertEquals(Arrays.asList(2,2,2), PrimeFactors.of(8));
		// comes with the final solution
		assertEquals(Arrays.asList(3, 3), PrimeFactors.of(9));
		assertEquals(Arrays.asList(2,3,5,7,11,13), PrimeFactors.of(2*3*5*7*11*13));
	}
}
