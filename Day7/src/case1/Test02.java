package case1;

public class Test02 {
	public static void main(String[] args) {
		int score = 101;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		// else if문은 자주 쓸 수록 본인도 헷갈리고
		// 코드를 보는 사람도 헷갈리기 때문에
		// 자주 쓰지 않는 것을 권장
		// if문을 여러 개 만들어가면서 점차 범위를
		// 줄여가는 것이 좋다. (ex 중첩 if문)
	}
}
