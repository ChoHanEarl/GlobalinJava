package iteration;

import java.util.Scanner;

public class PersonalTest04 {
	public static void main(String[] args) {
		// 정수를 입력받고 1부터 입력된 수만큼 1씩 증가시키며 별을 찍고,
		// 다시 1까지 감소시키는 출력문을 만들어라.
		// 출력 예시
		// 정수 입력 : 3
		// *
		// **
		// ***
		// **
		// *
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for ( int i = num - 1; i > 0; i--) {
			for ( int j = 0; j < i; j++ ) {
			System.out.print("*");
			}
			System.out.println();
		}	
		
//		for (int i = 1; i < num; i++) {
//			for(int j = num; j > i; j--) {
//				System.out.println("*");
//			}
//			System.out.println("");
//		}
	}
}
