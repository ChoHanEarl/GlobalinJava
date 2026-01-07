package practice05;

public class Computer {

	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int a, int b, int c) {
		return a + b + c;
	}
	
	int sum2(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
	
}
