package Hash.HashSet;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        // size
        System.out.println("size of set is : " + set.size());

        //Search
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain 6");
        }

        // Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1");
        }
    }
}
