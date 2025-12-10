package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		// 로또 번호 추첨 실습
		// 기존 Test04에서 했던 로또 번호 실습에
		// 개인적으로 몇 가지 더 기능을 추가했다.
		// 1) 사용자가 숫자를 0 이하 혹은 46 이상의 수를 입력했을 경우 다시 입력하게끔 유도한다.
		// 2) 사용자가 이미 입력했던 숫자를 재입력했을 경우 다시 입력하게끔 유도한다.
		// 3) 난수(로또번호)가 중복이 되었을 경우, 기존 수는 그대로 유지한 채 난수를 다시 돌린다.
		
		// 입력을 받기 위해 스캐너 활용
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력한 번호를 저장하는 배열
		int[] userArray = new int[6];
		
		// 사용자가 입력한 번호를 출력하기 위한 for문
		for( int i = 0 ; i < 6 ; i++ ) {
			System.out.print((i+1) + "번째 번호를 입력 : ");
			userArray[i] = sc.nextInt();
			
			// 유저가 0 이하 혹은 46 이상의 수를 입력했을 경우
			if ( userArray[i] <= 0 || userArray[i] >= 46) {
				System.out.println("1 ~ 45 사이의 수를 입력해 주세요.");
				i--;
				continue;
			}
			
			// 유저가 이미 입력했던 수를 다시 입력했을 경우
			for ( int j = 0 ; j < i ; j++ ) {
				if ( userArray[i] == userArray[j] ) {
					System.out.println("이미 동일한 수를 입력하셨습니다.");
					System.out.println("다시 입력해 주세요.");
					i--;
					continue;
				}
			}
		}
		
		// 사용자가 입력한 번호 정보를 한 줄로 출력하는 함수
		System.out.println(Arrays.toString(userArray));
		
		// 로또 번호 추첨을 위한 난수 생성
		Random rd = new Random();
		
		// 뽑은 로또 번호에 대한 정보를 담을 배열 생성
		int[] lotto = new int[6];
		
		// 로또 번호 6개를 뽑는 for문
		for( int i = 0 ; i < 6 ; i++ ) {
			// 배열에 난수(로또번호)를 담는 코드
			// 로또 번호는 45개이지만 45로 지정할 경우
			// 범위가 0 ~ 44이기 때문에 +1을 해준다.
			lotto[i] = rd.nextInt(45) + 1;
			
			// 난수가 중복된 경우를 처리하는 코드
			for( int j = 0 ; j < i ; j++ ) {
				if( lotto[j] == lotto[i] ) {
					i--;
					break;
				}
			}
		}
		
		// 뽑은 로또 번호를 출력해서 보여주는 코드
		System.out.println(Arrays.toString(lotto));
		
		// 당첨된 로또 번호의 갯수를 나타내는 코드
		int atari = 0;
		for( int i = 0 ; i < 6 ; i++ ) {
			for( int j = 0 ; j < 6 ; j++ ) {
				if( lotto[i] == userArray[j] ) {
					atari++;
				}
			}
		}
		
		// 당첨된 로또 번호 갯수를 출력하는 코드
		System.out.println("당첨된 번호 갯수 : " + atari);
	}
}
