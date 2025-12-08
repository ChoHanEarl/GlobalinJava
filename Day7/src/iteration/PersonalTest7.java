package iteration;

import java.util.Scanner;

public class PersonalTest7 {
	public static void main(String[] args) {
		// 입력받은 두 수에서 작은 수부터 큰 수까지의 모든 정수의 합을 구하는 예제
		// 1. 입력받은 두 수 중 어떤 수가 큰 수고 작은 수인지 판별할 것.
		// 2. 같은 정수가 입력되었을 경우 어떻게 처리할 것인지 생각할 것.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		// 작은 수를 담을 변수
		int min = 0;
		// 큰 수를 담을 변수
		int max = 0;
		// 합계를 담을 변수
		int total = 0;
		
		// 작은 수와 큰 수를 구별하는 코드
		if (num1 > num2) {
			max = num1;
			min = num2;
		} else if (num1 < num2){
			max = num2;
			min = num1;
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		// 작은 수부터 큰 수까지 더하는 코드
		for(int i = min; i <= max; i++) {
			total += i;
		}
		System.out.printf("%d부터 %d까지의 합 : %d\n", min, max, total);
		
		
	}
}
