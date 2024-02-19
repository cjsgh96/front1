package 문법_문제풀이;
import java.util.Scanner;

public class 문제11번원하는단 {

	public static void main(String[] args) {
		
		//원하는단 출력
		Scanner sc = new Scanner (System.in);
		int user;
		user=sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(user+"x"+i+"="+user*i);
		}

	}

}
