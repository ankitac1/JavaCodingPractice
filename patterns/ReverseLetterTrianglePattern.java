package patterns;

public class ReverseLetterTrianglePattern {
	
	static void pattern15(int N)
	{
		char ch = 'A';
		for (int i = N; i >= 1; i--)
	    {
	    	for (int j = 0; j < i; j++)
	        {
	    		System.out.print((char)(ch+j)+" ");
	        }
	    	System.out.println();
	    }
	}
	public static void main(String[] args) {
        int N = 5;
        pattern15(N);
    }
}
