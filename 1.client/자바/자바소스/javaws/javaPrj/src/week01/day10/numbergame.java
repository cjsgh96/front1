package week01.day10;

public class numbergame {
	int win;
	int drow;
	int lose;
	
	public void input(int win, int drow, int lose) {
		this.win=win;
		this.drow=drow;
		this.lose=lose;
	}
	
	public void printInfo() {
		System.out.println("승리:"+win+"무승부:"+drow+"패배:"+lose);
	}
	
	public static void main(String[] args) {
		
		numbergame c = new numbergame();
		
		numbergame[] late = new numbergame[2];
		
		late[0] = new numbergame(0,0,0);
		
		for(int i=0;i<late.length;i++) {
			int A = (int)Math.random()*3+1;
			int B = (int)Math.random()*3+1;	
			
			
			if(A>B) {
				
			}
		}
		
		
	}
}
