package parameter;

import java.util.Scanner;

public class Parameter {
	public static void main(String[] args) {
		//논리형(boolean, 1byte)
		boolean isMember = false;
		int point = 0;
		
		//회원인 경우 포인트 누적
		if(isMember == false) {
			point++;
			System.out.println(point);
		} else {
			System.out.println("회원이 아닙니다");
		}
		
		//문자형(char, 2byte)
		String text = "hello"; // 문자열
		char grade = 'A'; // 문자형
		
		//정수형{byte(1byte)/short(2byte)/int(4byte)/long(8byte)}
		byte a = 127; // -128 ~ 127
		short b = 32767; // -32768 ~ 32767
		int c = 2147483647; // -2147483648 ~ 2147483647
		long d = 9223372036854775807L; // 약 -922경 ~ 922경
		
		//실수형{float(4byte), double(8byte)}
		float PI_VALUE = 3.141592f;
		double db = 123.2;
	}
}
