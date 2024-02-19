package week01.day9;

public class 전역변수 {
	
	//전역변수 : 모든매서드에서 접근이 가능한 변수
	static int su=0;
	public static void main(String[] args) {
		//수 증가
		수증가하기();
		
		System.out.println(su);	//1
		
		수증가하기();
		
		System.out.println(su); //2
	}
	public static void 수증가하기() {
		su++;
	}
}
