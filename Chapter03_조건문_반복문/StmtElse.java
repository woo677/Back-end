package ex01;

public class StmtElse {

	public static void main(String[] args) {
		
		System.out.println("가게에 간다");
		
		int tofuBox = 0;
//		if문 2개를 쓴다 코드가 복잡해 진다
		/*
		if(tofuBox>0) {
			System.out.println("두부를 사온다.");
		}
		if (tofuBox<1) {
			System.out.println("순두부를 사온다.");
		}
		*/
		
//		if문 1개로 끝냄 깔끔하다
		if (tofuBox>0) {
			System.out.println("두부를 사온다.");
		} else {
			System.out.println("순두부를 사온다.");
		}
		
		
		
		System.out.println("집으로 온다.");
		

	}

}
