package week01.day12.인터페이스;

//인터페이스를 구현한 클래스를 만들어 사용
//인터페이스 상속
//키워드 	implements

//각자 해야할 일 . 클래스 작성 ( 이름상관 X )
//인터페이스 상속이라고 부른다. 키워드는 달라진다. implements 로 바뀐다.
public class WjyImp implements Myrunnable {

	@Override
	public void run() {
		System.out.println("자바는 매력적이다.");
		
	}
	
}
