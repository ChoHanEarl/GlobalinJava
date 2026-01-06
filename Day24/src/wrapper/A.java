package wrapper;

public class A {

	static void a() {
		// 문자를 숫자로 변환
		String s = "10";
		int a1 = 10;
		Integer a2 = Integer.valueOf(s); // Wrapper 클래스 사용
		System.out.println(a2);
		int a = a2;
		
		// 숫자를 문자로 변환
		s = String.valueOf(a); // Wrapper 클래스 사용
		System.out.println(s);  
	}
	
	static void a2() {
		Integer intMax = Integer.MAX_VALUE;
		System.out.println(intMax);
		
		Integer intMin = Integer.MIN_VALUE;
		System.out.println(intMin);
		
		Integer x = 300;
		Integer y = 200;
		int result1 = Integer.compare(x, y);
		int result2 = x.compareTo(y);
		System.out.println(result1);
		System.out.println(result2);
		
	}
	
	public static void main(String[] args) {
		a();
		a2();
	}
	
}
