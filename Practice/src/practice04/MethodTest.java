package practice04;

public class MethodTest {

	// 배열의 최대값을 찾는 maxFinder 메서드
	public void maxFinder(int[] arr) {
		
		int max = arr[0];
		for(int x : arr) {
			if(x > max) max = x;
		}
		
		System.out.println("최대값 : " + max);
	}
	
	// 원의 넓이와 둘레 구하기
	// MethodTestMain클래스에서 반지름을 넘겨받는다.
	// 메서드는 MethodTest 클래스에 작성한다.
	// 원의 넓이를 구하는 메소드 circleArea 만들기
	// 원의 둘레를 구하는 메소드 circleRound 만들기
	// 단, circleArea 메소드는 함수 안에서 출력문을 출력해야 한다.
	// circleRound 메소드는 round값을 반환하라.
	// 원의 넓이 구하는 공식 : 3.14 * 반지름 * 반지름
	// 원의 둘레 구하는 공식 : 2 * 3.14 * 반지름
	
	public void circleArea(int r) {
		float circleArea = (float) (3.14 * r * r);
		System.out.println("원의 넓이 : " + circleArea);
	}
	
	public double circleRound(int r) {
		double circleRound = 2 * 3.14 * r;
		return circleRound;
	}
	
	// 두 개의 숫자를 사칙연산하는 arithmetic 메서드 만들기
	// MethodTestMain에서 두 숫자를 입력받는다.
	// 메서드는 MethodTest클래스에 정의한다.
	// arithmetic 함수를 만든 후 두 숫자의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지를 출력하시오.
	
	public void arithmetic(int a, int b) {
		
		System.out.println("덧셈결과 -> " + (a + b));
		System.out.println("뺄셈결과 -> " + (a - b));
		System.out.println("곱셈결과 -> " + (a * b));
		System.out.println("나눗셈 몫 -> " + (a / b));
		System.out.println("나눗셈 나머지 -> " + (a % b));
		
	}
}
