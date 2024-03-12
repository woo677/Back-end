package ex10_필드다형성O_응용;

public class Audi extends Car{

	@Override
	public String run() {
		return "Audi"+super.run();
	}
	
	
}
