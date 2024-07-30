package basic_maths;

public class CountDigits {
	/*-
	Example :
		Input: N = 12345
		Output: 5
    */
	
	/* Logic - Use logarithm base 10 to count the number of digits. - The number of digits in an integer = the upper bound of log10(n).
	 *
	 * n = 12345
	 * log10(12345) = 4.091
     * Integral part of 4.091 is 4 and 4 + 1 =  5 which is also the number of digits in 12345
	 *
	 * Time Complexity: O(1) 
	 * Space Complexity: O(1)
	 */
	
	static int maths1(int N)
	{
		int digits = (int) Math.floor(Math.log10(N) + 1);
        return digits;
	}
	public static void main(String[] args) {
		int N = 54969999;
        System.out.println("Output : " + maths1(N));
    }
}
