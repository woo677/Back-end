package ex08_다형성O;

public class Fire extends Spell {

	@Override
	public String casting() {
		return "호염"+super.casting();
	}
	
}
