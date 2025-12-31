package practice02;

public class Customer {

	Point point = new Point();
	int havePoint = 0;
	
	void buy() {
		point.createPoint();
		this.havePoint++;
	}
	
}
