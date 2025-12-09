package test;

public class Test02While {
	public static void main(String[] args) {
		
		// while문은 특정 구간이 끝날 경우
		// 반복을 중지할 때 주로 사용한다.
		
		int i = 1;
		while ( true ) {
			if (i > 10) {
				break;
			}
			System.out.print(i + " ");
			i++;
		}
	}
}
