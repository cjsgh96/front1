package week01.day8;

import java.util.Scanner;

public class 함수_실습랜덤점심메뉴 {
	public static void main(String [] args) {
		
		/*String name ="안녕";
		if( name.equals("안녕")) {
			
		}*/
		Scanner sc = new Scanner (System.in);		
		
		System.out.println(" 1.점심메뉴보기 , 2.종료");
		
		int menu  = sc.nextInt();
		
		switch( menu) {
		
		case  1:
			String result=  점심메뉴();
			System.out.println(result);
			
		case 2:
			System.out.println("종료합니다");
		}
		
		

	}
	
	public static String	점심메뉴() {
		String[] menu = { "피자", "파스타", "스테이크", "샐러드", "스시", "햄버거", "타코", "라면",
				"간짜장", "카레", "샌드위치", "프라이드 치킨", "떡볶이", "갈비", "짜장면", "된장찌개",
				"감바스 알 아히요", "카프레제 샐러드", "새우튀김", "삼겹살", "갈비탕", "스프",
				"라자냐", "해산물 찜", "고기 국수", "초밥", "생선구이", "타파스", "타코 샐러드", "파스타 카본라" } ;
		
		int i = (int)(Math.random()*29+1);
		
		return menu[i];
		
	}
}
