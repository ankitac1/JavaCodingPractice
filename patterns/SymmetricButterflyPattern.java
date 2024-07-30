package patterns;

public class SymmetricButterflyPattern {
	static void pattern20(int N)
	{
		// for the upper half of the pattern.
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int k = 1; k <= N*2-(i+i); k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// for lower half of the pattern.
		int sp = 1;
		for(int i = N-1; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int k = 1; k <= (sp+sp); k++) {
				System.out.print(" ");
			}
			sp++;
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
        int N = 5;
        pattern20(N);
    }
}
