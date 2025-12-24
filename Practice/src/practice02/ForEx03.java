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
		
		int num = 123456;
		sum = 0;
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("sum = " + sum);
		
		// 다음과 같은 모양으로 출력되게 코드를 작성하시오
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		// 다음과 같은 모양으로 출력되게 코드를 작성하시오
		// 01 02 03 04
		// 05 06 07 08
		// 09 10 11 12
		
		int count = 0;
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.printf("%02d ", ++count);
			}
			System.out.println();
		}
		
		// 다음과 같은 모양으로 출력되게 코드를 작성하시오
		// A B C D
		// E F G H
		// I J K L
		
		char a = 'A';
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.printf("%c ", a++);
			}
			System.out.println();
		}
		
		// 다음과 같은 모양으로 출력되게 코드를 작성하시오
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
		// 다음과 같은 모양으로 출력되게 코드를 작성하시오
		//     *
		//    * *
		//   * * *
		//  * * * *
		// * * * * *
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		// 다음과 같은 모양으로 출력되게 코드를 작성하시오
		//         *
		//       * *
		//     * * *
		//   * * * *
		// * * * * *
		
		for ( int i = 0; i < 5; i++ ) {
			for ( int j = 0; j < 5 - (i + 1); j++ ) {
				System.out.print(" ");
			}
			for ( int k = 1; k <= i + 1; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 다음과 같은 모양으로 출력되게 코드를 작성하시오
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		// ...
		// 10 1 2 3 4 5 6 7 8 9
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 0; j < 10; j++) {
				int num1 = i + j;
				if(num1 > 10) {
					num1 -= 10;
				}
				System.out.print(num1 + " ");
			}
			System.out.println();
		}
		
	}
}
