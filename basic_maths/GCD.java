package basic_maths;

public class GCD {
	/* GCD or HCF of 2 numbers
	 * 
	 * Example 1:
	 * Input: num1 = 4, num2 = 8
     * Output: 4
     * Explanation: Since 4 is the greatest number which divides both num1 and num2.

     * Example 2:
     * Input: num1 = 3, num2 = 6
     * Output: 3
     * Explanation: Since 3 is the greatest number which divides both num1 and num2.
     * 
     * Example 3:
     * Input: num1 = 96, num2 = 112
     * Output: 16
     * Explanation: 96 = 2 * 2 * 2 * 2 * 2 * 3
     *             112 = 2 * 2 * 2 * 2 * 7
     * 
     * Example 4:
     * Input: num1 = 60, num2 = 72
     * Output: 12
     * Explanation: 60 = 2 * 2 * 3 * 5
     *              72 = 2 * 2 * 2 * 3 * 3
     *              
     * Example 5:
     * Input: num1 = 90, num2 = 75
     * Output: 15
     * Explanation: 90 = 2 * 5 * 3 * 3
     *              75 = 3 * 5 * 5
	 */
	static int maths4(int a, int b)
	{
		// brute-force approach, Time Complexity: O(N)
		int gcd = 1;
		int mini = Math.min(a, b);
		for(int i = 1; i <= mini; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	static int maths(int a, int b)
	{
		/* Optimal Approach = Using Euclidean’s theorem
		 * Gcd is the greatest number which is divided by both a and b.
		 * If a number is divided by both a and b, it is should be divided by (a-b) and b as well.
		 * gcd(a,b) = gcd(b,a%b), a > b. Using this we can find gcd in log(min(a,b))
		 * Recursively call gcd(b,a%b) function till the base condition is hit.
         * b==0 is the base condition. When base condition is hit return a,as gcd(a,0) is equal to a.
         * Time Complexity: O(logɸmin(a,b)), where ɸ is 1.61
		 */
		if (b == 0) {
		      return a;
		    }
		    return maths(b, a % b);
	}
	public static void main(String[] args) {
		int a = 90, b = 75;
		System.out.println("Output : " + maths4(a, b));
		System.out.println("Output : " + maths(a, b));
    }
}
