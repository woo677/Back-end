package ex01;

public class StmtContinue_나머지값 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i%3==0) {
//				반복문의 현재 단계를 중단(3의 배수만 찾아냄)
				continue;
			}
			System.out.println(i);
		}

	}

}
