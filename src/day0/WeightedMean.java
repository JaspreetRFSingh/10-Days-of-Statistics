package day0;

public class WeightedMean {

	static double calculateWeightedMean(int[] x, int[] w) {
		double mean = 0;
		int denom = 0;
		int numer = 0;
		int len = x.length;
		for(int i =0 ; i<len; i++) {
			denom = denom + w[i];
			numer = numer + w[i]*x[i];
		}
		mean = (double) numer/denom;
		return mean;
	}
	
	public static void main(String[] args) {
		int[] x = {10, 41, 30, 50,20};
		int[] w = {1,2,3,4,5};
		System.out.printf("%.1f\n", calculateWeightedMean(x, w));
	}

}
