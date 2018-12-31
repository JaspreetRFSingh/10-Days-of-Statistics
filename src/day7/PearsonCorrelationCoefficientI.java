package day7;

import java.util.Scanner;

public class PearsonCorrelationCoefficientI {
	
	static Double getMean(double [] array) {
        if (array == null) {
            return null;
        }
        double total = 0;
        for (double num : array) {
            total += num;
        }
        return total / array.length;
    }

    static Double standardDeviation(double [] array) {
        if (array == null) {
            return null;
        }
        double mean = getMean(array);
        double sum = 0;
        for (double x : array) {
            sum += Math.pow(x - mean, 2);
        }
        double variance = sum / array.length;
        return Math.sqrt(variance);
    }
	
    static Double pearsonCoeff(double [] xs, double [] ys) {
        if (xs == null || ys == null || xs.length != ys.length) {
            return null;
        }
        double xMean = getMean(xs);
        double yMean = getMean(xs);
        int n = xs.length;
        
        double numerator = 0;
        for (int i = 0; i < n; i++) {
            numerator += (xs[i] - xMean) * (ys[i] - yMean);
        }
        return numerator / (n * standardDeviation(xs) * standardDeviation(ys));
    }
    
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        double [] x = new double[n];
	        double [] y = new double[n];
	        for (int i = 0; i < n; i++) {
	            x[i] = scan.nextDouble();
	        }
	        for (int i = 0; i < n; i++) {
	            y[i] = scan.nextDouble();
	        }
	        scan.close();
	        
	        System.out.println(pearsonCoeff(x, y));
	    }
	    
	    
	    
}
