package week01.day13.object;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private double avg;

	
	// 생성자
	public Score() {
		
	}
	public Score(String name, int kor, int eng) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calcAvg();
		
	}

	public void calcAvg() {
		int sum= kor+eng;
		avg = sum/2.0;
	}
	
	//
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	//
	
	
	  @Override 
	  public String toString() { 
		  return "Score [name=" + name + ", kor="+ kor + ", eng=" + eng + ", avg=" + avg + "]"; 
	  }
	 
	
	
}


