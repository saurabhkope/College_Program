// Q1. Construct a Linked List having names of Fruits: Apple, Banana, Guava and Orange. Display
// the contents of the List in reverse order using an appropriate interface.

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
//import java.util.*;

public class LinkedListExample1 {
    public static void main(String[] args) {
        // Create a LinkedList of fruits
        List<String> fruits = new LinkedList<>();

        // Add fruits to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Orange");

        // Display the contents of the list in reverse order using a ListIterator
        ListIterator<String> iterator = fruits.listIterator(fruits.size());

        System.out.println("Fruits in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
