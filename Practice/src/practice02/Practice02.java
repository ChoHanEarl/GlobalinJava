package practice02;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		// int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 0;
		if(x > 10 && x < 20) {
			
		}
		
		// char형 변수 ch가 'x' 또는 'X'일때 true인 조건식
		char ch = ' ';
		if(ch == 'x' && ch == 'X') {
			
		}
		
		if( ch == 88 && ch == 120 ) {
			
		}
		
		// char형 변수 ch가 알파벳일 때 true인 조건식
		if ( ( ch >= 'a' && ch <= 'z' ) || ( ch >= 'A' && ch <= 'Z')) {
			
		}
		
		// 삼항연산자로 만들었던 X개의 농구공을 담기 위한 박스의 개수 구하기
		// 키보드에서 값을 입력받아 ball 변수에 저장하기
		// 입력받은 공의 개수에 따라 보관에 필요한 박스의 개수를 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("공의 개수 : ");
		int ball = sc.nextInt();
		
		int box = 0;
		if ( ball % 5 == 0 ) {
			box = ball / 5;
		} else {
			box = ball / 5 + 1;
		}
		
		System.out.println("필요한 박스의 개수 : " + box);
		
		// 정수형 변수를 하나 만들고 해당 달이 몇일까지 있는지 switch문을
		// 이용해서 작성하시오.
		
		int month = 2;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
		}
	}
}
