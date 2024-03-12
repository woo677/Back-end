package Arr_배열;

public class OutArr {

	public static void main(String[] args) {
		int[] scores = {95,75,84,35,88};
		
		// 0번방 호출
		System.out.println(scores[0]);
		// 3번방 호출
		System.out.println(scores[3]);
		// 4번방 호출
		System.out.println(scores[4]);
		
		//모든 방 호출
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores["+i+"] = "+scores[i]);
		}
	}

}
