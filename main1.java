package Hash.HashSet;

import java.util.HashSet;

public class main1 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // duplicate

        System.out.println("HashSet: " + numbers);


        // Iterating Through HashSet
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
