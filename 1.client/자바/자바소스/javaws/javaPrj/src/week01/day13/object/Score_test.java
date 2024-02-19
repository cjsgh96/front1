package week01.day13.object;

public class Score_test {

	public static void main(String[] args) {
		
		Score s = new Score("홍길동",100,99);
		
		System.out.println(s.toString());
		System.out.println(s);
		
		//getter 로 각 항목 정보 출력하기
		//매개변수 에서 필요한 요소만 사용할수 있다.
		
		System.out.println(s.getName()); 
		System.out.println(s.getKor());
		System.out.println(s.getEng());
		System.out.println(s.getAvg());
		//setter 로 각 항목 정보 변경하기
		//setter 로 필요한 요소만 변경할수 있다.
		
		s.setName("사용자");
		s.setKor(60);
		s.setEng(80);
		
		
		//toString을 생략하고 호출할수 있다.
		System.out.println(s);
		
		
		
		
		
		
	}



}
