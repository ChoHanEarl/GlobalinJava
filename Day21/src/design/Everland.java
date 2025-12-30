package design;

/*
 * 실습
 * 
 * 1. 에버랜드를 싱글턴 패턴으로 만드시오.
 * 2. 
 */
public class Everland {
	private static Everland INSTANCE = new Everland();
	private Everland() {}
	
	public static Everland getInstance() {
		return INSTANCE;
	}
	
	public void e() {
		Everland.getInstance();
	}
	
}
