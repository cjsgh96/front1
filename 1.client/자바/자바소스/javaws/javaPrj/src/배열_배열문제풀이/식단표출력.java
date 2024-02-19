package 배열_배열문제풀이;

import java.util.Scanner;

public class 식단표출력 {

	public static void main(String[] args) {
		String[] 조식= new String[5];
		String[] 중식= new String[5];
		String[] 석식= new String[5];
		Scanner sc = new Scanner (System.in);
		
		조식[0] = "쇠고기무국,멸치볶음,맛김";
		조식[1] = "순두부해물찌개,감자채볶음,오징어젓무침";
		조식[2] = "쇠고기미역국,애호박나물,콩나물무침";
		조식[3] = "콩나물국,생선묵볶음,계란찜";
		조식[4] = "순두부찌개,감자조림,오징어채무침";
		
		중식[0] ="돼지고기김치찌개,버섯호박볶음,계란찜";
		중식[1] ="고기덮밥,두부김치국,고등어순살조림";
		중식[2] ="배추된장국,돼지고기고추장볶음,모듬야채";
		중식[3] ="감자탕,풋고추된장무침";
		중식[4] ="홍합미역국,쇠고기버섯볶음,도라지오이무침";
		
		석식[0] ="감자된장국,닭갈비,양배추쌈";
		석식[1] ="쇠고기육개장,멸치볶음,고추장무침";
		석식[2] ="북어채국,야채샐러드";
		석식[3] ="오징어찌개,깐풍기,무생채";
		석식[4] ="양파찌개,탕수육,브로콜리";
		
		
		int j=1;
		for(int i=0;i<5;i++) {
			System.out.println("6월"+j+"일 식단");
			System.out.println("조식:"+조식[i]+"\n"+"중식:"+중식[i]+"\n"+"석식:"+석식[i]);
			j++;
		}
		System.out.println("================================");
		
		System.out.println("원하는 날짜를 입력하세요 1~5");
		int user=sc.nextInt();
			if(user<=5) {
				System.out.println("6월"+(user)+"일 식단");
				System.out.println("조식:"+조식[(user-1)]+"\n"+"중식:"+중식[user-1]+"\n"+"석식:"+석식[user-1]);
			}else{
				System.out.println("잘못 입력했습니다. 다시 입력하세요");
				
				
			}
		
		
		
		
					
	}
	 
	 
}
