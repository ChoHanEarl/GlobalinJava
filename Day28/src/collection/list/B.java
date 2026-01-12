package collection.list;

import java.util.LinkedList;

public class B {
	LinkedList list = new LinkedList();
	
	void b() {
		list.add(10);
		list.add("Hello");
		list.add(true);
		// List는 중복 가능
		list.add(true);
		list.add(new Fruit());
		list.add(new Fruit());
		
		// get은 기본으로 Object이기 때문에 명시적 형변환 필요
		Boolean isTrue = (Boolean)list.get(2);
		Fruit fruit = (Fruit)list.get(4);
		
		// remove는 index 자체가 지워지고 한 칸 앞으로 댕겨진다.
		list.remove(2);
//		list.remove(new Fruit());
		
		System.out.println();
	}
	
}
