package ex04_배열의_평균값;

public class Main {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		
		double result=0;
		int[] a; 
		
		a= new int[]{1,2,3,4,5,6,7,8,9,10};
		result = sol.solution(a);
		System.out.println("5.5 == "+result);
		
		a= new int[]{89,90,91,92,93,94,95,96,97,98,99};
		result = sol.solution(a);
		System.out.println("94.0 == "+result);

	}

}
