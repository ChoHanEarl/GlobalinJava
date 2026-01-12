package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class A {
	ArrayList<Fruit> list = new ArrayList<Fruit>();
	ArrayList<Fruit> a(ArrayList<Fruit> list) {
		if ( list.isEmpty() ) list = new ArrayList<Fruit>();
		Iterator<Fruit> ite = list.iterator();
		while( ite.hasNext() ) {
			Fruit f = ite.next();
		}
//		list.add(10);
//		list.add("Hello");
//		list.add(true);
//		// List는 중복 가능
//		list.add(true);
		list.add(new Fruit());
		list.add(new Fruit());
		
		// get은 기본으로 Object이기 때문에 명시적 형변환 필요
//		Boolean isTrue = (Boolean)list.get(2);
//		Fruit fruit = (Fruit)list.get(0);
		// 제네릭을 통해 Type으로 Fruit을 줬기 때문에
		// 무조건 Fruit이기 때문에 명시적 형변환 생략 가능해짐
		Fruit fruit = list.get(0);
		
		// remove는 index 자체가 지워지고 한 칸 앞으로 댕겨진다.
		list.remove(1);
//		list.remove(new Fruit());
		
		System.out.println();
		return list;
	}
	
}
