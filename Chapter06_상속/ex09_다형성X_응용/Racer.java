package ex09_다형성X_응용;

public class Racer {
	
//	다형성과 오버라이드를 사용 하지 않아도 값을 하나로 모아 보낼수 있다
	
	//다형성을 매개변수로도 활용이 가능하다
	//벤츠 클래스를 매개변수로 쓴다음 드라이버컨드롤러에서 벤츠의 값을 받으면 실행 
	//이 메서드는 벤츠만 운행 가능 하다
	public void drive(Benz benz) {
		System.out.println(benz.run());
	}
	
	//BMW
	public void drive(BMW bmw) {
		System.out.println(bmw.run());
	}
	
	//Audi
	public void drive(Audi audi) {
		System.out.println(audi.run());
	}
	
	/* 매개변수의 객체가 달라지면 거기에 맞게 메서드를 계속 만들어 줘야 한다
	 * 다행이 오버로드가 지원되므로 메서드 이름을 추가로 만들거나 사용자가 이름을 하나하나 기억해야 하는 일은 없다
	 * 다만, 차량 객체가 추가될수록 거기에 대응하는 메서드는 계속 추가해 줘야 한다
	*/
}
