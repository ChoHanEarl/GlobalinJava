package date;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ZoneIdList {

	void zoneId() {
		
		// 모든 Zone Id 가져오기
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		
		// 정렬을 위해 리스트로 변환
		List<String> sortedZones = new ArrayList<>(zoneIds);
		Collections.sort(sortedZones);
		
		// 출력
		for (String id : sortedZones) {
			System.out.println(id);
		}
		
		System.out.println("\n총 개수: " + sortedZones.size());
		
	}
}
