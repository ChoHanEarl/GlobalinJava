package calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int result = c.add(10, 20);
		System.out.println(result);
		
		result = c.min(10, 30);
		System.out.println(result);
		
		result = c.multi(10, 20);
		System.out.println(result);
		
		result = c.div(30, 10);
		System.out.println(result);
	}
}
