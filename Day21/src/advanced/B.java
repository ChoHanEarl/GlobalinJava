package advanced;

import java.io.Serializable;

/*
 * Encapsulation, Access Modifier, package, import, Java Bean
 */
public class B implements Serializable{
	private int b;
	public B() {}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getB() {
		return this.b;
	}
	
}
