package week01.day04;

public class 매운맛1번 {

	public static void main(String[] args) {
		int years=1999;
		double h=250;
		double k=180;
		double r_h=1.036;
		double r_k=1.042;
		
		while(k<=h) {
			h=h*r_h;
			k=k*r_k;
			years=years+1;
		}
		System.out.println(years);
	}

}
