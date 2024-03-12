package ex06;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		int result = 0;
		int[] arr = {};
		int num = 1;
		
		arr = new int[]{1, 1, 2, 3, 4, 5};
		
		result = sol.solution(arr, num);
		System.out.println(result);
		
		arr = new int[]{0, 2, 3, 4};
		result = sol.solution(arr, num);
		System.out.println(result);

	}

}
