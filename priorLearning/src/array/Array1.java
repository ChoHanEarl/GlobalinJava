package array;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		// 배열이란?
		// 자료형이 같은 둘 이상의 값을 저장할 수 있는 메모리 공간
		// 구조에 따라 1차원 배열과 2차원 이상의 다차원 배열로 나뉜다.
		
		int[] ref = {10, 20, 30, 40, 50};
//		int[] ref = new int[5];
		
		System.out.println(ref); // 주소값 출력
		System.out.println(Arrays.toString(ref)); // 실제 갖고 있는 값 출력
		
		// int[] ref => 배열 형태의 참조변수 생성
		// ref는 new int[5]를 참조함. 즉 주소를 갖고 있음
		// new int[5]는 인스턴스(객체). 5개의 int형 변수를 갖는
		// 길이 5의 인스턴스이다. 이는 메모리의 Heap 영역에 저장된다.
		
		// 배열 생성 예시와 배열이 인스턴스임을 보이는 예시
		
		// 길이가 5인 int형 1차원 배열의 생성
		int[] ar1 = new int[5];
		
		// 길이가 7인 double형 1차원 배열의 생성
		double[] ar2 = new double[7];
		
		// 배열의 참조변수와 인스턴스 생성 분리
		float[] ar3; // 참조변수 생성
		ar3 = new float[9]; // 인스턴스 생성
		
		// 배열 객체의 필드(속성) 접근
		System.out.println("배열 ar1 길이 : " + ar1.length);
		System.out.println("배열 ar2 길이 : " + ar2.length);
		System.out.println("배열 ar3 길이 : " + ar3.length);
		
		// 배열의 인스턴스 주소 접근
		System.out.println("배열 ar1 주소 : " + ar1);
		System.out.println("배열 ar2 주소 : " + ar2);
		System.out.println("배열 ar3 주소 : " + ar3);
		
		// 배열의 실제 메모리 값 접근(따로 초기화를 하지 않아 
		// 자동으로 0으로 초기화가 된다.)
		System.out.println("배열 ar1 값 : " + Arrays.toString(ar1));
		System.out.println("배열 ar2 값 : " + Arrays.toString(ar2));
		System.out.println("배열 ar3 값 : " + Arrays.toString(ar3));
		
		// ar1, ar2, ar3는 모두 참조 변수이기 때문에 변수 자체는
		// 해당 배열의 실제 메모리에 저장된 값이 아닌 주소값을 가지고 있다.
		// 실제 값을 알기 위해서는 Arrays.toString()이라는 메서드를
		// 활용하면 알 수 있다.
	}
}
