package 함현지;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		//문제11번
		//3단 출력
		for(int i=1;i<=9;i++) {
			System.out.println("3*"+i+"="+3*i);
		}
		//1~9단 출력
		int result;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				result = i*j;
				System.out.println(i+"*"+j+"="+result);
			}
		}
		//원하는 단 출력
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
			for(int i=1;i<=9;i++) {
				result = input*i;
				System.out.println(input+"*"+i+"="+result);
			}
	}

}
