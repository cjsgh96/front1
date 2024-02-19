package week02.day05;



public class 제어문반복문1 {

	public static void main(String[] args) {
		
		//반복문, for(반복횟수가 정해져 있을때), while, do~while ( 특정 조건일 동안 )
		
		//별 하나를 이용해서 별을 3개 출력하시오 !!!
		
		/*System.out.println("*");
		System.out.println("*");
		System.out.println("*");*/
		
		// 별 한개를 이용해서 10번 출력
		
		
		for(int i=1;i<=10;i++) {
			System.out.println("*");
			System.out.println(i);
		}
		// 구구단,별찍기
		// 구구단3단 출력
		
		//반복 : 똑같은거, 규칙이 있는것 반복할수 있다.
		System.out.println("3*1="+3*1);
		System.out.println("3*2="+3*2);
		System.out.println("3*3="+3*3);
		System.out.println("3*4="+3*4);
		System.out.println("3*5="+3*5);
		System.out.println("3*6="+3*6);
		System.out.println("3*7="+3*7);
		System.out.println("3*8="+3*8);
		System.out.println("3*9="+3*9);
		System.out.println("==================");
		
		//for문 이용해서 명령어 작성
		//for(int i=1;i<=9;i++){//초기식;조건식;증감식}
		
		for(int i=1;i<=9;i++) {
			System.out.println("3x"+i+"="+3*i);
		}
		
		String a;
		a="정기원";
		for(int i=1;i<=5;i++) {
			System.out.println(a);
		}

		
	}

	


	
	

}
