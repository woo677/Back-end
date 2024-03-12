package ex08_다형성O;

public class Ice extends Spell{

	@Override
	public String casting() {
		return "얼음"+super.casting();
	}
	
}
