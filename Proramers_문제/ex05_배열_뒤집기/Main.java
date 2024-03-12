package ex05_배열_뒤집기;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		
		int[] result = {};
		
		result = new int[] {1, 2, 3, 4, 5};
		result = sol.solution(result);
		System.out.println(Arrays.toString(result));
		
		result = new int[] {1, 1, 1, 1, 1, 2};
		result = sol.solution(result);
		System.out.println(Arrays.toString(result));
		
		result = new int[] {1, 0, 1, 1, 1, 3, 5};
		result = sol.solution(result);
		System.out.println(Arrays.toString(result));

	}

}
