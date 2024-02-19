package week01.day9;

import java.util.Scanner;

public class 상품관리프로그램작성1 {

	public static void main(String[] args) {
		
		//상품배열 준비
		String[] goods = new String[5];
		int index =0;
		
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			System.out.println("메뉴를 선택하세요 1. 등록, 2.조회, 3.변경, 4.삭제, 5.종료");
			String menu =sc.nextLine();
			
		loop:switch(menu) {
			case "1":
				System.out.println("등록할 상품을 입력하세요");
				String name = sc.nextLine();
				goods[index]= name;
				index++;
				break;
			case "2":
				System.out.println("상품을 조회 합니다");
				for(int i=0;i<index;i++) {
					if(goods[i].equals("0")) {
					}else {
					System.out.println(goods[i]);
					}
				}
				
				break;
			case "3":
				System.out.println("변경");
				System.out.println("상품을 조회 합니다");
				for(int i=0;i<index;i++) {
					if(goods[i].equals("0")) {
						
					}else {
					System.out.println((i+1)+goods[i]);
					}
				}
					
				System.out.println("변경할 상품을 선택하세요");
				String choice_ = sc.nextLine(); 
				int choice = Integer.parseInt(choice_);
				System.out.println("변경할 상품의 이름을 입력하세요");
				String newName = sc.nextLine();
				goods[choice-1] = newName;
				break;
			case "4":
				System.out.println("삭제"); // 요소 0 으로 저장함
				System.out.println("상품을 조회 합니다");
				for(int i=0;i<index;i++) {
					
					if(goods[i].equals("0")) {
						
					}else {
					System.out.println((i+1)+goods[i]);
					}
				}
				System.out.println("삭제할 상품을 선택하세요");
				 choice_ =sc.nextLine();
				 choice = Integer.parseInt(choice_);
				goods[choice-1]="0";
				break;
			case "5":
				System.out.println("종료");
				break loop;
			default :
				System.out.println("잘못된 메뉴");
				//프로그램 종료
				System.exit(0);
			}
		}

	}

}
