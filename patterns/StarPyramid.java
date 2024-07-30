package patterns;

public class StarPyramid {
	public static void nForest(int n) {
		for(int i = 0; i < n; i++) {
			// For printing the spaces before stars in each row
	        for (int j = 0; j< n-i-1; j++)
	        {
	            System.out.print(" ");
	        }
	       
	        // For printing the stars in each row
	        for(int j = 0; j < 2*i+1; j++){
	            
	            System.out.print("*");
	        }
	        
	        // For printing the spaces after the stars in each row
	         for (int j = 0; j < n-i-1; j++)
	        {
	            System.out.print(" ");
	        }
        System.out.println();
    }
	}
	public static void main(String[] args) {
        int n = 5;
        nForest(n);
    }
}
