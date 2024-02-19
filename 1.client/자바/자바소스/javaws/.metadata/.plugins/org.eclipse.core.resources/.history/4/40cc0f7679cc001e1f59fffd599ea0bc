package project_5_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductShow {
	static Scanner sc = new Scanner(System.in);
	
	public static void productList(ArrayList<Product> list) {
		String formattedNum = String.format("%-8s","상품번호"); // 이름을 왼쪽 정렬하여 30자리로 맞춤
		String formattedName = String.format("%-20s","상품명"); // 가격을 왼쪽 정렬하여 10자리로 맞춤
		String formattedPrice = String.format("%-10s","가격"); // 재고를 왼쪽 정렬하여 10자리로 맞춤
		String formattedStock = String.format("%-10s","재고"); // 재고를 왼쪽 정렬하여 10자리로 맞춤
		System.out.println("==========================☆★상품 목록★☆==========================");
		System.out.println(formattedNum+"\t"+formattedName+"\t"+formattedPrice+"\t"+formattedStock);
		System.out.println("---------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+"\t   "+list.get(i));
		}
		System.out.println("---------------------------------------------------------------");
	}
	
	public void showList(ArrayList<Product> list) {
		int num;
		productList(list);
		System.out.print("자세히 보고싶은 상품의 번호를 입력하세요 > ");
		num = sc.nextInt();
		System.out.println("\n================☆★상세 보기★☆=================");
		String formattedName2 = String.format("%-20s",list.get(num-1).getName()); // 가격을 왼쪽 정렬하여 10자리로 맞춤
		String formattedPrice2 = String.format("%-10s",list.get(num-1).getPrice()+"원"); // 재고를 왼쪽 정렬하여 10자리로 맞춤
		String formattedStock2 = String.format("%-10s",list.get(num-1).getStock()+"개"); // 재고를 왼쪽 정렬하여 10자리로 맞춤
		System.out.println(String.format("%-20s","상품명")+"\t"+String.format("%-10s","가격")+"\t"+String.format("%-10s","재고"));
		System.out.println("--------------------------------------------");
		System.out.println(formattedName2+"\t"+formattedPrice2+"\t"+formattedStock2);
		System.out.println("============================================");
		System.out.print("상품설명 >> ");
		System.out.print(list.get(num-1).getDesc());
		System.out.println("\n--------------------------------------------");
		System.out.print("상품후기");
		System.out.println("\n--------------------------------------------");
		System.out.println();
	}
}
