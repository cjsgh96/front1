package week01.day13.성적관리;

public class Score {
	
	//틀 (붕어빵틀)
	private String name;
	private int kor;
	private int eng;
	
	private double avg;
	private char grade;
	
	
	//값의 초기화 =>
	public Score(String name, int kor, int eng) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}
	
	
	private void calcAvg() {
		int sum= kor+eng;
		avg = sum/2.0;
	}
	
	public void calcGrade() {
		calcAvg();
		//평균구한다
		//A,B,C,F	
		if( avg>=90) {
			grade = 'A';
		}else if (avg>=80) {
			grade='B';
		}else if(avg>=70){
			grade='C';
		}else {
			grade='F';
		}
	}
	
	//멤버변수의 값을 가져오거나, 변경할 수 있는 매서드를 제공할 수 있다.
	//쎄터 setter, getter 역할을 하는 매서드를 만들어서 사용할 수 있다.
	//=> 규칙을 가지고 만든다
	public void setName(String name) { //setter 의 규칙 변수의 가장 앞글자를 대문자로
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Score() {
	
	}



	public void printInfo() {
		
		System.out.println(name+" "+kor+" "+eng+" "+avg+" "+grade);
	}
	
	
	
	
}
