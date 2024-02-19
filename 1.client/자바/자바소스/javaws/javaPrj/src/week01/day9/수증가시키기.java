package week01.day9;

public class 수증가시키기 {

	public static void main(String[] args) {
		
		int su=0;
		su = su+1;
		System.out.println(su);
		
		su =su+1;
		System.out.println(su);
		//
		수증가하기(su);
		System.out.println(su);
		//
		su = 수증가하기2(su);
		System.out.println(su);
	}
	public static void 수증가하기(int num) {
		//System.out.println(num);
		num++; //num= num+1;
	}
	public static int 수증가하기2(int num) {
		//System.out.println(num);
		num++; //num= num+1;
		return num;
	}
}
