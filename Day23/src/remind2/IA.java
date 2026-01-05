package remind2;

public interface IA {

	// interface에 등록되는 변수는
	// static final이 기본이다.(상수)
	// public static final int A = 10;
	int A = 10;
	
	void a();
	// 1.8버전부터 default와 static 메소드 정의 가능해짐
	default void a2() {}
	static void a3() {}
	
}
