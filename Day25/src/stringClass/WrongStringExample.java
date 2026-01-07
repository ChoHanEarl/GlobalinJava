package stringClass;

public class WrongStringExample {

	// 잘못된 사용 예시
	// String은 불변성에 의해 다음과 같이 코드를 작성하면
	// 메모리를 잡아먹어 성능이 저하된다.
	// 100회 new를 하는 것과 마찬가지이다.
	
	void b() {
		String s = "Hello";
		for( int i = 1 ; i <= 100 ; i++ ) {
			s += i;
		}
		System.out.println(s);
	}
	
}
