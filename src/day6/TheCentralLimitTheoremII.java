package day6;

public class TheCentralLimitTheoremII {

	static double cumulativeProbability(double mean, double std, double x) {
        double parameter = (x - mean) / (std * Math.sqrt(2));
        return (0.5) * (1 + erf(parameter));
    }
	
	static double erf(double z) {
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

        double ans = 1 - t * Math.exp( -z*z   -   1.26551223 +
                                            t * ( 1.00002368 +
                                            t * ( 0.37409196 + 
                                            t * ( 0.09678418 + 
                                            t * (-0.18628806 + 
                                            t * ( 0.27886807 + 
                                            t * (-1.13520398 + 
                                            t * ( 1.48851587 + 
                                            t * (-0.82215223 + 
                                            t * ( 0.17087277))))))))));
        if (z >= 0) {
        	return  ans;
        }
        else{
        	return -ans;
        }
	}
	
	
	public static void main(String[] args) {
        double ticketsLeft = 250;
        int n = 100;
        double mean = 2.4;
        double std = 2;
        double samplesMean = n * mean;
        double samplesSTD  = Math.sqrt(n) * std;

        System.out.printf("%.4f", cumulativeProbability(samplesMean, samplesSTD, ticketsLeft));
    }
	
}
