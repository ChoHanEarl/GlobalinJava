package intermediate;

import java.util.Arrays;

/*
 * 중급
 * Nested loop, Array[][]
 */
public class A {
	// 구구단을 출력하시오.
	void a() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

	// 배열 선언 방법 3가지
	void b() {
		int[] a1 = { 1, 2, 3 };
		int a2[] = new int[] { 1, 2, 3 };
		int[] a3 = new int[3];

		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
		System.out.println();
	}

	// 1부터 10까지의 수 중 짝수만 배열에 저장하시오.
	void c() {
		int[] a1 = new int[5];
		int idx = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				a1[idx] = i;
				idx++;
			}
		}
		System.out.println(Arrays.toString(a1));
	}

	// 2차원 배열 연습
	void d() {
		int[][] a = new int[][] { { 7, 8 }, { 9, 10 }, { 11, 12 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();

	}

	// 배열 정렬(bubble)
	void e() {
		int[] arr = { 5, 4, 3, 2, 1 };
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
