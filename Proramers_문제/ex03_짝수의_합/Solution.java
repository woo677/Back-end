package ex03_짝수의_합;

import java.util.Iterator;

class Solution {
    public int solution(int n) {
    	
		/*
		 문제 
		 정수 n이 주어질 때
		 n이하의 짝수를 모두 더한 값을
		 return 하도록 solution 함수를 작성해주세요.
		 
		 문제 해석
		 n이하의 짝수를 모두 더한 값을 출력
		 
		 필요한 코드
		 for , if
		*/
    	
        int answer = 0;
        for (int i = 1; i <= n; i++) {
        	if (i%2==0) {
        		answer+=i;
			}
		}
        return answer;
    }
}
