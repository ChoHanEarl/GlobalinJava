package classPractice;

public class DTester2 {
	public static void main(String[] args) {
		D d1 = new D();
		D d2 = new D();
		d2 = d1; // 기존 d2의 주소 데이터는 가비지화
		new E().e(d2, 20);
		System.out.println(d1.d);
	}
}
