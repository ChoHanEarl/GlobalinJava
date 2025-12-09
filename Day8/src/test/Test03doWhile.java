package test;

public class Test03doWhile {
	public static void main(String[] args) {
//		do {
//			
//		} while(조건식);
//		자주 안쓰이지만 간혹 필요할 때도 있다.
		
		int i = 1;
		
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 10);
	}
}
