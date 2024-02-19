package week01.day7문제풀이;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		
		//1. 반복
		//	 수를 입력받는다.
		//	 총점을 구한다.
		//2. 평균을 구한다.
		//3. 평균을 출력한다.
		
		
		//성적을 5개 입력 받아서 구하기, 배열x
		Scanner sc = new Scanner (System.in);
		
		int input;
		double avg;
		int sum=0;
		
		for(int i=1;i<=5;i++) {
			input = sc.nextInt();
			sum=sum+input;
		}
			avg=sum/5.0;
			System.out.println(avg);
		
		//성적을 5개 입력 받아서 구하기, 배열O
		//모든 학생의 성적을 함께 출력하시오
			
		int[] scores = new int[5];
		int total=0;
		double avg_score;
		
		for(int i=0;i<5;i++) {
			scores[i]=sc.nextInt();
			total= total + scores[i];
		}
		/*
		//첫 번째 학생성적
		scores[0]= sc.nextInt();
		total= total + scores[0];
		//두번째 학생성적
		scores[1]= sc.nextInt();
		total= total + scores[1];
		//세번째 학생성적
		scores[2]= sc.nextInt();
		total= total + scores[2];
		//네번째 학생성적
		scores[3]= sc.nextInt();
		total= total + scores[3];
		//다섯번째 학생성적
		scores[4]= sc.nextInt();
		total= total + scores[4];
		*/
		
		//평균 구하기
		avg_score = total/5.0;
		System.out.println(avg_score);

	}

}
