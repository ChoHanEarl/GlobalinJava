package classPractice;

public class Tester2 {
	public static void main(String[] args) {
		
		// 생성자 호출
		A3 a1 = new A3();
		A3 a2 = new A3(10);
		A3 a3 = new A3(10,20);
		A3 a4 = new A3(3.5f);
		
		System.out.println();
		
		// 생성자 변수 a1에 대한 a메서드 호출
		a1.a(3); // 3
		a1.a(3.5f); // 6
		a1.a(10,20); // 36
		
		System.out.println();
		
		// 생성자 변수 a2에 대한 a메서드 호출
		a2.a(3); // 13
		a2.a(3.5f); // 16
		a2.a(10,20); // 46
		
		System.out.println();
		
		// 생성자 변수 a3에 대한 a메서드 호출
		a3.a(3); // 33
		a3.a(3.5f); // 36
		a3.a(10,20); // 66
		
//		a.a(10, 20);
	}
}
