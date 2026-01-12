package collection.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class A {

	List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
	List<Member> members = new ArrayList<Member>();
	void a() {
		HashMap<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", "홍길동");
		map1.put("age", "21");
		map1.put("phone", "010-1234-5678");
		list.add(map1);
		
		HashMap<String, Object> map2 = new HashMap<String, Object>();
		map2.put("name", "홍길동");
		map2.put("age", "21");
		map2.put("phone", "010-1234-5678");
		list.add(map2);
		
		Iterator<HashMap<String, Object>> ite = list.iterator();
		while ( ite.hasNext() ) {
			HashMap<String, Object> map = ite.next();
			Set<String> keys = map.keySet(); // key값을 모를 때 꺼내주는 기능( keySet() )
			Collection<Object> values = map.values(); // value를 알려주는 기능
			
		}
		
		Member member1 = new Member("홍길동",21,"010-1234-5678");
		members.add(member1);
		Member member2 = new Member("hong2", 22, "010-1234-5678");
		members.add(member2);
		
		Iterator<Member> ite2 = members.iterator();
		while ( ite2.hasNext() ) {
			Member member = ite2.next();
		}
		
	}
	
}
