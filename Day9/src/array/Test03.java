package array;

import java.util.Arrays;
import java.util.Collections;

public class Test03 {
	public static void main(String[] args) {
		// 1~10까지 배열 생성
		Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 내림차순 정렬
		Arrays.sort(arr, Collections.reverseOrder());
		
		// 결과 출력
		System.out.println(Arrays.toString(arr));
	}
}
