package week01.day9;

import java.util.Scanner;

public class 일정관리프로그램 {

	public static void main(String[] args) {
		
		String day[][] = new String[5][5];
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println("날짜를 입력하세요");
			String num_=sc.nextLine();
			int num =Integer.parseInt(num_);
			String num2_=sc.nextLine();
			int num2 =Integer.parseInt(num_);
			switch(num) {
			case 1:
				System.out.println("1일");
				System.out.println("1.일정등록 2.일정조회 3.일정변경 4.일정삭제 5.이전으로");

					switch(num2) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					}
			case 2:
				System.out.println("2일");
				System.out.println("1.일정등록 2.일정조회 3.일정변경 4.일정삭제 5.이전으로");
				switch(num2) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
				}
				
			case 3:
				System.out.println("3일");
				System.out.println("1.일정등록 2.일정조회 3.일정변경 4.일정삭제 5.이전으로");
				switch(num2) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
				}
			case 4:
				System.out.println("4일");
				System.out.println("1.일정등록 2.일정조회 3.일정변경 4.일정삭제 5.이전으로");
				switch(num2) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
				}
			case 5:
				System.out.println("5일");
				System.out.println("1.일정등록 2.일정조회 3.일정변경 4.일정삭제 5.이전으로");
				switch(num2) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
				}
			}
		}
		

	}

}
