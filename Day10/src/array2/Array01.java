package array2;

public class Array01 {
	public static void main(String[] args) {
		// 다차원 배열
		int[][] score1;
		int score2[][];
		int[] score3[];
		
		// 4행 3열의 2차원 배열 생성
		int[][] score4 = new int[4][3];
		
		// 2차원 배열의 생성과 초기화
		int[][] arr = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }
		};
		
		// arr -> 0x100
		// arr[0] -> 0x200
		// arr[0][0] -> 1
		// arr[0][1] -> 2
		// arr[0][2] -> 3
		// arr[1] -> 0x300
		// arr[1][0] -> 4
		// arr[1][1] -> 5
		// arr[1][2] -> 6
		
		
	}
}
