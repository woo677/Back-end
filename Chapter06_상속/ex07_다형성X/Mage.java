package ex07_다형성X;

public class Mage {

	public static void main(String[] args) {

	 // 다형성을 않 쓰면 하나하나 다 객체화를 한다음 출력을 해야한다
		Light light = new Light();
		System.out.println(light.cast());
		
		Fier fier =  new Fier();
		System.out.println(fier.cast());
		
		Ice ice = new Ice();
		System.out.println(ice.cast());

	}

}
