package practice;

import java.util.Arrays;

public class DTester {
	public static void main(String[] args) {
		
		// 기본 타입은 그냥 저장
		int i = 10;
		
		// 참조 타입은 new를 사용
		D d = new D();
		System.out.println(d.d);
		
		D d2 = new D(10,20);
		System.out.println(d2.d);
		d2.d(i, 5);
		
	}
}
