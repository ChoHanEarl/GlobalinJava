package design.proxy.impl;

public class BProxy implements A{
	
	B b;
	
	public void a() {
		// 전처리
		b.a();
		
		// 후처리
	}
	
}
