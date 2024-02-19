package 문법_문제풀이;

import java.util.Scanner;

public class 문제3번입력받은수까지의합구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int usernum1;
		int sum=0;
		usernum1=sc.nextInt();
		
		
		for(int i=1;i<=usernum1;i++) {
			sum=sum+i;
			
			
		}
		System.out.println(sum);
	}

}
