package design.factory.impl;

import design.factory.impl.A;
import design.factory.impl.B;
import design.factory.impl.C;

public class FactoryImpl {
	
	A makeImpl(String name) {
		if("B".equals(name)) {
			return new B();
		}
		if("C".equals(name)) {
			return new C();
		}
		return null;
	}
	
}
