package ex06_생성자_오버로드;

public class Puppy {
	
	public String name;
	public String goal;
	
	//name 과 goal은 생성자가 사용되고나면 사라져 버린다
	//이유 : 변수 영역 때문에....
	public Puppy(String name,String goal) { //생성자
		// 그래서 받아온 값을 밖으로 꺼내 줘야 한다
		this.name = name;// 여기(클래스)있는 name 에 가져온 name을 대입 한다
		this.goal = goal;
	}
	
	//오버로드 : 과적,원해는 하나의 이름으로만 존재해야 하는데 같은 이름으로 여러개 존재해야 하는데 같은 이름으로 여러개 존재하므로 과적했다고 표현한다
	//단 매개변수의 갯수나 데이터 타입이 달라야 한단
	//왜? 다양한 객체화를 지원하기 위해(누군가는 초기화를 하고싶지 않을수도,이름만 넣고 싶을수도 있으니까)
	
	public Puppy() {//기본 생성자 : 매개변수가 없으므로 가능
		
	}
	public Puppy(String name) { //매개변수가 하나만 있으므로 가능
		this.name = name;
	}
	/*
	public Puppy(String name) {
		//같은 타입의 매개변수가 1개 있으므오 불가능(위와 타입과 생성자 이름이 100%일치)
	}*/
}
