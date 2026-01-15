package thread;

// Thread를 상속받으면 그 클래스가 스레드가 된다.
// 스레드의 목적은 작업을 동시에 진행하는 것.
// Thread가 주방장이라면 A는 요리
public class A extends Thread {

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
