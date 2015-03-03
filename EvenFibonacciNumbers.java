
public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		
		// Initialize values
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int temp = 0;
		

		do { // Check 2nd number to see if it's even, and if so, add it to the sum
			if (num2 % 2 == 0){
				sum += num2;
			}		
			
			// Fibonacci math
			temp = num2;
			num2 += num1;
			num1 = temp;
		} while (num2 < 4000000);
		
		// print the sum of all even Fibonacci numbers from 0 to 4 million
		System.out.println(sum);
	}

}
