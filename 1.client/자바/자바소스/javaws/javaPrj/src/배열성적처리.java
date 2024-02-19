package week02.day07;

import java.util.Scanner;

public class 배열성적처리처리과정 {
	static public void main(String args[]) {
		final int MAX = 60, SUBJECT = 3;
		
		String[] name = new String[MAX];
		int[][] score = new int[MAX][SUBJECT];

		int[] sum = new int[MAX];
		double[] avg = new double[MAX];

		double kor_avg, eng_avg, math_avg;
		int kor_sum = 0, eng_sum = 0, math_sum = 0;
		
		int i = 0;
		
		String output;

		System.out.println("학생 성적 정보를 입력하세요 (60명)");
		System.out.println("이름 국어성적 영어성적 수학성적");
		System.out.println("ex) 학생1 50 60 99");
		
		Scanner sc = new Scanner(System.in);
		
		while (i < MAX) {
			name[i] = sc.next();		// 이름 입력
			score[i][0] = sc.nextInt();	// 국어 성적 입력
			score[i][1] = sc.nextInt();	// 영어 성적 입력
			score[i][2] = sc.nextInt();	// 수학 성적 입력
			
			sum[i] = score[i][0] + score[i][1] + score[i][2];	// 합계 계산
			avg[i] = (double)sum[i] / SUBJECT;								// 평균 계산

			kor_sum = kor_sum + score[i][0]; // 국어 성적 합계
			eng_sum = eng_sum + score[i][1]; // 영어 성적 합계
			math_sum = math_sum + score[i][2]; // 수학 성적 합계
			
			// 출력 문자열 생성
			output = name[i] + " " + score[i][0] + " "+ score[i][1] + " "+ score[i][2] + " "+ avg[i] + " ";
			if (avg[i] >= 90)		// 90 이상은 Exellent 추가
				output = output + "Exellent";
			else if (avg[i] < 60)	// 60 미만은 Fail 추가
				output = output + "Fail";
			// 출력
			System.out.println(output);
			i++;
		}

		kor_avg = (double)kor_sum / MAX;	// 국어 총 평균 계산
		eng_avg = (double)eng_sum / MAX;	// 영어 총 평균 계산
		math_avg = (double)math_sum / MAX;	// 수학 총 평균 계산
		
		System.out.println(kor_avg + " " + eng_avg + " " + math_avg);
		
		sc.close();
	}
}
