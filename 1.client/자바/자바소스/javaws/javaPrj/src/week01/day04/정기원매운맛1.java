package week01.day4;

public class 정기원매운맛1 {

	public static void main(String[] args) {
		 
		int year=1999;
		double H= 2500000;
		double K =1800000;		
		final  double Hin =0.036;
		final double Kin  =  0.042;
		
		while( K<= H) {
			year= year+1;
			H= H + H*Hin;   
			K= K + K*Kin;
		}		
		System.out.println( year);
		

	}

}
