package thread;

public class B extends Thread {

	@Override
	public void run() {
		long s = System.nanoTime();
		//Thread가 해야할 일에 대한 코드
		for ( int i = 1 ; i <= 500000 ; i++ ) {
			 // 스레드를 잠시 쉬라고 하는 기능
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// interrupt 가로채다
				e.printStackTrace();
			}
			System.out.println(this + "=>" + i);			
		}
		long e = System.nanoTime();
		long result = e - s / 1000000;
		System.out.println(this + ":" + result);
	}
	
}
