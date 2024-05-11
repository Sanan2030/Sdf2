package MapCreater;

import java.util.Map;
import java.util.HashMap;

public class MapPrinter {
    public static <N, S> void printMap(Map<N, S> map) {
        for (Map.Entry<N, S> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        System.out.println("Mapin Daxili:");
        printMap(map);
    }
}
