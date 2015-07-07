import java.util.ArrayList;


public class PrimeFactors {

	public static ArrayList<Integer> of(int num) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		int divisor = 2;
		while (num > 1){
			while (num % divisor == 0) {
				factors.add(divisor);
				num /= divisor;
			}
			divisor++;

			//			if (num > 1){
			//				factors.add(num);
			//			}
		}
		return factors;
	}

}
