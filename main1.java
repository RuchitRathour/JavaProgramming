package Hash.HashMap;

import java.util.HashMap;

public class main1 {
    public static void main(String[] args) {
        // 2. entrySet() se iteration (BEST method ⭐)
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
