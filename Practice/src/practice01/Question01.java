package practice01;

import java.util.Scanner;

public class Question01 {
	public static void main(String[] args) {
		
		// 다음 중 기본자료형이 아닌 것은?
		// a. int b. byte c. double 4. boolean
		// 정답: 모두 기본자료형
		// * 참조 : String 등 클래스
		
		// 다음 문장들의 출력 결과를 적으세요
		System.out.println("1" + "2");
		// 정답 : 12
		
		// 다음 중 변수의 이름으로 사용할 수 있는 것을 모두 고르시오.
		// 1. $ystem
		// 2. channel#5
		// 3. 7eleven
		// 4. If
		// 5. 자바
		// 6. new
		// 7. $MAX_NUM
		// 8. hello@com
		
		// 정답: 1, 4, 5, 7
		
		// 다음 중 변수를 잘못 초기화 한 것을 고르시오.
		// 1. byte b = 256;
		// 2. char c = ";
		// 3. char answer = 'no';
		// 4. float f = 3.14;
		// 5. double d = 1.4e3f;
		
		// 다음의 결과값을 예상하여 쓰시오
		int x = 5;
		int y = x++;
		
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		
		// 정답: x == 6, y == 5
		
		// 다음 연산의 결과를 예상하여 쓰시오
		int x1 = 10;
		int y1 = 20;
		int z = (++x1) + (y1--);
		System.out.println(z);
		// 정답 : 31
		
		// 다음 연산의 결과를 예상하여 쓰시오
		int a = 10;
		int b = 12;
		boolean result;
		result = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a + b) - (b % a) > 10;
		System.out.println(result);
		
		// 정답 : true
		
		// 과수원 문제
		// 과수원이 있다.
		// 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5, 7, 5개이다.
		// 과수원에서 하루에 생산되는 총 개수를 출력하고, 시간당 전체 과일의
		// 평균 생산 갯수를 출력하시오. 평균값을 담는 변수는 float으로 할 것.
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int total = pear + apple + orange;
		float average = total / 24f;
		System.out.println("하루 생산 과일 수 : " + total);
		System.out.println("시간당 평균 생산 갯수 : " + average);
		
		// 박스의 개수 구하기
		// 상자 하나에는 농구공이 5개 들어갈 수 있다.
		// 만일 농구공이 23개라면 몇 개의 상자가 필요한가?
		
		int ball = 23;
		int box = ball % 5 == 0 ? (ball / 5) : (ball / 5) + 1;
		System.out.println(box);
		
		// 다음의 문제를 해결하시오
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		// 1. 세 과목에 대한 합계 출력하기
		// 2. 평균 출력하기
		
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상이면 합격
		// 아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		float avg = sum / 3.0f;
		
		String isPass = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60) ? "합격" : "불합격";
		System.out.println("점수 합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(isPass);
		
	}
}
