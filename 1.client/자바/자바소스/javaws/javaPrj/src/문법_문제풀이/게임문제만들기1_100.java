package 문법_문제풀이;

public class 게임문제만들기1_100 {

	public static void main(String[] args) {
		
		// 컴퓨터가 지정할 랜덤변수
		int computer = (int) (Math.random()*100)+1;
		
		// 랜덤변수를 맞출 A,B,C 랜덤변수

		int i=1;
		
		String winner;
		while(true) {
			
			System.out.println(i+"번 반복했습니다");
			i=i+1;
			int A=(int) (Math.random()*100)+1;
			int B=(int) (Math.random()*100)+1;
			int C=(int) (Math.random()*100)+1;
			
			if(A==computer && B!=computer && C!=computer) { // A의 수가 컴퓨터수와 같다면.
				winner= "A";
			}else if(B==computer && A!=computer && C!=computer) { //B의 수가 컴퓨터 수와 같다면.
				winner= "B";
			}else if(C==computer && A!=computer && B!=computer) { //C의 수가 컴퓨터 수와 같다면
				winner= "C";	
			}else{
				continue;
			}
			
			System.out.println("맞춘사람은: "+winner+"정답은: "+computer);
			break;
		}
		
		
		

	}

}
