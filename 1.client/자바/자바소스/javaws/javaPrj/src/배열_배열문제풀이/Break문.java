package 배열_배열문제풀이;

public class Break문 {

	public static void main(String[] args) {
			
		
		int i=0; //반복제어 및 1~10 수를 만드는 변수
		int sum=0;

		while(true) { //탈출 조건을 통해서 break 빠져나옴
			i=i+1;
			sum= sum+i;
			if(i>=10) break;
		}
	}

}
