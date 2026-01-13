package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTester {

	public static void main(String[] args) {
//		List<String> list = Arrays.asList( "a", "b", "c" );
//		Stream<String> stream1 = list.stream();
//		
//		String[] array = { "a", "b", "c" };
//		Stream<String> stream2 = Arrays.stream(array);
//		Stream<String> stream3 = Stream.of("a","b","c");
//		
//		IntStream intStream = IntStream.range(1, 5); // 1, 2, 3, 4
//		IntStream intStream2 = IntStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5
//
//	
//		Stream<String> stream4 = Stream.<String>builder()
//				.add("a")
//				.add("b")
//				.add("c")
//				.build();
//		
//		Stream<Integer> infinite = Stream.iterate(0, n -> n + 2); // 0, 2, 4, 6, ...
//		Stream<Double> random = Stream.generate(Math::random); // 난수
//		
//		Stream<String> empty = Stream.empty(); // 비어있는 스트림
		
		List<Integer> list = Arrays.asList(-1, 0, -7, 1, 2, 3, -3, 4, 5, 6);
		Predicate<Integer> p = x -> x > 0;
		Function<Integer, Integer> f = x -> x * 2;
		process(list, p, f);
		
	}
	
	static void process(Collection<Integer> c, Predicate<Integer> p, Function<Integer, Integer> f) {
		List<Integer> list3 = ((List<Integer>)c).stream()
				.filter(p) // Predicate, 중간 연산
				.map(f) // Function, 중간 연산
				.collect(Collectors.toList()); // 최종 연산
		
		System.out.println(list3);
		
	}
	
}
