package patterns;

public class HalfDiamondStarPattern {
	static void pattern10(int N)
	{	
		for(int i=1;i<=2*N-1;i++){
	          // stars would be equal to the row no. uptill first half
	          int stars = i;
	          
	          // for the second half of the rotated triangle.
	          if(i>N) stars = 2*N-i;
	          // for printing the stars in each row.
	          for(int j=1;j<=stars;j++){
	              System.out.print("*");
	          }
	          System.out.println();
	      }
	}
	public static void main(String[] args) {
        int N = 5;
        pattern10(N);
    }
}
