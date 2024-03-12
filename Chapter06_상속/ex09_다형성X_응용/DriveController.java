package ex09_다형성X_응용;

public class DriveController {

	public static void main(String[] args) {

		//차량 준비
		BMW bmw = new BMW();
		//System.out.println(bmw.run()); // 이렇게도 가능 하지만 코드가 길다
		Benz benz = new Benz();
		Audi audi = new Audi();
		
		//레이서에게 운정을 요청한다
		Racer racer = new Racer();
		racer.drive(audi);
		racer.drive(benz);
		racer.drive(bmw);

	}

}
