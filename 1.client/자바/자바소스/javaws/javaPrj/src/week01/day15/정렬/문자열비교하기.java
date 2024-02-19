package week01.day15.정렬;

public class 문자열비교하기 {

	public static void main(String[] args) {
	 
		
		String str1="apple";
		String str2="banana";
		
		//str1과 str2 비교후  양수(내가크면,사전상 뒤에 있다 :기준) , 음수 , 0(같으면)
		int result  =str1.compareTo(str2);
		
		System.out.println(result );

	}

}
