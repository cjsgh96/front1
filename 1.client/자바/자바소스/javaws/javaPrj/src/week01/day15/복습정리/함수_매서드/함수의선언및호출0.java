package week01.day15.복습정리.함수_매서드;


//함수란?
// 코드의 묶음을 말한다.  특정기능을 수행하기 위한 코드의 묶음, 명령의 집합이다
// 반환type 함수명( 매개변수type  변수)
// void 함수명()   =>입력x, 반환 x
public class 함수의선언및호출0 {

	
	public int 두배만들기(int  amount) {    // 함수 선언부  (머리)
		return amount*2;                // 중괄호 블럭 => 함수 구현부 (바디, 몸통)
	}                                   // 함수를 사용하거나 함수를 만들 때, 기능이 무엇인지, 입력, 반환 이 무엇인지   
	                                    // 함수가 입력을 가진다는 것은 !!!  외부로 부터 매개변수로 받아들이는 값이 있느냐는 것임 !!!!! 조심 주의 
	
	
	public static void main(String[] args) {
		 
		//함수 호출은 어떻게 하느냐?  static 키워드가 있는지 없는지에 따라 사용법이 다르다 		
		
		// 객체 생성후 사용		
		함수의선언및호출0   o  = new 함수의선언및호출0();
		int result  =o.두배만들기(5000);
		System.out.println( result);

	}

}
