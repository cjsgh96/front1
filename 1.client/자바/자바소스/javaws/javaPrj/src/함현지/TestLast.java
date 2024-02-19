package 함현지;

public class TestLast {

	public static void main(String[] args) {
		int computer = (int) (Math.random()*100)+1;
		while(true) {
			System.out.println("정답 맞추는 중...");
			int a = (int) (Math.random()*100)+1;
			int b = (int) (Math.random()*100)+1;
			int c = (int) (Math.random()*100)+1;
			String winner;
			if(a==computer && b!=computer && c!=computer) {
				winner = "A";
			}else if(a!=computer && b==computer && c!=computer) {
				winner = "B";
			}else if(a!=computer && b!=computer && c==computer) {
				winner = "c";
			}else {
				continue;
			}
			System.out.println("정답자가 나왔습니다!");
			System.out.println("정답자는 "+winner+"이고 정답은 "+computer);
			break;
			
		}

	}

}
