package day4;

public class GeometricDistributionI {

	
	public static final float P_DEFECT = (float)1/3;
    public static final int FIRST_DEFECT = 5;
    
    public static double firstDefect(int defect){
        return Math.pow(1-P_DEFECT, defect-1)*Math.pow(P_DEFECT, 1);
    }
    
    public static void main(String[] args){
        System.out.println(String.format("%.3f", firstDefect(FIRST_DEFECT)));
    }

}
