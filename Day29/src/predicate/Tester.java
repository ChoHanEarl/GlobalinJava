package predicate;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Tester {
	public static void main(String[] args) {
		
		// true false(boolean)
		Predicate<Integer> p = x -> x > 0;
		System.out.println(p.test(5));
		
		// 입력과 반환
		Function<String, Integer> f = s -> s.length();
		Function<String, Integer> f2 = String::length;
		System.out.println(f.apply("Hello"));	// 5
		System.out.println(f2.apply("Worldddd"));
		
		// 입력은 있고 반환은 없음
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello World");
		
		Supplier<Double> randomValue = () -> Math.random();
		double rd = randomValue.get();
		System.out.printf("%.2f\n", rd);
	}
}
