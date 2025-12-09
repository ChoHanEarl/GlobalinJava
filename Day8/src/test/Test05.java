package test;

public class Test05 {
	public static void main(String[] args) {
		
		// 별찍기
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 별찍기
		// *****
		// ****
		// ***
		// **
		// *
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		// 별찍기
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if( 5-i >= j ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		// 별찍기
		// *****
		//  ****
		//   ***
		//    **
		//     *
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 5; ; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
