package week01.day8;

import java.util.Scanner;

public class 함수문제풀이_1 {

	//수배열 매개변수가 짝수일 경우 갯수를 카운트해서 반환하는 함수
	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc = new Scanner (System.in);
		for(int i=1;i<=5;i++) {
			int user=sc.nextInt();
				sum= sum+짝수(user);
		}
		System.out.println("짝수의 갯수=>"+sum);
	}
	public static int 짝수(int user) {
		int cnt=0;
		if(user%2==0) {
			cnt++;
		}
		
		return cnt;
		
		
	}
	
}
