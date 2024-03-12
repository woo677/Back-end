package ex10_final;

public class Person {
	
	//final는 프로그램 시작하고 처음 넣은 값을 프로그램이 끝날때 까지 변경할수 없다 
	final String nation;
	//static final 은 생성자로 초기화 할수 없어서 아예 값을 줘야 한다
	//(상수) 불변의 값
	static final String ssn = "800705-123456789";
	final String name;
	int age;
	
	//final 은 프로그햄 시작시 초기화 후에 끝날때 까지 변할수 없다
	//그래서 반드시 생성자를 통해 초기화 해줘야 한다
	public Person(String nation,String name) {
		this.nation = nation;
		this.name = name;
	}
}
