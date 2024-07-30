package patterns;

public class AlphaRampPattern {
	static void pattern16(int N)
	{
		char ch = 'A';
		for (int i = 0; i < N; i++)
	    {
	    	for (int j = 0; j <= i; j++)
	        {
	    		System.out.print(ch+" ");
	        }
	    	System.out.println();
	    	ch++;
	    }
	}
	public static void main(String[] args) {
        int N = 5;
        pattern16(N);
    }
}
