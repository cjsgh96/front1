package 문법_문제풀이;
import java.util.Scanner;

public class 문제7번짝수의합구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int user;
		int sum=0;
		int cnt=0;
		
		for(int i=1;i<=10;i++) {
			user=sc.nextInt();
			if(user%2==0) {
				
				sum=sum+user;
				
			}else{cnt++;
			}
		}
		
		
		
		System.out.println("10개의수중 짝수만을 더한 값= "+sum);
		System.out.println("홀수의 갯수= "+cnt);
	}

}
