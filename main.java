package Hash.HashMap;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        System.out.println(map);

        // Accessing elements
        System.out.println(map.get(2)); // Banana

        // Removing elements
        map.remove(1);
        System.out.println(map);

        // Checking keys/values
        System.out.println(map.containsKey(2));  // true
        System.out.println(map.containsValue("Apple")); // false

        // Size of HashMap
        System.out.println(map.size());
    }
}
