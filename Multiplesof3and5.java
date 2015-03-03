
public class Multiplesof3and5 {
	public static void main(String[] args) {	
		
		// set sum as 0
		int sum = 0;
				
		// set n as first natural number, range from 0 to 999, and increment
		for (int n = 0; n <= 999; n++){
			if (n % 3 == 0 || n % 5 == 0) {
				sum += n;
			}				
		}

		// print the sum of all multiples of 3 and 5 from 0 to 1000
		System.out.println(sum);
	}
}
