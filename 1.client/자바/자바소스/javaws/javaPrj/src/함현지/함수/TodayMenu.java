package 함현지.함수;

import java.util.Scanner;

public class TodayMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("볶음밥/덮밥 추천기를 사용하시겠습니까? (y/n) : ");
		String user = sc.next();
			if(user.equals("y") || user.equals("Y")) {
				menu();
				System.out.println(" 추천합니다!!");
			}else if(user.equals("n") || user.equals("N")){
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("다시입력해주세요");
			}
		}
	}
	public static void menu() {
		String[] menu = {"베이컨볶음밥","김치볶음밥","간장계란밥","소고기볶음밥","스팸볶음밥","해물볶음밥","굴소스새우볶음밥","제육치즈새우볶음밥",
						"새우볶음밥","카레덮밥","짜장밥","오징어덮밥","오므라이스","육회비빔밥","김치알밥","참치김치볶음밥","치킨마요덮밥"};
		int index = (int)(Math.random()*(menu.length-1));
		System.out.print(menu[index]);
	}

}
