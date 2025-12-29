package beginner;

/*
 * 초급
 * if, for, while, break, continue
 */

public class A {
	// 1~10 중 짝수의 합을 구하는 코드
	void a() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
	
	void b() {
		// while문 버전
		int i = 1;
		int sum = 0;
		
		while(true) {
			i++;
			if(i % 2 == 1) {
				continue;
			}
			sum += i;
			if(i == 10) {
				break;
			}
		}
		System.out.println(sum);
	}
	
	// 거꾸로 연산
	// 10부터 1까지 출력하시오.
	void c() {
//		int sum = 0;
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	
}