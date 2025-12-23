package practice02;

public class ForEx03 {
	public static void main(String[] args) {
		// 1 + (1+2) + (1+2+3) ... (1+2+...+10)의 결과 계산
		int sum = 0;
		int totalSum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			totalSum += sum;
		}
		System.out.println(totalSum);
		
		// 2개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든
		// 경우의 수를 출력하는 프로그램을 작성
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i+j == 6) {
					System.out.printf("%d + %d = %d\n", i, j, i+j);
				}
			}
		}
		
		// 각 자리수의 합 더하기
		// int 타입의 변수 num이 있을 때, 각 자리의 합을 더한
		// 결과를 출력하는 코드를 완성하라.
		// num의 값이 12345라면, 1+2+3+4+5의 결과인 15를 출력
		
		int num = 12345;
		sum = 0;
		
		
	}
}
