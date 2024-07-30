package patterns;

public class BinaryNumberTrianglePattern {
	static void pattern11(int N)
	{
	    // This is the outer loop which will loop for the rows.
	    for (int i = 0; i < N; i++)
	    {
	    	for (int j = 0; j <= i; j++)
	        {
	    		if(i % 2 == 0) {
	    			if(j % 2 == 0)
	    			System.out.print("1 ");
	    			else
	    			System.out.print("0 ");
	    		} else {
	    			if(j % 2 == 0)
	    			System.out.print("0 ");
	    			else
	    			System.out.print("1 ");
	    		}
	        }
	    	System.out.println();
	    }
	}
	public static void main(String[] args) {
        int N = 5;
        pattern11(N);
    }
}
