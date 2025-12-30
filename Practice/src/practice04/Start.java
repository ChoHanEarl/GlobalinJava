package practice04;

import java.util.Random;

public class Start {

	public int random() {
		Random random = new Random();
		int randomInt = random.nextInt(50)+1;
		return randomInt;
	}
}
