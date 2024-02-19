package week01.day14.음료마시기;

public class 음료마시기프로그램 {

	public static void main(String[] args) {
		
		AcornStudent[] list = new AcornStudent[6];
		
		list[0] = new 정기원();
		list[1] = new 함현지();
		list[2] = new 강지훈();
		list[3] = new 김예원();
		list[4] = new YWJ();
		list[5] = new 김기엽음료마시기();
		
		for(int i=0;i<list.length;i++) {
			list[i].음료마시기();
		}
		

	}

}
