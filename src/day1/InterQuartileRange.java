package day1;

import java.util.Arrays;
import java.util.Scanner;

public class InterQuartileRange {
	
	
	static double computeMedian(int[] x, int beginIndex, int endIndex) {
		int size = endIndex - beginIndex + 1;
		if (size % 2 == 0) {
			return (x[beginIndex + size / 2 - 1] + x[beginIndex + size / 2]) / 2;
		} else {
			return x[beginIndex + size / 2];
		}
	}

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [][] arr = new int[n][2];
		int size = 0;
		for(int i=0; i<n; i++) {
			arr[i][0] = scan.nextInt();
		}
		for(int i=0; i<n; i++) {
			arr[i][1] = scan.nextInt();
			size+=arr[i][1];
		}
		int [] newArr = new int[size];
		int k=0;
		for(int i = 0; i<n; i++) {
			for(int j= 0; j<arr[i][1];j++) {
				newArr[k] = arr[i][0];
				k++;
			}
		}
		Arrays.sort(newArr);

		int lowerBound;
		int upperBound;
		if (size % 2 == 0) {
			lowerBound = size / 2 - 1;
			upperBound = size / 2;
		} else {
			lowerBound = size / 2 - 1;
			upperBound = size / 2 + 1;
		}
		double q1 = computeMedian(newArr, 0, lowerBound);
		double q3 = computeMedian(newArr, upperBound, size - 1);
		System.out.printf("%.1f",q3-q1);
		scan.close();
		
	}

}
