package patterns;

public class IncreasingLetterTrianglePattern {
	static void pattern14(int N)
	{
		char ch = 'A';
		for (int i = 0; i < N; i++)
	    {
	    	for (int j = 0; j <= i; j++)
	        {
	    		System.out.print((char)(ch+j)+" ");
	        }
	    	System.out.println();
	    }
	}
	public static void main(String[] args) {
        int N = 5;
        pattern14(N);
    }
}
