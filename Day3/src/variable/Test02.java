package variable;

// 식별자(Identifier) 명명 규칙
// 1. 대소문자 구분, 길이 제한 없음
// 2. 예약어 사용 금지
// 3. 숫자로 시작하지 않기
// 4. 특수문자는 언더바(_)와 달러($)만 허용

// 변수 명명 권장사항
// 1. 클래스의 첫글자는 대문자. 변수의 메서드의 첫 글자는 소문자
// 2. 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 한다(ex. lastIndexOf)
// 3. 상수의 이름은 모두 대문자로 한다. 여러 단어로 이루어진 경우 언더바 활용
public class Test02 {
	
	// 전역변수
	int global;
	
	public static void main(String[] args) {
		
		// 로컬변수
		int local; // 기본형 변수
		String str = "hello"; // 참조형 변수
		
		// 상수
		float PI_VALUE = 3.14f;
		
		// 코딩영역
		int x = 10;
		int y = 20;
		int temp = 0;
		
		temp = x;
		x = y;
		y = temp;
		
		//이 위치에서 x, y, temp의 값은?
		System.out.println(x); // 20
		System.out.println(y); // 10
		System.out.println(temp); // 10
		
	}
}
