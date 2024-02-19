package 함현지;

import java.util.Scanner;

public class Test56 {

	public static void main(String[] args) {
		//switch문 (분기문), 조건에 따라서 분기됨
		//메뉴 선택할때 주로 사용
		
		int menu; //1:등록, 2:조회, 3:변경, 4:삭제, 5:종료
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		while(n<5) {
			System.out.println("메뉴를 선택하시오 ==== >");
			System.out.println("1:등록, 2:조회, 3:변경, 4:삭제, 5:종료");
			menu = sc.nextInt();
		switch(menu) {
			case 1:
				System.out.println("등록합니다.");
				break;
			case 2:
				System.out.println("조회합니다.");
				break;
			case 3:
				System.out.println("변경합니다");
				break;
			case 4:
				System.out.println("삭제합니다");
				break;
			case 5:
				System.out.println("종료합니다");
				System.exit(0);
				break;
			default :
				System.out.println("정해진 범위 내의 숫자만 입력해라");
			}
		n++;
		}

	}

}
