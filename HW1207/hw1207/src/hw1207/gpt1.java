package hw1207;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gpt1 {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Original list: " + fruits);

        // Shuffle the list
        Collections.shuffle(fruits);
        System.out.println("Shuffled list: " + fruits);

        // Sort the list
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);
    }
}

