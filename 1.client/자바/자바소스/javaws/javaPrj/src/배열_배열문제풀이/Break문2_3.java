package 배열_배열문제풀이;

import java.util.Scanner;

public class Break문2_3 {
	public static void main(String[] args) {
		//메뉴 1.등록, 2.변경, 3.조회, 4종료
		
		Scanner sc = new Scanner (System.in);
		/*
		int menu;
		menu=sc.nextInt();
		System.out.println("메뉴 1.등록, 2.변경, 3.조회, 4종료");
		
		switch(menu) {
		case 1:
			System.out.println("등록선택!!");
			break;
		case 2:
			System.out.println("변경합니다");
			break;
		case 3:
			System.out.println("조회합니다");
			break;
		case 4:
			System.out.println("종료합니다");
			break;
		}
		*/
		
		loop: while(true) {
			int menu;
			menu=sc.nextInt();
			System.out.println("메뉴 1.등록, 2.변경, 3.조회, 4종료");
			
			switch(menu) {
			case 1:
				System.out.println("등록선택!!");
				break;
			case 2:
				System.out.println("변경합니다");
				break;
			case 3:
				System.out.println("조회합니다");
				break;
			case 4:
				System.out.println("종료합니다");
				break loop; // 반복문앞에 loop(반복문의 이름):
			}
		}
	}
}
