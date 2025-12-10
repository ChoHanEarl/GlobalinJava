package array;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		// 실습 1
		// 1 ~ 10까지의 숫자가 저장된 배열을 새 배열에 복사하기
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
//		System.out.print(Arrays.toString(arr));
		
		// 실습 2
		// 1번 문제에서 만든 새 배열의 값을 내림차순 정렬하기
//		for(int j = 0; j < arr.length / 2; j++) {
//			int temp = arr[j];
//			arr[j] = arr[arr.length - 1 - j];
//			arr[arr.length - 1 - j] = temp;
//		}
		
		// 버블 정렬(bubble sort)
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
}
