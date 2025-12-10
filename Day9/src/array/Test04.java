package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 로또 번호 추첨
		
		Scanner sc = new Scanner(System.in);
		
		int[] guestArray = new int[6];
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("%d번째 숫자를 입력하시오 : ", i+1);
			guestArray[i] = sc.nextInt();
		}
		
		int[] lotto = new int[6];
		Random rand = new Random();
		
		for(int i = 0; i < 6; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			
		}
		
		int atari = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if ( guestArray[i] == lotto[j] ) {
					atari++;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(guestArray));
		System.out.println(Arrays.toString(lotto));
		System.out.println(atari);
	}
}
