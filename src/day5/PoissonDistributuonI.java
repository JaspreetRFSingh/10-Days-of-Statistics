package day5;

import java.util.Scanner;

public class PoissonDistributuonI {

	static double poissonDist(int xP, double lP) {
    	double res = (Math.pow(lP, xP) * Math.pow(Math.E, -1 * lP)) / factorial(xP);
        return res;
    }
	
	static Long factorial (int n) {
        if (n < 0) {
            return null;
        }
        long result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double l = scan.nextDouble();
        int x = scan.nextInt();
        scan.close();
        System.out.println(poissonDist(x, l));
    }

}
