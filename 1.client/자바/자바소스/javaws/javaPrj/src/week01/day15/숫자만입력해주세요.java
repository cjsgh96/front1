package week01.day15;

import java.util.Scanner;

public class 숫자만입력해주세요 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//숫자만 입력 받을 수 있는 코드 , 숫자가 아닌경우 예외가 발생됨 
		while (true) {
			String input = sc.nextLine();
			System.out.println(" 숫자로 입력해 주세요");
			try {
				int a = Integer.parseInt(input);

			} catch (Exception e) {
				continue;
			}
			break;

		}

	}

}
