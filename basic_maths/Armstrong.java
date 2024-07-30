package basic_maths;

public class Armstrong {
	/*
	 * Example 1:
     * Input:153 
     * Output: Yes, it is an Armstrong Number
     * No. of digits, d = 3
     * Explanation: 1^3 + 5^3 + 3^3 = 153
	 *
     * Input:170 
     * Output: No, it is not an Armstrong Number
     * Explanation: 1^3 + 7^3 + 0^3 != 170
     * 
     * Input:1634
     * Output: Yes, it is an Armstrong Number
     * No. of digits d = 4
     * Explanation: 1^4 + 6^4 + 3^4 + 4^4 = 1634
     *
	 * Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number.
	 * Examples - 0, 1, 153, 370, 371, 407, and 1634 are some of the Armstrong Numbers.
	 * 
	 * Time Complexity: O(n) where n is the number of digits since we need to traverse
	 * every digit and add digits raised to power no. of digits to sum.
	 */
	static boolean arm(int n)
	{
		int num = n;
		int n1 = n;
		int c = 0;
		int sum = 0;
		while (n != 0) {
			c++;
			n = n / 10;
		}
		while (num != 0) {
			int d = num % 10;
			sum += Math.pow(d, c);
			num /= 10;
		}
		return (sum == n1);
	}
	public static void main(String[] args) {
		int n = 143;
		System.out.println("Is armstrong? " + arm(n));
    }
}
