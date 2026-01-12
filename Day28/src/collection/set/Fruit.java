package collection.set;

import java.util.Objects;

public class Fruit {
	String name;
	
	public Fruit(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.name == ((Fruit)obj).name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
//	@Override
//	public int compareTo(Fruit fruit) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(fruit.name);
//	}
}
