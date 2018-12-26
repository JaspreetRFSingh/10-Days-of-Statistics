package day0;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedianMode {

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
    
    private static double computeMedian(int[] arr) {
        double median = 0;
        int size = arr.length;
        int [] copy = arr.clone();
        Arrays.sort(copy);
        if(size % 2 == 0)
            median = (double) (copy[size/2 - 1] + copy[size/2]) / 2;
        else {
            median = (double) copy[(size-1)/2];
        }
        return median;
    }
    
    private static int computeMode(int[] arr) {
        int mode = 0;
        int size = arr.length;
        int [] copy = arr.clone();
        Arrays.sort(copy);
        int count = 0, max = 0;
        int current = copy[0];
        for(int i = 0;i < size;i++) {
            if (copy[i] == current) {
                count++;
            } else {
                count = 1;
                current = copy[i];
            }
            if (count > max) {
                max = count;
                mode = copy[i];
            }
        }
        return mode;
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] data = new int[size]; 
        for(int i = 0;i < size;i++) {
            data[i] = in.nextInt();
        }
        System.out.println(computeMean(data));
        System.out.println(computeMedian(data));
        System.out.println(computeMode(data));
        in.close();
	}
}
