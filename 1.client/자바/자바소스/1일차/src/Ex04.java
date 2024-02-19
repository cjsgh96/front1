import java.util.Scanner;

public class Ex03{

    public static void main( String[] args ) {

        int userInput;
        int randomSu ;
	int count=3;
	int tryCnt=1;
	
       randomSu = (int) ( Math.random() *100 ) + 1;

       Scanner sc = new Scanner( System.in) ;
       while(true) {
           userInput =sc.nextInt();
	 
           if( userInput == randomSu) break;  
           else if( userInput  > randomSu ){
               	System.out.println(count+"count");
		System.out.println("down");
           }else  if( userInput < randomSu ){
                System.out.println("up");
		System.out.println(count+"count.");
          }               
	count--;
	tryCnt++;
	if(count<=0){
		
		System.out.println("Count out");
	}
       }
	if(tryCnt>=1){
       
		System.out.println(" success Snack eat!!");
	}else{
		System.out.println(" success ");
	}
	System.out.println(tryCnt+"Counting");	     
    }

}