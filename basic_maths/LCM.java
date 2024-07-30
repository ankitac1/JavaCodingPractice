package basic_maths;

public class LCM {
	/* LCM of 2 numbers
	 * 
	 * Example 1:
	 * Input: num1 = 4, num2 = 8
     * Output: 8
     *
     * Example 2:
     * Input: num1 = 3, num2 = 6
     * Output: 6
     * 
     * Example 3:
     * Input: num1 = 30, num2 = 20
     * Output: 60
     * Explanation: 30 = 2 * 3 * 5
     *              20 = 2 * 2 * 5
     * 
     * Example 4:
     * Input: num1 = 7, num2 = 35
     * Output: 35
     * Explanation: multiples of 7 = 7, 14, 21, 28, 35
     *              35 = 35
     *              
     * Example 5:
     * Input: num1 = 20, num2 = 84
     * Output: 420
     * Explanation: 20 = 2 * 2 * 5
     *              84 = 2 * 2 * 7 * 3
	 */
	static int gcd(int a, int b) {
		/*
		 * Optimal Approach = Using Euclidean’s theorem
		 * First find gcd using euclidean’s algorithm,
		 * Recursively call gcd(b,a%b) function till the base condition is hit.
         * b==0 is the base condition.When base condition is hit return a,as gcd(a,0) is equal to a.
	     * Once we get gcd,we can find lcm using formula lcm = (a*b)/gcd.
		 * Time Complexity: O(logɸmin(a,b)),where ɸ is 1.61.
		 */
		if (b == 0) {
		      return a;
		    }
		    return gcd(b, a % b);
	}
	static int lcm(int a, int b)
	{
		// brute-force approach, Time Complexity: O(N)
		/*
		 * lcm(a,b) = (a * b) / gcd(a,b)
		 */
				int gcd = 1;
				for(int i = 1; i <= Math.min(a, b); i++) {
					if (a % i == 0 && b % i == 0) {
						gcd = i;
					}
				}
				int lcm = (a * b) / gcd;
				return lcm;
	}
	public static void main(String[] args) {
		int a = 90, b = 75;
		System.out.println("Output : " + lcm(a, b));
		int gcd = gcd(a, b);
		int lcm = (a * b) / gcd;
		System.out.println("Output : " + lcm);
    }
}
