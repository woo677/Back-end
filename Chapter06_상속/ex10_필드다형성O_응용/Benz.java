package ex10_필드다형성O_응용;

public class Benz extends Car{

	@Override
	public String run() {
		return "Benz"+super.run();
	}

	
}
