package patterns;

public class SymmetricVoidPattern {
	static void pattern19(int N)
	{
		// for the upper half of the pattern.
		int spaces = 0;
		  for(int i = N; i >= 1; i--) {
			  for(int j = i; j >= 1; j--) {
				  System.out.print("*"); 
			  }
			  for(int k = 0; k < spaces; k++) {
					System.out.print(" ");
				}
			  for(int k = 0; k < spaces; k++) {
					System.out.print(" ");
				}
				spaces++;
				for(int j = i; j >= 1; j--) {
					System.out.print("*");
				}
			  System.out.println();
		   }
		// for the lower half of the pattern.
		  for(int i = 1; i <= N; i++) {
			  for(int j = 1; j <= i; j++) {
				  System.out.print("*");
			  }
			  for(int k = 1; k <= N-i; k++) {
				  System.out.print(" ");
			  }
			  for(int k = 1; k <= N-i; k++) {
				  System.out.print(" ");
			  }
			  for(int j = 1; j <= i; j++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		
	}
	public static void main(String[] args) {
        int N = 5;
        pattern19(N);
    }
}
