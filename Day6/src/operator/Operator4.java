package operator;

public class Operator4 {
	public static void main(String[] args) {
		float f = 5.0f;
		int i = 2;
		boolean flag = false;
		//실수와 정수의연산은 실수로 반환
		System.out.println(f/i);
		
		// 삼항연산자
		flag = ( f/i == 2.5 ) ? true : false; 
		// if문
//		if ( f/i == 2.5 ) {
//			flag = true;
//		}
	}
}
