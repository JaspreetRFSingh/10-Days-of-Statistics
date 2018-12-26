package day5;

import java.util.Scanner;

public class PoissonDistributionII {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double aMachine = scan.nextDouble();
        double bMachine = scan.nextDouble();
        scan.close();
        double dailyCostA = 160 + 40 * (aMachine + (aMachine * aMachine));
        double dailyCostB = 128 + 40 * (bMachine + (bMachine * bMachine));
        System.out.format("%.3f%n", dailyCostA);
        System.out.format("%.3f%n", dailyCostB);
    }

}
