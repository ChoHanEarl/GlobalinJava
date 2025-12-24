package practice03;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		// 배열에서 영문자만 추출하여 이어붙여 출력하시오.
		// 배열 요소 : 1, L, O, 2, V, 3, E
		
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		String myWord = "";
		
		for(int i = 0; i < cards.length; i++) {
			int word = cards[i];
			
			if((word >= 65 && word <= 90) || (word >= 97 && word <= 122)) {
				myWord += (char)word;
			}
		}
		
		System.out.println("단어 : " + myWord);
		
		// 배열 arr에 담겨있는 모든 값의 합을 출력하시오
		// arr의 인자 : 10, 20, 30, 40, 50
		// 결과 : 150
		
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for ( int i = 0 ; i < arr.length ; i++ ) {
			sum += arr[i];
		}
		System.out.println("결과 : " + sum);
		
		// 다음 조건에 맞게 문제를 푸시오
		// 키보드에서 배열의 길이를 입력받는다.
		// 입력받은 배열의 길이만큼 알파벳을 넣고 출력한다.
		
		// 예시
		// 배열의 길이는 몇으로? : 5
		// ABCDE
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이는 몇으로? : ");
		int arrayLength = sc.nextInt();
		
		char[] ch = new char[arrayLength];
		char ch2 = 'A';
		for( int i = 0 ; i < ch.length ; i++ ) {
			System.out.print(ch[i] = ch2++);
		}
		
		
	}
}
