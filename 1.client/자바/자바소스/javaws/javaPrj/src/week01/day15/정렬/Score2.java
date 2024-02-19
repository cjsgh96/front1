package week01.day15.정렬;

public class Score2 implements Comparable {
   	String name;
    int kor;
   	int eng;
	
	public Score2(String name, int kor, int eng) {
		//super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}

	@Override
	public int compareTo(Object o) {	 
		Score2 another  =  (Score2)o;
		
	    // (기준이 크면 양수 ), 음수 	
		return  this.kor - another.kor;
	}	 
	
	
	
	//
	
	
	
	

}
