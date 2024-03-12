package ex10_필드다형성O_응용;

public class BMW extends Car{

	@Override
	public String run() {
		return "BMW"+super.run();
	}
	
	
	
}
