package generic02;

public class Zoo<T extends Animal> {

	T t;
	
	void setT(T t){
		this.t = t;
	}
	
	T getT() {
		return this.t;
	}
	
}
