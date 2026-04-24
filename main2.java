package Hash.HashSet;

import java.util.HashSet;

public class main2 {
    public static void main(String[] args) {

        // Creating a HashSset
        HashSet<String> set = new HashSet<>();

        // Adding Elements
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate, will be ignored

        //Displaying Elements
        System.out.println(set);

        //Checking Element
        System.out.println(set.contains("Apple")); // true

        // Removing Element
        set.remove("Banana");

        // Iterating Through HashSet
        for (String item : set) {
            System.out.println(item);
        }
    }
}
