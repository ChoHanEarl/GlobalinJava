package lambda;

@FunctionalInterface
public interface I {

	void i();
//	void i2(); @FunctionalInterface로 인해 메소드 2개 이상 시 에러. 
				// 함수형이기에 1개만 있어야 하고 그래야 람다식을 활용할 수 있다.
}
