package ex04_API만드는법과_쓰는법;

public class Main_API사용법 {

	public static void main(String[] args) {

		//API : 앱 개발 시 어려운 문제를 쉽게 해결해 주는 무언가(방법)
		//Myapi 의 plus 메서드는 더하기라는 문제를 해결해 준다
		Myapi_API만드는법 api = new Myapi_API만드는법();
		
		//클래스를 복사(객체화) 하고 나면 ctrl + space 를 통해 이용 할 수 있는 메서드를 훑어보자
		
		//작동 원리 : api.plus()에 값을 넣으면 값을 객화한class로 넘겨준다음 그 안에서 값을 계산하고 리턴으로 api.plus()로 값을 넘겨줘거 변수에 저장이 된다  
		int re = api.plus(100,200); //객체화를 해서 넣은 변수에 .하면 class안에 있는 메서드들이 보인다
		System.out.println(re);
		
		//라이브러리 : 도서관 - 누군가가 만들어놓은 수많은 방법론(메서드) 들을 도서관 처럼 모아놓았다 해서 라이브러리다
		

	}

}
