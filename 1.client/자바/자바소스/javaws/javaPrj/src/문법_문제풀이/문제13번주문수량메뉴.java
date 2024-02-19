package 문법_문제풀이;
import java.util.Scanner;

public class 문제13번주문수량메뉴 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴를 선택해주세요");	
		
		String menu=sc.next();
		int n;
		int m1=10, m2=20, m3=30;
		
		switch(menu) {
		case "바베큐":
			System.out.println("수량을 선택해 주세요");
			n=sc.nextInt();;
			System.out.println("최종 가격은"+m1*n+"입니다.");
			break;
		case "콜라":
			System.out.println("수량을 선택해 주세요");
			n=sc.nextInt();;
			System.out.println("최종 가격은"+m2*n+"입니다.");
			break;
		case "치즈볼":
			System.out.println("수량을 선택해 주세요");
			n=sc.nextInt();;
			System.out.println("최종 가격은"+m3*n+"입니다.");
			break;
		}
		

		
	
		


		

	}

}
