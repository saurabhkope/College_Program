// Q1. Construct a Linked List having names of Fruits: Apple, Banana, Guava and Orange. Display
// the contents of the List using an Iterator.


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class FruitListExample1 {
    public static void main(String[] args) {
        // Create a linked list to store fruit names
        List<String> fruitList = new LinkedList<>();

        // Add fruit names to the list
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Guava");
        fruitList.add("Orange");

        // Use an iterator to display the contents of the list
        ListIterator<String> iterator = fruitList.listIterator();
        System.out.println("Fruit List:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
