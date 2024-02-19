package week01.day8;

import java.util.Scanner;

public class 함수_입력받은값만큼별찍기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("생성할 별 갯수를 입력하세요");
		
		int input=sc.nextInt();
		star(input);
		
	}
	
	
	public static void star(int su){
		
		for(int i=1;i<=su;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
