package ex02_다중상속_처럼쓰는법;

public class Main {

	public static void main(String[] args) {
		
		//사용하고 싶은 메서드가 각각 클래스에서 훝어져 있으므로 각각 객체화 해서 불어내야 한다
		int result =0;
		
		Operator op1= new Operator();
		result = op1.plus(10, 5);
		System.out.println(result);
		
		Operator2 op2= new Operator2();
		result = op1.minus(10, 5);
		System.out.println(result);
		
		Operator3 op3= new Operator3();
		result = op1.multi(4, 3);
		System.out.println(result);
		
		Operator4 op4= new Operator4();
		result = op1.devide(10, 2);
		System.out.println(result);
		
		//4측 연산을 해주자고 객체를 4개를 선언 하는것도 귀찮고, 각 클래스에 어떤 메서드가 있는지 확인 하기도 힘들다
		//그래서 하나의 클래스에 몰아넣어 버리자
		//사용자 입장에서는 Operator 클래스만 기억하면 되니까 편하다
		//상속에 상속에 상속에.. 상속을 해주면 상속을 한 최상위 객체까지(모든 객체를) 쓸수 있다
		result = op1.plus(10, 5);
		result = op1.minus(10, 5);
		result = op1.devide(10, 2);
		result = op1.multi(4, 3);

	}

}
