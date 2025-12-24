package javaBean;

import java.io.Serializable;

public class A implements Serializable {
	
	// Java Bean으로 인정받기 위한 규칙
	// 1. 기본 생성자(no-argument constructor)가 있어야 함
	//    매개변수가 없는 public 생성자 필요
	// 2. private 필드 선언(캡슐화 규칙)
	// 3. Getter/Setter 메서드
	// 4. Serializable 인터페이스 구현(권장)
	
	private int a;
	
	public A() {
		// 아래 매개변수 있는 public생성자로 감
		this(10);
	}
	
	public A(int a) {
		
	}
	
	public int getA() {
		return this.a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
}
