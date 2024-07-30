package basic_maths;

public class Palindrome {
	// An integer is considered a palindrome when it reads the same backward as forward. eg : 121
	/*
	* Time Complexity: O(log N) for reversing N digits of input integer.
	* Space Complexity: O(1)
	*/
	static boolean maths3(int N)
	{
		int n = N;
		int reverse = 0;
		while(n != 0) {
			//Extract the last digit
			int d = n % 10;
			//Appending last digit
			reverse = reverse * 10 + d;
	        // Shrinking n by discarding the last digit
			n = n / 10;
		}
		if (reverse == N)
		return true;
		else
		return false;
	}
	public static void main(String[] args) {
		int N = 121;
		System.out.println("Output : " + maths3(N));
    }
}
