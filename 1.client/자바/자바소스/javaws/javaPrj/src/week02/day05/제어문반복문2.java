package week02.day05;

import java.util.Scanner;

public class 제어문반복문2 {

	public static void main(String[] args) {
		// while, do~while
		
		//"인사하기" 3번 출력
		
		int i=1;
		while(i<=10) {
			System.out.println("하이! 즐거운 금요일!!!");
			System.out.println(i);
			i++;
		}
		
		int input;
		Scanner sc = new Scanner(System.in);
		while(true) {
			input = sc.nextInt();
			if(input==0) break; // 반복문을 종료할 때 사용함
			System.out.println("하이 !!!");
		}
		System.out.println("바이 !!!");
		
		//do~while
		//1~10까지의 합
		int n=1;
		int sum=0;
		do {
			sum=sum+n;
			n=n+1;
		}while(n<=10);
		
		System.out.println(sum);

	}

}
