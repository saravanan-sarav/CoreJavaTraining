package L_Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "four");

        for (int i : map.keySet()){
            System.out.println(map.get(i));
        }
    }
}
