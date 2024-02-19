package week02.day8;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("약수를 구할 수 입력 : ");
		int input = sc.nextInt();
		int[] array = su(input);
		for(int i=0;i<array.length;i++) {
			if(array[i] != 0)
				System.out.print(array[i] + " ");
		}
	}
	public static int[] su(int su) {
		int[] array = new int[su];
		for(int i=1;i<=su;i++) {
			if(su%i == 0) {
				array[i-1] = i;
			}
		}
		return array;
	}

}
