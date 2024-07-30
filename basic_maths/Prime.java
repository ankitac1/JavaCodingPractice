package basic_maths;

public class Prime {
	/*
	 * Given a number, check whether it is prime or not. A prime number is a natural
	 * number that is only divisible by 1 and by itself and total no. of divisors = 2.
	 * 
	 * Examples 2 3 5 7 11 13 17 19 …
	 */
	// Time Complexity: O(n)
	public static boolean isPrimeBruteForceApproach(int N)
	{
		for (int i = 2; i < N; i++) {
		      if (N % i == 0) {
		        return false;
		      }
		    }
		    return true;
		    }

	// Time Complexity: O(√n)
  public static boolean isPrimeOptimalApproach(int N) {
    for (int i = 2; i < Math.sqrt(N); i++) {
      if (N % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static void main(String args[]) {
    int n = 7;
    boolean ans = (isPrimeOptimalApproach(n));
    if (n != 1 && ans == true) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Non Prime Number");
    }
    boolean answer = (isPrimeBruteForceApproach(n));
    if (n != 1 && answer == true) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Non Prime Number");
    }
  }
}
