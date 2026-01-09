package exception;

public class Tester {
	public static void main(String[] args) {
		A a = new A();
		a.a();
		
		// try catch가 없을 시 안찍힘(a메소드에서 막히기 때문)
		System.out.println("end"); 
	}
}
