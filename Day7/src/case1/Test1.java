package case1;

public class Test1 {
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "Hello";
		String s3 = new String("hello");
		String s4 = new String("Hello");
		
		// equals()
		// 문자열의 내용이 같을 경우 참.(대소문자 구분)
		// 객체 비교는 대개 이 메소드를 활용한다.
		
		// equalsIgnoreCase()
		// equals()와 동일하나 대소문자를 구분하지 않는다.
		
		if ( s1.equalsIgnoreCase(s4) ) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		
		// 이렇게만 하면 주소를 비교하는 것이기 때문에
		// 서로 다르다고 인식을 하여 2가 출력됨
		if ( s1 == s3 ) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
	}
}
