package ex04_다형성;

public class Main {

	public static void main(String[] args) {

		// 다형성을 사용하기 전(첫짼 ~ 다섯째)
		// 사용할 객체가 여러개 라면 여러개의 객체를 담을 변수를 선언해 줘야 한다
		
		Chlid ch = new Chlid();
		ch.useRoom();
		
		chlidOne ch1 = new chlidOne();
		ch1.useRoom();
		
		chlidTwo ch2 = new chlidTwo();
		ch2.useRoom();
		
		chlidThree ch3 = new chlidThree();
		ch3.useRoom();
		
		chlidFour ch4 = new chlidFour();
		ch4.useRoom();
		
		System.out.println();

		//다형성을 사용 한 후
		//하나의 변수(부모타입)에 여러 객체(자식타입)를 수용할 수 있다
		ParntHouse house;
		house = new Chlid();
		house.useRoom();
		
		house = new chlidOne();
		house.useRoom();
		
		house = new chlidTwo();
		house.useRoom();
		
		house = new chlidThree();
		house.useRoom();
		
		house = new chlidFour();
		house.useRoom();

	}

}
