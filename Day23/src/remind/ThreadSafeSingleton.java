package remind;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton INSTANCE;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		return INSTANCE;
	}
}
