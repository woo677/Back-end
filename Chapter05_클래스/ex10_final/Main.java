package ex10_final;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("KOREA", "홍길동");
		p.age = 30;
		//final 키워드가 붙은 필트는 초기값을 읽을 수만 있다
		//한번 넣은 값은 프로그램이 꺼질때 까지 변경이 불가능 하다
		//p.nation="AMERICA";
		//P.name = "kin";
		System.out.println(p.nation);
		System.out.println(p.name);
		System.out.println(Person.ssn);
		System.out.println(p.age);

	}

}
