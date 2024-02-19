package week02.day8;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		int[] arr = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.print("8개의 숫자를 입력하세요 : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int result = maxNum(arr);
		System.out.print("입력한 숫자 중 가장 큰 수 : "+result);

	}
	public static int maxNum(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max <= arr[i])
				max = arr[i];
		}
		return max;
	}

}
