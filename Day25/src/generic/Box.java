package generic;

// Fruit을 포함하여 Fruit을 상속받은 클래스(자식) 모두 포함
// super를 쓰면 Fruit과 부모들을 모두 포함
public class Box<T extends Fruit> {

	// T는 Type의 약자
	// 타입을 미리 정하지 않고 나중에 정함
	private T t;
	
	private Apple apple;
	
	void setT(T t) {
		this.t = t;
	}
	
	T getT(){
		return this.t;
	}
	
	private Object obj;

	void setObject(Object obj) {
		this.obj = obj;
	}
	
	
	Object getObject() {
		return this.obj;
	}
	
}
