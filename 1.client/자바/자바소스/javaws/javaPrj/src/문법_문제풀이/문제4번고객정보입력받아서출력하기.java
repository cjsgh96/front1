package 문법_문제풀이;

import java.util.Scanner;

public class 문제4번고객정보입력받아서출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		
		String id=sc.next();
		String name=sc.next();
		String age=sc.next();
		String k=sc.next();
		
		System.out.println("id: "+id);
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("키: "+k);
		

	}

}
