package week01.day13.string;

public class Ex04 {

	public static void main(String[] args) {
		
		String text ="Love is a variety of different feelings, states, and" +
				"attitudes that ranges from interpersonal affection to pleasure";
		
		int count =text.length(); // 문자열의 길이가 몇자인지 int 로 반환해주는 매서드
		
		System.out.println(count);
		
		String result = text.toLowerCase(); //문자열을 소문자로 변환해주는 매서드
		
		System.out.println(result);
		
		String result2 = text.toUpperCase(); // 문자열을 대문자로 변환해주는 매서드
		
		System.out.println(result2);
		
		int cnt=0;
		
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)=='a') {
				cnt++;
			}
		}
		System.out.println("a의 갯수=>"+cnt);
		
		String str="AWESOME-amazing";
		
		String[] result3 = str.split("-");
		
		for(int i=0;i<result3.length;i++) {
			System.out.println(result3[i]);
		}
		
		String datel = "2024-02-07";
		
		String[] result4 = datel.split("-");
		
		/*
		for(int i=0;i<result4.length;i++) {
			if(Integer.parseInt(result4[i]) <10 && result4[i].contains("0")) {
				result4[i] = result4[i].replace("0", "");
			}	
		}
		*/
		System.out.println(result4[0]+"."+result4[1]+"."+result4[2]);
		
		if(Integer.parseInt(result4[1]) <10 && result4[1].contains("0")) {
			result4[1] = result4[1].replace("0", "");
		}
		
		System.out.println(result4[0]+"."+result4[1]+"."+result4[2]);
		
		//문자열 추출하기 
		String re = datel.substring(5); 
		String re2= datel.substring(5, 7);
		
		System.out.println(re);
		System.out.println(re2);
	}

}
