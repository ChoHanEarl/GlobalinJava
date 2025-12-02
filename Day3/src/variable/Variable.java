package variable;

public class Variable {
	public static void main(String[] args) {
		
		int age; // 변수의 선언
		age = 20; // 변수의 초기화
		System.out.println("나이는 " + age + "살 입니다.");
		
		age = 30; // 변수의 초기화
		System.out.printf("나이는 %d살 입니다.\n", age); // 서식문자
		System.out.println("------------------");
		
		int age2 = 40; // 변수의 선언 및 초기화
		System.out.printf("나이는 %d살 입니다.\n", age2); // 40
		
		age += 50; // age = age + 50
		System.out.printf("나이는 %d살 입니다.\n", age); // 80
		
		// 삼항연산자
		age = age >= 80 ? age + 10 : age + 20; 
		System.out.printf("나이는 %d살 입니다.\n", age); // 90
		
		// 조건문
		if(age >= 90) {
			age -= 50;
		} else {
			age += 50;
		}
		System.out.printf("나이는 %d살 입니다.\n", age); // 40
	}
}
