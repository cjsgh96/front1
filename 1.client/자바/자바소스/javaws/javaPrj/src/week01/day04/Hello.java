package week01.day04;

public class Hello {

	public static void main(String[] args) {


		int 
			year=1999;
		double 
			H= 2500000, K= 1800000,
			Hin= 0.036, Kin= 0.042;
		
		
		while(K<H) {
			year=year+1;
			H=H+(H*Hin);
			K=K+(K*Kin);
		}
		System.out.println(year);
		
		
		
	}
}
