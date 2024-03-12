package ex07_메서드_맴버호출;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(); //객체화
		
		//시동 걸기 전에 기어 확인
		int gear = car.gear;
		System.out.println("현제 기어 "+gear);
		
		//시동 걸기
		car.start();
		//기어 변경
		car.Change(3);
		
				

	}

}
