package operator;

public class Operator3 {
	public static void main(String[] args) {
		int i = 10;
		int j = 11;
		boolean flag = false;
		
		if(i >= j && i <= j) {
			System.out.println("Y");
			flag = true;
		} 
// 		else를 사용하면 코드가 복잡해진다. 
//		가급적 사용 안하는 것을 권장
//		else {
//			System.out.println("N");
//		}
		
		if ( flag ) {
			flag = false;
			if (i >= j || i <= j) {
				flag = true;
			}
		}
		
	}
}
