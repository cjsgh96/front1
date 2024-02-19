package week01.day04;

public class 순한맛1번 {

	public static void main(String[] args) {
		
		//1+3+5+7+9...99 의 합을 구하시오
		
		//변수
		int sum=0;
		int i=1;
		
		while(i<=99) {
			if(i%2!=0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);

	}

}
