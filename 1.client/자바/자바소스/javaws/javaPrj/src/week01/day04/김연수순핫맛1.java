package week01.day04;

public class 김연수순핫맛1 {

	public static void main(String[] args) {
		int SUM=0, N=0, i=0;
		while(i<=100) {
			if(i%2==1) {
				SUM+=i;
				System.out.println(N+" "+i+"="+SUM);
				N=SUM;
			}
			i++;
		}
		

	}

}
