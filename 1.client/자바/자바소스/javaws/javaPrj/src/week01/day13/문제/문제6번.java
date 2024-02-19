package week01.day13.문제;

public class 문제6번 {
	
	
	
	public static int random() {
		int su;
		su =(int)(Math.random()*100+1);
		
		return su;
		
	}
	
	public static void main (String[] args) {
		
		System.out.println(random());
		
	}
}
