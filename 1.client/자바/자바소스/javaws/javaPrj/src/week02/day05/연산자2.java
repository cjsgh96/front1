package week02.day05;

public class 연산자2 {

	public static void main(String[] args) {
		//증감연산자
		
		//a++,++a,b--,--b
		//++연산자 : 공통점 : 변수의 값을 1증가
		
		//--연산자 : 공통점 : 변수의 값을 1감소
		
		int a=10;
		int result = a++; // 연산의 결과가 증가되기 전의 값을 반환
		int result2 = ++a; // 연산의 결과가 증가된 후의 값을 반환
		
		int sum =2+3; // 2+3=> 5라는 연산의 결과가 발생함;
		
		//++ 증감연산자 이해하기
		int su1=10;
		int su2=10; 
		
		int resultsu1;
		int resultsu2;
		
		resultsu1= su1++; //1증가 , 연산의 결과가 증가되기 전의 값을 변환
		resultsu2= ++su2; //1증가 , 연산의 결과가 증가된 후 값을 반환
		
		
		
		System.out.println(su1);
		System.out.println(su2);
		
		System.out.println(resultsu1);
		System.out.println(resultsu2);
		
		//b-- , --b : 공통점 : 1감소 , 다른점 : 연산의 결과가 다름
		//b-- , : 감소하기 전의 값을 반환 , --b : 감소한 후의 값을 반환
		
		int su3=10;
		int su4=10;
		
		int resultsu3;
		int resultsu4;
		
		resultsu3= su3--;
		resultsu4= --su4; // su3의 값을 1감소 : 연산의 결과는 감소하기 전의 값을 반환
		
		System.out.println(resultsu3);
		System.out.println(resultsu4);
		
		//문제풀어 보기
		
		int p1=13;
		int p2=11;
		
		int resultp= p1++ + ++p2;
		int resultp2 = p2 + --p1;
		
		System.out.println(resultp);
		System.out.println(resultp2);
		
	}

}
