package test;

public class Test01 {
	public static void main(String[] args) {
		
//		簡単な例題 (for)
		
		int temp = 0;

		for ( int i = 1 ; i <= 10 ; i++ ) {
			if ( i % 3 == 0 ) {
				temp += i;
			}
		}
		
		System.out.print(temp);
	}
}