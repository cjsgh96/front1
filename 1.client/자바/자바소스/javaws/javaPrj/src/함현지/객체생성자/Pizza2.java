package 함현지.객체생성자;

public class Pizza2 {
	private String name;
	private String dough;
	private int price;
	
	public Pizza2(String name, String dough, int price) {
		this.name = name;
		this.dough = dough;
		this.price = price;
	}
	public void order() {
		System.out.println("~주문 받았습니다~");
		if(dough.equals("슈퍼시드")) {
			price += 2000;
			System.out.println("도우 "+dough+" 선택, 추가 금액 +2000");
		}else if(dough.equals("더블치즈엣지")) {
			price += 3000;
			System.out.println("도우 "+dough+" 선택, 추가 금액 +3000");
		}
		print();
	}
	public void print() {
		System.out.println("---주문 정보---");
		System.out.println("피자:"+name);
		System.out.println("도우:"+dough);
		System.out.println("가격:"+price);
		System.out.println("------------");
	}
}
