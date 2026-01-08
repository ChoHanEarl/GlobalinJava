package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Tester {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		A a = new A();
		Method[] m = a.getClass().getDeclaredMethods();
		Hello h = m[0].getAnnotation(Hello.class);
		String msg = h.message();
		m[0].invoke(a, msg);
		System.out.println(msg);
	}
}
