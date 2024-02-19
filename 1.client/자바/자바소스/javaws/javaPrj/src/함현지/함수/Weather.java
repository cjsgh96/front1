package 함현지.함수;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇주차 날씨정보를 확인하고 싶은가요?(3주차까지 제공) : ");
		//int week = sc.nextInt();
		//String name = sc.next();
//		String[] array = weather(week);
//		for(int i=0;i<array.length;i++) {
//			System.out.print(array[i]+" ");
//		}
		division();

	}
	public static String[]weather(int week) {
		String[][] weather = {
				{"맑음","맑음","흐림","눈","눈","맑음","맑음"},
				{"흐림","흐림","흐림","비","비","비","맑음"},
				{"흐림","맑음","비","눈","흐림","맑음","맑음"}
		};

		return weather[week-1];
	}
	public static void division() {
		String[] division = {"͙ ͙۪۪̥ ͙ ♡𐡘 𐡘 𐡘 𐡘♡ ͙ ͙۪۪̥ ͙", "˚ ༘♡ ⋆｡˚ ꕥ","˚₊· ͟͟͞͞➳❥","◛⑅·˚ ༘ ♡","꘎♡━━━━━♡꘎","｡ﾟ•┈୨♡୧┈• ｡ﾟ","✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧", 
				"*✧･ﾟ: *✧･ﾟ:","｡･:*˚:✧｡⁭","*.·:·.✧ ✦ ✧.·:·.*","₊˚ʚ ᗢ₊˚✧ ﾟ.","｡ﾟ☆: *.☽ .* :☆ﾟ",
				"°•. ✿ .•°", "●∘◦❀◦∘●","↶*ೃ✧˚. ❃ ↷ ˊ-⁭","˚ ༘ꕥ ⋆｡˚ ❀","°˖✧✿✧˖°","»•» 🌸 «•«"};
		int index = (int)(Math.random()*(division.length-1));
		for(int i=0;i<5;i++) {
			System.out.print(division[index]);
		}
	}

}
