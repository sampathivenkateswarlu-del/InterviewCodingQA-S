package codingQsInLoops;
/*  prime numbers are : 2,3,5,7,11,13,17,19....
 *  condition 1 : 0 is not prime and 1 is not prime number
 *  condition 2 : exactly two distinct positive divisors:
 *					1. 1
 *					2. Itself
 *  condition 3 : If number > 2 and even
 *				  It is not prime
 *				  Reason: It is divisible by 2
 * 
 * Step-by-Step Process to Check a Number is Prime
 * Step 1: Take the number
 * Assume a number N
 * 
 * Step 2: Check base condition
 * If N ≤ 1 → Not prime
 * If N = 2 → Prime
 * 
 * Step 3: Check divisibility
 * Try dividing N by numbers starting from 2
 * Continue checking up to √N (square root of N)
 * Why only up to √N?
 * If N has a factor greater than √N, the corresponding smaller factor will already be checked.
 * 
 * Step 4: Evaluate result
 * If N is divisible by any number in this range → Not prime
 * If no divisors are found → Prime
 */
public class PrimeNumber_type1 {

	public static boolean isPrimeNumbers(int n) {
		boolean status = true;
		if (n == 0 | n == 1) {
			status = false;
		}
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if (isPrimeNumbers(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
