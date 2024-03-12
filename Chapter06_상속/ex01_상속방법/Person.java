package ex01_상속방법;

// 상속을 받을 려면 extends(잌스텐즈) 로 상속 받고 싶은 class를 지정해 주면 된다
// 상속을 받으면 부모의 기능을 자식이 사용 할수 있다
// 자바에서는 다중 상속이 불가능하다 (이 분류 이면서 이 분류일수 없다)
public class Person extends Mamal {
	
	public void useTool() {
		System.out.println("도구를 사용 한다");
	}
	
	public void social() {
		System.out.println("사회 생활을 하다");
	}
	
	public void talk() {
		System.out.println("대화 하다");
	}
}
