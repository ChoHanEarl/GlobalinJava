package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		// 배열 선언 방법 1
		int[] arr = {1, 2, 3};
		
		// 배열 선언 방법 2
		int[] arr2 = new int[]{1, 2, 3};
		
		// 배열 선언 방법 3
		int[] arr3 = new int[3];
		arr3[0] = 1;
//		arr3[1] = 2;
		arr3[2] = 3;
		
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		
//		System.out.println(Arrays.toString(arr3));
		
		// 배열의 인덱스가 여러 개일 경우
		int[] arr4 = new int[200];
		
		for(int i = 0; i < arr4.length; i++) {
			arr4[i] = i + 1;
		}
		
		System.out.print(Arrays.toString(arr4));
	}
}
