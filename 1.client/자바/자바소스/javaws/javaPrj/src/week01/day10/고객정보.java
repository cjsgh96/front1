package week01.day10;

public class 고객정보 {

	/*
	개인 식별 정보:
	성명
	생년월일
	주소
	전화번호
	이메일 주소
	주민등록번호 또는 여권번호 (법적인 요구에 따라 처리)
	*/
	
	private String 이름;
	private String 생년월일;
	private String 주소;
	private String 전화번호;
	private String 이메일주소;
	private String 주민번호;
	
	public 고객정보(String 이름, String 생년월일, String 주소, String 전화번호,String 이메일주소, String 주민번호) {
		this.이름=이름;
		this.생년월일=생년월일;
		this.주소=주소;
		this.전화번호=전화번호;
		this.이메일주소=이메일주소;
		this.주민번호=주민번호;
	}
	public void printInfo() {
		System.out.println(이름);
		System.out.println(생년월일);
		System.out.println(주소);
		System.out.println(전화번호);
		System.out.println(이메일주소);
		System.out.println(주민번호);
	}
}
