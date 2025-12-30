package design;


import design.factory.ext.A;
import design.factory.ext.B;
import design.factory.ext.C;

public class FactoryExt { // 다형성(상속, 인터페이스)을 바탕으로 한 객체 생성
	A make(String name) {
		if("B".equals(name)) {
			return new B();
		}
		if("C".equals(name)) {
			return new C();
		}
		return null;
	}
}
