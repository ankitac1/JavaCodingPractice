package patterns;

public class TheNumberPattern {
	
	static void pattern22(int N)
	{
		/*-
		 * 4444444
		 * 4333334
		 * 4322234
		 * 4321234
		 * 4322234
		 * 4333334
		 * 4444444
		 */
		// First we subtract N - each cell value to get a new matrix
		/*-
		 * 0000000
		 * 0111110
		 * 0122210
		 * 0123210
		 * 0122210
		 * 0111110
		 * 0000000
		 */
		// After generating this pattern, we can get the original matrix by N - each cell value
		// Logic - we take min(top, left, right, down) distance
		// top dist = i
		// left dist = j
		// right dist = (2*n-1) - 1 - j
		// bottom dist = (2*n-1) - 1 - i
		
		for(int i = 0; i < N*2-1; i++) {
	         for(int j = 0; j < N*2-1; j++) {
	        	 // Initializing the top, down, left and right indices of a cell.
	             int top = i;
	             int bottom = j;
	             int right = (2*N - 2) - j;
	             int left = (2*N - 2) - i;
	             
	             // Min of 4 directions and then we subtract from n
	             System.out.print(N - Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
	         }
	         System.out.println();
	         }     
	}
	public static void main(String[] args) {
        int N = 4;
        pattern22(N);
    }
}
