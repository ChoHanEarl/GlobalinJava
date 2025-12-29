package practice03;

import java.util.Random;
import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		// 배열에서 영문자만 추출하여 이어붙여 출력하시오.
		// 배열 요소 : 1, L, O, 2, V, 3, E
		
		char[] arr = {'1','L','O','2','V','3','E'};
		String myWord = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 65 && arr[i] <= 90) {
				myWord += arr[i];
			}
		}
		System.out.println(myWord);
		
		// 배열 arr2에 담겨 있는 모든 값의 합 출력
		int[] arr2 = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i = 0; i < arr2.length; i++) {
			sum += arr[i]; 
		}
		System.out.println("결과 : " + sum);
		
		// 키보드에서 배열의 길이 입력받는다.
		// 입력받은 배열의 길이만큼 알파벳을 넣고 출력한다.
		// 예시
		// 배열의 길이는 몇으로? : 5
		// ABCDE
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이는 몇으로? : ");
		int length = sc.nextInt();
		
		char[] ch = new char[length];
		char ch2 = 'A';
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] = ch2++);
		}
		
		// 동전의 개수 구하기
		// 10 ~ 5000 사이의 난수를 변수에 담는다.
		// 1의 자리는 반드시 0이 되도록 한다.
		// 발생된 난수를 각 동전으로 바꾸면 몇 개씩 필요한지 판단하는 코드 작성
		// 가능한 적은 수의 동전을 사용하도록 한다.
		
		// 예시
		// 4170
		// 500원 : 8
		// 100원 : 1
		// 50원 : 1
		// 10원 : 2
		
		int[] coin = { 500, 100, 50, 10 };
		int money = new Random().nextInt(500) + 1;
		money *= 10;
		System.out.println("금액 : " + money);
		for(int i = 0; i < coin.length; i++) {
			int coinNum = money / coin[i];
			money %= coin[i];
			System.out.printf("%d원 : %d\n", coin[i], coinNum);
		}
		
		
		
	}
}
