package ex06_다형성_명시적형변환;

public class Cat extends Mammal{

	@Override
	public void birth() {
		 	System.out.println("새끼를 6마리 낳는다");
		//super(부모를 의미한다).birth();
	}
	
	public void mew() {
		System.out.println("야옹 하고 운다");
	}
	
	

}
