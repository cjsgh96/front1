package week02.day05;

public class 증감연산자사용 {

	public static void main(String[] args) {
		
		//1~10까지의 합
		
		int n=1;
		int sum=0;
		
		while(n<=10) {
			sum= sum+n;
			n= n+1;
		}
		System.out.println(sum);
		
		int i=1;
		int sum2=1;			//1 			 0
		while(i++<10) {	    //i 	i++		sum2
			sum2=sum2+i;	//2		1		2		
		}					//3		2		5
							//4		3		9
							//5		4		14
							//6		5		20
							//7		6		27
							//8		7		35
		System.out.println(sum2);
	}

}
