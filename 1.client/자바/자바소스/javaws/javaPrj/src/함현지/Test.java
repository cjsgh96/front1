package 함현지;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//문제0
		String name = "함현지";
		String like = "고양이";
		char blood = 'A';
		int age = 24;
		System.out.printf("이름은 %s, 좋아하는 동물은 %s, 혈액형은 %c, 나이는 %d\n",name,like,blood,age);
		//문제1
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합 "+sum);
		//문제2
		System.out.print("1~10 거꾸로 출력하기 : ");
		for(int i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		
		Scanner sc = new Scanner(System.in);
		//문제3
		int a;
		int b;
		System.out.println("\n두개의 숫자를 입력");
		a = sc.nextInt();
		b=sc.nextInt();
		int result = a+b;
		System.out.println("두 숫자의 합 : "+result);
		
		//문제4
		System.out.println("아이디, 이름, 나이, 키 입력하세요");
		String id = sc.next();
		String uname = sc.next();
		int uage = sc.nextInt();
		float height = sc.nextFloat();
		System.out.printf("아이디 : %s, 이름 : %s, 나이 : %d, 키 : %f\n",id,uname,uage,height);

		//문제7
		int sum7=0;
		System.out.println("10개의 수를 입력하세요");
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+"번째 : ");
			int input = sc.nextInt();
			if(input%2==0) {
				sum7 += input;
			}
		}
		System.out.println("입력받은 수의 짝수의 합 : "+sum7);
		
		//문제8
		System.out.print("---별 하나 출력---\n");
		System.out.print("*");
		//문제9
		System.out.print("\n---별 하나를 이용해 별 3개 출력---\n");
		for(int i=0;i<3;i++) {
			System.out.print("*");
		}
		
		//문제10
		System.out.print("\n---별 하나를 이용해 별 3행 3열 출력---\n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		//문제12
		Scanner scan = new Scanner(System.in);
		System.out.print("약수를 구할 수 입력 -> ");
		int i=scan.nextInt();
		for(int j=1;j<=i;j++) {
			if(i%j==0)
				System.out.print(j+" ");
		}

	}

}
