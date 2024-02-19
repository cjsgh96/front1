package week01.day04;

public class 여민혜매운맛1 {

	public static void main(String[] args) {
		//변수
		
		double H= 250;
		double K= 180;
		int cnt=1999;
		
		while(K<=H){
			H= H+(H*0.036);
			K= K+(K*0.042);
			cnt=cnt+1;
		}
		System.out.println(cnt);
	}

}
