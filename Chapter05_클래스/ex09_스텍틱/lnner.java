package ex09_스텍틱;

public class lnner {
	
	public static void main(String[] args) {
		
		st_msg("hello static method"); // 같은 static 영역의 메서드 끼리는 편하게 부르는게 가능
		// 하지만 영역의 다른 h_msg("hello method") 는 부를 수 없다
		lnner inner = new lnner();
		inner.h_msg("hello method"); //영역이 다른것을 부를때는 같은 클래스라 하더라도 다른 클래스에서 부를때 처럼 해야함
		
	}
	
	static void st_msg(String msg) {
		System.out.println("static member method : "+msg);
	}
	
	void h_msg(String msg) {
		System.out.println("member method : "+msg);
		lnner.st_msg("");//다른 영역이므로static 멤버를 사용할때는 다른 클래스에서 부를때 처럼
	}

}
