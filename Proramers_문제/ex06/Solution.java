package ex06;

import java.util.Iterator;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i]+" ");
			if (array[i] == 1) {
//				System.out.print(array[i]);
				answer+=array[i];
			}
		}
        
        return answer;
        
//    정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때
//    array에 n이 몇 개 있는 지를 return
//    하도록 solution 함수를 완성해보세요.
    }
}
