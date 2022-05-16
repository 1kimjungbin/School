package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex01 {
/*    Map
    - Map 인터페이스는 자료를 쌍으로 관리하는데 필요한 메소드가 정의되어 있다.*/

    /*
    HashMap<Integer, String> map1 = new HashMap<Integer, String>();

    HashMap<String, String> map2 = new HashMap<>();
    HashMap<String, String> map3 = new HashMap<>(map2); // map2의 모든 값을 가진 HashMap 생성
    HashMap<String, String> map4 = new HashMap<>(10); // 초기 용량을 지정
    HashMap<String, String> map5 = new HashMap<String, String>() {{ // 초기값 지정
        put("a", "b");
    }};*/

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "사과");
        map.put(2, "바나나");
        map.put(3, "포도");

        /*System.out.println(map);
        System.out.println(map.get(2));

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("[key] : " + entry.getKey() + " [value] : " + entry.getValue());
        }

        for(Integer i : map.keySet()) {
            System.out.println("[key] : " + i + " [value] : " + map.get(i));
        }

        System.out.println(map);*/

        map.remove(1);

        Iterator<Integer> keys = map.keySet().iterator();
        while(keys.hasNext()) {
            int key = keys.next();
            System.out.println("[key] : " + key + " [value] : " + map.get(key));
        }
    }
}
