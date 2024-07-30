package basic_maths;

import java.util.ArrayList;

/*
 * Problem Statement: Given a number, print all the divisors of the number.
 * A divisor is a number that gives the remainder as zero when divided.
 */
public class AllDivisors {
/*
 * Example 1:
 * Input: n = 36
 * Output: 1 2 3 4 6 9 12 18 36
 * Explanation: All the divisors of 36 are printed.
 *
 * Example 2:
 * Input: n = 97
 * Output: 1 97
 * Explanation: Since 97 is a prime number, only 1 and 97 are printed.
 */
	// Brute Force Approach, Time Complexity: O(n), because the loop has to run from 1 to n always.
	static void divisors(int n)
	{
		for(int i = 1; i <= n; i++) {
			if(n % i == 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}
	// Time Complexity: O(sqrt(n)), because every time the loop runs only sqrt(n) times.
	/* If we take a closer look, we can notice that the quotient of a division by one of the divisors 
	 * is actually another divisor. Like, 4 divides 36. The quotient is 9, and 9 also divides 36.
     * Another intuition is that the root of a number actually acts as a splitting part of all the 
     * divisors of a number.
     * Also, the quotient of a division by any divisor gives an equivalent divisor on the other side.
     * Like, 4 gives 9 while dividing 36.
     */
	static void divisorsOptimal(int n)
	{
		// i*i <= n takes less time compared to Math.sqrt(n) as it is a library function
		for(int i = 1; i <= (int)Math.sqrt(n); i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			if(i != n/i) System.out.print(n/i + " ");
			}
		}
	}
	public static void main(String[] args) {
		int n = 36;
		divisors(n);
		divisorsOptimal(n);
    }
}
