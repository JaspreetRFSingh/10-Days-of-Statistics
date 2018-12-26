package day1;

import java.util.Scanner;

public class StandardDeviation {

	private static double computeMean(int[] arr) {
        double mean = 0;
        int sum = 0;
        int size = arr.length;
        for(int i : arr) {
            sum += i;
        }
        mean = (double) sum/size;
        return mean;
    }
	
	static double computeStandardDeviation(double[] data, double mean, int n) {
		double standardDeviation  = 0;
		double sumDev = 0;
		for(int i=0; i<n; i++) {
			sumDev+= data[i];
		}
		double meanDev = sumDev/n;
		standardDeviation = Math.sqrt(meanDev);
		return standardDeviation;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n ; i++) {
			arr[i] = scan.nextInt();
		}
		double mean = computeMean(arr);
		double[] data = new double[n];
		for(int i=0; i<n; i++) {
			data[i] = Math.pow((arr[i]-mean),2);
			System.out.println(data[i]);
		}
		System.out.printf("%.1f",computeStandardDeviation(data, mean, n));
		
		scan.close();
	}

}
