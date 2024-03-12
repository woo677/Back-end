package ex08_다형성O;

public class ArrMage {

	public static void main(String[] args) {

		//Ice, Light, Fire 주문을 연속으로 날릴수 있도록 배열과, for문을 활용해서 구현 해라
		// 다형성을 배열로도 쓸수 있다
		Spell[] arr = new Spell[3];
		arr[0] = new Ice();
		arr[1] = new Fire();
		arr[2] = new Liight();
		
		for (Spell spell : arr) {
			System.out.println(spell.casting());
		}
		

	}

}
