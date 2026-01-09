package exception;

public class Tester {
	public static void main(String[] args) {
		
		try {
			new A().a2();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("산술 예외 발생");
		}
		
		
		A a = new A();
		a.a();
		
		// try catch가 없을 시 안찍힘(a메소드에서 막히기 때문)
		System.out.println("end"); 
		
		try {
			A a2 = new A();
			a2.a3();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
