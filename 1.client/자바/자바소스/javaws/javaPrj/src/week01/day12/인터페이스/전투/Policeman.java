package week01.day12.인터페이스.전투;

public class Policeman implements 전투가능한{
	public void 도둑을잡는다() {
		System.out.println("도둑을 잡는다");
	}

	@Override
	public void 전투한다() {
		System.out.println("총을 들고 싸운다");
		
	}
}
