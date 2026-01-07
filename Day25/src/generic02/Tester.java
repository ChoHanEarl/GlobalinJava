package generic02;

public class Tester {
	public static void main(String[] args) {
		Zoo<Animal>[] zoo = new Zoo[3];
		zoo[0].setT(new Tiger());
		zoo[1].setT(new Lion());
		zoo[2].setT(new Giraffe());
		
		Animal[] arr = new Animal[3];
		arr[0] = zoo[0].getT();
		arr[1] = zoo[1].getT();
		arr[2] = zoo[2].getT();
	}
}
