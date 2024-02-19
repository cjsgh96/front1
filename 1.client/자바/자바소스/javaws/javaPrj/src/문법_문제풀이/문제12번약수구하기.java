package 문법_문제풀이;
import java.util.Scanner;

public class 문제12번약수구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int user;
		user=sc.nextInt();
		int i=1;
		while(i<=user) {
			
			if(user%i==0) {
			System.out.println(i);
			}
			i++;
			
			
		}
		
	}

}
