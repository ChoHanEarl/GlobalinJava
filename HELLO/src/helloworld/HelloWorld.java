package helloworld;

public class HelloWorld {
	public static void main(String[] args) {
		
		// Java 버전 변경
		// 우리가 받은 버전은 java 1.8버전
		// 그러나 이클립스는 자동으로 21버전을 활용
		// 이렇게 되면 추후에 문제 발생 여지가 있음
		// 따라서 JRE와 컴파일러 버전을 바꿔주어야 한다.
		// JRE 변경 - java build path -> Libraries에서 변경
		// Compiler level 변경 - java compiler 변경
		
		System.out.println("Hello World");
	}
}
