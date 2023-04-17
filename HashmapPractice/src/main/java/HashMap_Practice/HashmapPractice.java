package HashMap_Practice;

import java.util.HashMap;
import java.util.Map;

public class HashmapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "apple");
        map.put(200, "banana");
        map.put(300, "cherry");
        map.put(100,"watermelon");


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
