package week01.day7문제풀이;

public class 문자열배열만들기 {

	public static void main(String[] args) {
		
		String[] goods = new String[5];
		String[][] buy = new String[4][5];
		//사고싶은 물건 5개 !!! 배열에 저장하고 출력하기
		//1차원배열
		
		goods[0] = "가방";
		goods[1] = "지갑";
		goods[2] = "구두";
		goods[3] = "시계";
		goods[4] = "모자";
		
		for(int i=0;i<5;i++) {
			System.out.println(goods[i]);
		}
		System.out.println("================================");
		//2차원 배열
		buy[0][0] = "가방";
		buy[0][1] = "지갑";
		buy[0][2] = "구두";
		buy[0][3] = "시계";
		buy[0][4] = "모자";
		
		buy[1][0] = "신발";
		buy[1][1] = "두부";
		buy[1][2] = "김치";
		buy[1][3] = "소주";
		buy[1][4] = "맥주";
		
		buy[2][0] = "양주";
		buy[2][1] = "위스키";
		buy[2][2] = "벽돌";
		buy[2][3] = "갤럭시";
		buy[2][4] = "아이폰";
		
		buy[3][0] = "에어팟";
		buy[3][1] = "맥북";
		buy[3][2] = "노트북";
		buy[3][3] = "당근";
		buy[3][4] = "오전";
		//2차원 배열 모두 출력하기
		for(int i=0;i<4;i++) {
			System.out.println(+(i+1)+"주차 할인품목");
			for(int j=0;j<5;j++) {
				System.out.print(buy[i][j]+"   ");
			}
			System.out.println();
		}

	}

}
