package test;

public class Test04nestFor {
	public static void main(String[] args) {
		// 중첩(2중) for문
		
		//짝수 단만 출력 1
//		for(int dan = 2; dan <= 9; dan++) {
//			if(dan % 2 == 0) {
//				for(int j = 1; j <= 9; j++) {
//					System.out.printf("%d * %d = %d\n", dan, j, dan*j);
//				}	
//			}
//		}
		
		//짝수 단만 출력 2
		for(int dan = 2; dan <= 9; dan += 2) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", dan, j, dan*j);
			}
		}
	}
}
