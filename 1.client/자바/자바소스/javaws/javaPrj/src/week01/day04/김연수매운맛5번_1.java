package week01.day04;

import java.util.Scanner;

public class 김연수매운맛5번_1 {

	public static void main(String[] args) {
		//변수선언
		
		int eng, mat, kor, avg;
		
		Scanner sc = new Scanner(System.in);
		
		eng= sc.nextInt();
		mat= sc.nextInt();
		kor= sc.nextInt();
		
		avg= (eng+mat+kor)/3;
		
		if(avg>=90) {
			System.out.println("Excellent");
			System.out.println("평균점수"+avg);			
		}
		if(avg<60) {//미만
			System.out.println("Fail");
			System.out.println("평균점수"+avg);
		}
		if(avg<90&&avg>=60) {
			System.out.println("평균점수"+avg);
		}

	}

}
