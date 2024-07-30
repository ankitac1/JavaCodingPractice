package patterns;

public class RightAngledNumberPyramid2 {
	public static void nForest(int n) {
		for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i+" ");
        }
        System.out.println();
    }
	}
	public static void main(String[] args) {
        int n = 6;
        nForest(n);
    }
}
