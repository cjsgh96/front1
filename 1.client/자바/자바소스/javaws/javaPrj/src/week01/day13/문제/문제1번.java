package week01.day13.문제;

import java.util.Scanner;

public class 문제1번 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input=sc.nextInt();
		int sum=0;
		for(int i=1;i<=9;i++) {
			
			sum=input*i;
			System.out.println(input+"x"+i+"="+sum);
		}

	}

}
