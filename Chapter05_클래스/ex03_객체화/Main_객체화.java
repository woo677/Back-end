package ex03_객체화;

public class Main_객체화 {

	public static void main(String[] args) {
		
		//std1과 std2는 각각 다른 복사본 이다
		Student std1 = new Student(); //new 객체화 원본에 class를 복사 해오는 것
		Student std2 = new Student(); //new 는 복사하고 붙여넣기
		
//		일련번호를 보면 서로 다르다(내용은 같을 지라도..)
		System.out.println(std1);
		System.out.println(std2);
		
		//그래서 String끼리 == 대조한다면 일련번호를 대조하기 때문에 다르다고 판단 할수가 있다
		//그래서 equals()를 통해 일련번호가 아닌 내용으로 대조 하도록 해야 한다

	}

}
