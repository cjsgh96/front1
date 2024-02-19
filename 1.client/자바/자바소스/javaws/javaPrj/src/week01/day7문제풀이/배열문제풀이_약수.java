package week01.day7문제풀이;

import java.util.Scanner;

public class 배열문제풀이_약수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int su[] = new int[20];
		int j=0;
		int input=sc.nextInt();

		if(input<=30) {
			for(int i=1;i<=input;i++) {
				if(input%i==0) {
					
					su[j]=i;
					System.out.print(su[j]+"  ");
					j++;
				}
				
				
			}
		}else {
			System.out.println("30이하의 숫자만 가능합니다.");
		}

	}

}
