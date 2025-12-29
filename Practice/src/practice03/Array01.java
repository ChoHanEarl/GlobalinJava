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
		
		// 로또번호 생성하기
		// 1 ~ 45 사이의 난수를 발생시켜 로또번호를 생성하는 프로그램 만들기
		int[] lotto = new int[6];
		outer : for(int i = 0; i < lotto.length;) {
			lotto[i] = new Random().nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
			}
			System.out.print(lotto[i] + " ");
			i++;
		}
		System.out.println();
		
		// 배열의 모든 요소의 합을 구하여 출력하시오
		int[][] arr3 = {
					   {1,2,3,4,5},
					   {6,7,8,9,10},
					   {11,12,13,14,15},
					   {16,17,18,19,20}
					   };
		int total = 0;
		
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				total += arr3[i][j];
			}
		}
		System.out.println(total);
		
		// 학생들의 정보를 입력하고, 출력하는 프로그램 작성하기
		// 학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
		// 프로그램을 실행하면 몇 명의 정보를 저장할것인지 입력받은 후
		// 입력받은 수 만큼 학생들의 이름과 수학 성적, 영어성적을 입력받는
		// 프로그램 작성
		
		
		System.out.print("등록할 인원 수 : ");
		int student = sc.nextInt();
		String str[][] = new String[student][3];

		for( int i = 0; i < str.length; i++ ) {
			
			System.out.print("이름 : ");
			str[i][0] = sc.next();
			
			System.out.print("수학 : ");
			str[i][1] = "수학 : " + sc.next();
			System.out.print("영어 : ");
			
			str[i][2] = "영어 : " + sc.next();
			System.out.println("----------------");
		
		}
		
		System.out.printf("%d명 등록 완료!!\n", str.length);
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
