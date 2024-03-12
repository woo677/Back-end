package ex08_다형성O;

public class Liight extends Spell{

	@Override
	public String casting() {
		return "번개"+super.casting();
	}
	
}
