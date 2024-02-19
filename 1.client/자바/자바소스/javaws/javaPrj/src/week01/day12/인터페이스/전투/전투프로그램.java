package week01.day12.인터페이스.전투;


//자식형 참조변수  = (자식형)부모객체   (다운캐스팅)  : 명시적형변환
//부모형 참조변수  = 자식객체         ( 업캐스팅)    :자동, 생략가능
public class 전투프로그램 {

	public static void main(String[] args) {
		
		Object[] olist = new Object[6];
		전투가능한[] flist = new 전투가능한[4];
		
		olist[0] = new Cat();
		olist[1] = new Cook();
		olist[2] = new Doctor();
		olist[3] = new Dog();
		olist[4] = new Policeman();
		olist[5] = new Student();
		
		
		
		//instanceof 
		
		int index=0;
		for(int i=0;i<olist.length;i++) {
			if(olist[i] instanceof 전투가능한) { //instanceof
				flist[index] = ((전투가능한)olist[i]);
				index++;
			}
		}
		
		//
		System.out.println("싸움을 시작한다.");
		for(int i=0 ; i<flist.length ; i++) {
			flist[i].전투한다();
		}
		
		
		

	}

}
