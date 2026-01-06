package objectPractice;

public class Tester {
	public static void main(String[] args) {
		Member m = new Member();
		String str = m.toString();
		System.out.println(str);
		Student s = new Student();
		boolean isSame = m.equals(s);
		System.out.println(isSame);
	}
}
