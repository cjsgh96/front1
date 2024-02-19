package week01.day13.arraylist;

public class Score {

	String name;
	int kor;
	int eng;
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}
	
	public void printInfo() {
		System.out.println(name+ kor +" "+ eng);
	}
	
	
	
}
