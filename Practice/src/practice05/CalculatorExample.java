package practice05;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: " + result1);
		
		int x = 10;
		int y = 4;
		double result2 = myCalc.divide(x,y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
		
	}
	
	// 전원을 켭니다.
	// result1: 11
	// result2: 2.5
	// 전원을 끕니다
	
	// 위의 결과가 나오도록 해주시면 됩니다.
}
