package exception;

public class A {
	// 예외가 발생했을 때
	// 1. 던진다(throws) => 이 예외에 대해 알려줌. 전가. 위임.
	void a2() throws ArithmeticException {
		int a = 10/0;
	}

	// 2. try-catch => 이 예외에 대해 직접 처리할게
	void a() {

		// 예외 처리
		try {
			int a = 10 / 0;
		} catch (ArithmeticException | NullPointerException e) {
//			e.getMessage();
			e.printStackTrace(); // Exception의 기록을 추적해 출력
			System.out.println("산술 예외 상황 발생");
		} catch (Exception e) {
			System.out.println("예외 상황 발생");
		} finally {
			// 마지막으로 반드시 실행해야 할 코드 - close()
		}
	}
	
	void a3() throws SamsungException {
		try {
			int a = 10 / 0;
		} catch(Exception e) {
			e.printStackTrace();
			throw new SamsungException("Exception in Galaxy");
		}
	}

}
