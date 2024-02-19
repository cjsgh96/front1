package week01.day10;

public class PersonTest2 {

	public static void main(String[] args) {
		 
		Person2 p  = new Person2();
		
		
		/*
		p.age=40;
		p.child=3;
		p.name="james";
		p.isMarried=true;
		
		
		System.out.println(  p.age);
		System.out.println(  p.child);
		System.out.println(  p.name);
		System.out.println(  p.isMarried);
		*/
		
		p.member(40, "james", true, 3);
		p.printInfo();

	}

}
