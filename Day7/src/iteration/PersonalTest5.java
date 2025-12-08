package iteration;

public class PersonalTest5 {
	public static void main(String[] args) {
		// 12345
		// 23456
		// 34567
		// 45678
		// 56789
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%d", i + j + 1);
			}
			System.out.println();
		}
	}
}
