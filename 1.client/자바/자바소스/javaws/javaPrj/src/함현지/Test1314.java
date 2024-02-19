package 함현지;

import java.util.Scanner;

public class Test1314 {

	public static void main(String[] args) {
		//문제 13,14번
		Scanner sc = new Scanner(System.in);
		//메뉴 이름에 따른 단가 구하기
		while(true) {
			String name = sc.nextLine();
			int price=0;
			
			switch(name) {
			case "아메리카노" :
				price=1500;
				break;
			case "카푸치노" :
				price=2700;
				break;
			case "아이스아메리카노" :
				price=2000;
				break;
			case "0" :
				System.out.println("종료합니다.");
				System.exit(0);
			default :
				System.out.println("현재 메뉴에 없는 메뉴입니다. 다시 입력하세요");
				continue;
				
			}
			System.out.println(name+"의 가격은 "+price+"원 입니다.");
		}
		

	}

}
