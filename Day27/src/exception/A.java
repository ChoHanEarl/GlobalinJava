package exception;

public class A {

	void a() {

		// 예외 처리
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("산술 예외 상황 발생");
		} catch (Exception e) {
			System.out.println("예외 상황 발생");
		}
	}

}
