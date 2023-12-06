package hw1207;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gpt3{

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Original list: " + numbers);

        // Sorting the list
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Finding the maximum element
        int max = Collections.max(numbers);
        System.out.println("Maximum element: " + max);
    }
}