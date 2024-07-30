package patterns;

public class AlphaTrianglePattern {
	static void pattern18(int N)
	{
		char ch = 'A';
		for (int i = N; i > 0; i--)
	    {
	    	for (int j = i; j <= N; j++)
	        {
	    		System.out.print((char)(ch+j-1)+" ");
	        }
	    	System.out.println();
	    }
	}
	public static void main(String[] args) {
        int N = 5;
        pattern18(N);
    }
}
