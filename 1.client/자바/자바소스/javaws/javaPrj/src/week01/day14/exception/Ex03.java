package week01.day14.exception;

public class Ex03 {

	public static void main(String[] args) {
		
		// ClassCastException
		
		Object o = new A(); //상속관계 에서의 upcasting
							//부모형으로 사용 축소
		try {
		((A)o).놀기();
		
		((B)o).공부하기(); // 잘못된 다운캐스팅
						// Object 다운캐스팅 할 때 실체 대상을 확인하고 다운캐스팅
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("형변환 문제");
		}
		System.out.println("프로그램 정상 종료");
	}

}
