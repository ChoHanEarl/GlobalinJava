package classPractice;

public class DTester {
	public static void main(String[] args) {
		// 같은 인스턴스여도 new를 새로 생성하면
		// 다른 주소를 가진다.
		
		// 참조에 의한 전달을 다른 말로 
		// call by reference
		
		// 값의 복사본을 전달하고 원본 변수는 영향을 받지 않는 것
		// call by value
		
		D d1 = new D();
		D d2 = new D();
		d2 = d1; // 기존 d2의 주소 데이터는 가비지화
		new E().e(d2, 10);
		System.out.println(d1.d);
	}
}
