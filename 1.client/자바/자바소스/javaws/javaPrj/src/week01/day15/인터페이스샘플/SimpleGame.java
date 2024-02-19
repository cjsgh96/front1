package week01.day15.인터페이스샘플;

public class SimpleGame {
	
	public Runnable r; // has a

	public void setR(Runnable r) {
		this.r = r;
	}

	public void myRun() {
		System.out.println(" 당신의 프로그램을 실행시켜 드립니다 ");
		r.run();
	}

	public static void main(String[] args) {
		SimpleGame game = new SimpleGame();
		 game.setR( new Runnable() {

			@Override
			public void run() {
			   System.out.println(" 익명클래스로 객체를 생성했어요.. 코드가 실행된다 ^^");
				
			}} ) ; //<= 인터페이스를 구현한 객체를 넘겨줘야 한다.
		           // <= 인터페이스를 구현한 클래스 만들기, 객체생성하기 , 객체를 인자로 넘기기
		game.myRun(); //
		
		
		
	    game.setR( new KSJ());
	    game.myRun();
	   
	}
}
