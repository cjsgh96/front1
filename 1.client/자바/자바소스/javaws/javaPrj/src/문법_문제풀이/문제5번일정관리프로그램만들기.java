package 문법_문제풀이;
import java.util.Scanner;

public class 문제5번일정관리프로그램만들기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int select;
		select=sc.nextInt();
		
		switch(select) {
			case 1:
				System.out.println("등록됐습니다.");
				break;
			case 2:
				System.out.println("조회했습니다.");
				break;
			case 3:
				System.out.println("변경했습니다.");
				break;
			case 4:
				System.out.println("삭제했습니다.");
				break;
			default:
				System.out.println("잘못 선택했습니다.");
				break;
		}
		

	}

}
