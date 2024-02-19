package 배열_배열문제풀이;

public class 합_10구하기 {

	public static void main(String[] args) {
		
		//1	  2	 3	 4	 5	 6	 7	 8	 9	 10 
		int i=0; //
		int sum=0; // 1~10까지의 합
		
		i=i+1; //1
		sum = sum+i; //1
		
		i=i+1; //2
		sum= sum+i; //3
		
		i=i+1; //3
		sum= sum+i;//6
		
		i=i+1; //4
		sum= sum+i; // 10
		
		i=i+1; //5
		sum= sum+i; // 15
		
		i=i+1; //6
		sum= sum+i; // 21
		
		i=i+1; //7
		sum= sum+i; // 28
		
		i=i+1; //8
		sum= sum+i; // 36
		
		i=i+1; //9
		sum= sum+i; // 45
		
		i=i+1; //10
		sum= sum+i; // 55
		
		System.out.println(sum);
		System.out.println("==============================");
		int sum2=0;
		for(int j=1;j<=10;j++){
			sum2= sum2+j;
		}
		System.out.println(sum2);
		System.out.println("==============================");
		
		int n=1;
		int sum3=1;
		
		while(n<10) {
			n=n+1;
			sum3=sum3+n;
		}
		System.out.println(sum3);
	}
		
	

}
