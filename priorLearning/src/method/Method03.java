package method;

public class Method03 {
	
	// 문제
	// 인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메소드와 원의 둘레를 계산해서
	// 반환하는 메소드를 각각 정의하고, 이 둘을 호출하는 main 메소드를 정의하자.
	
	public static void main(String[] args) {
		circle(10);
	}
	
	public static void circle(int half) {
		double hirosa = half * half * 3.14;
		System.out.println("원의 넓이 : " + hirosa);
	}
}
