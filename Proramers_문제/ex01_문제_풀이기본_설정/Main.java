package ex01_문제_풀이기본_설정;

public class Main {

	public static void main(String[] args) {
		// 문제
		
		//객체선언
		Solution sol = new Solution();
		
		//변수 선언
		int result = 0;
		
		// Solution로 보낼 값
		result = sol.solution(2, 3);

		//Solution 결과 값 받아오기
		System.out.println("5=="+result);
		
		result = sol.solution(100, 2);
		System.out.println("102== "+result);
	}

}
