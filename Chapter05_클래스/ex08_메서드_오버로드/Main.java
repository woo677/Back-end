package ex08_메서드_오버로드;

public class Main {

	public static void main(String[] args) {

		OverCalc calc = new OverCalc();
		String re = calc.plus("A", "B");
		System.out.println(re);

		//오버로드는 하나의 이름으로 여러 매개변수를 줄 수 있다
		// 그리고 사용자 입장에서는 매개변수를 넣으면 넣으면 알아서 해당 메서드로 자동 연결 된다
		//만약 오버로드가 없었다면 해당 매개변수를 사용하는 메서드를 찿아야한다
	}

}
