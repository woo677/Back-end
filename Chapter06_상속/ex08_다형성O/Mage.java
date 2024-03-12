package ex08_다형성O;

public class Mage {

	public static void main(String[] args) {

		Spell spl;
		
		//다형성을 하면 일일히 객체화를 않해도 된다
		spl = new Fire();
		System.out.println(spl.casting());
		
		spl = new Ice();
		System.out.println(spl.casting());
		
		spl = new Liight();
		System.out.println(spl.casting());

	}

}
