package ex04_배열의_평균값;


class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        	double a =0.0;
        	for (int i : numbers) {
				a+=i;
			}
        	
        answer=	a/numbers.length;
        
        return answer;
        
		/*
		  문제
		  정수 배열 numbers가 매개변수로 주어집니다. 
		  numbers의 원소의 평균값을 return하도록 
		  solution 함수를 완성해주세요.
		  
		  
		  
		*/
    }
}
