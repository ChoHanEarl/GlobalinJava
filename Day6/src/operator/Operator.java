package operator;

public class Operator {
	public static void main(String[] args) {
		int i = 10;
		int j = 11;
		
		i += 5; // 15
		j += i++; // j = j + i++; 26
		int sum = i + j; // 16 + 26
		System.out.println(sum);
		
	}
}
