package iteration;

public class PersonalTest2 {
	public static void main(String[] args) {
		
		// 1 + ( 1 + 2 ) + ... + ( 1 + 2 + ... + 10 )
		
		int sum = 0;
		int result = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i; // 0 + 1 / 1 + 2 / 3 + 3 / 6 + 4
			result += sum; // 1, 4, 10, 20, 
		}
		
		System.out.println(result);
	}
}
