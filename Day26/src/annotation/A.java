package annotation;

public class A {

	@Hello(message = "Hi")
	void a(String msg) {
		System.out.println("Hello");
	}
	
}
