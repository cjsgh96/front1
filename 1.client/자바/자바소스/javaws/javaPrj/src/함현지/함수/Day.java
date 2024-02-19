package week02.day8;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		System.out.print("날씨를 확인하고 싶은 요일을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		String today = "";
		if(day.equals("일") || day.equals("일요일")) {
			today = day(0);
		}else if(day.equals("월") || day.equals("월요일")) {
			today = day(1);
		}else if(day.equals("화") || day.equals("화요일")) {
			today = day(2);
		}else if(day.equals("수") || day.equals("수요일")) {
			today = day(3);
		}else if(day.equals("목") || day.equals("목요일")) {
			today = day(4);
		}else if(day.equals("금") || day.equals("금요일")) {
			today = day(5);
		}else if(day.equals("토") || day.equals("토요일")) {
			today = day(6);
		}
		System.out.println(today);

	}
	public static String day(int day) {
		String[] today = {"맑음","맑음","흐림","맑음","흐림","흐림","비"};
		return today[day];
	}
	

}
