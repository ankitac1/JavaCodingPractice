package basic_maths;

public class ReverseANumber {
	static int maths2(int N)
	{
		int n = N;
		int reverse = 0;
		while(n != 0) {
			int d = n % 10;
			reverse = reverse*10 + d;
			n = n / 10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		int N = 12345;
		System.out.println("Output : " + maths2(N));
    }
}
