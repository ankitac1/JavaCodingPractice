package patterns;

public class AlphaHillPattern {
	static void pattern17(int N)
	{
		char ch = 'A';
		for (int i = 1; i <= N; i++)
	    {
			for (int j = i; j <= N-1; j++)
	        {
	    		System.out.print(" ");
	        }
	    	for (int j = 0; j < i; j++)
	        {
	    		System.out.print((char)(ch+j));
	        }
	    	for (int j = i-1; j >= 1; j--)
	        {
	    		System.out.print((char)(ch+j-1));
	        }
	    	System.out.println();
	    }
	}
	public static void main(String[] args) {
        int N = 4;
        pattern17(N);
    }
}
