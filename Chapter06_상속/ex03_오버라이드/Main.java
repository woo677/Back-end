package ex03_오버라이드;

public class Main {

	public static void main(String[] args) {
		
		MyCar car = new MyCar();
		car.start();
		car.turbo = true;
		int speed = car.run();
		System.out.println("차가 시속 "+speed+"km 으로 달린다");
		car.stop();

	}

}
