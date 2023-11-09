// Q2. Construct a linked List containing names of colours: red, blue, yellow and orange. Then
// extend the program to do the following:
// i. Display the contents of the List using an Iterator
// ii. Display the contents of the List in reverse order using a ListIterator
// iii. Create another list containing pink and green. Insert the elements of this list between
// blue and yellow. 
import java.util.*;

public class ColorLinkedlist2 {
    public static void main(String[] args) {
        LinkedList<String> cl = new LinkedList<>(Arrays.asList("red", "blue", "yellow", "orange"));

      
        System.out.println("Contents of the list using Iterator:");
        Iterator<String> iterator =cl.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    
        System.out.println("\nContents of the list in reverse using ListIterator:");
        ListIterator<String> listIterator = cl.listIterator(cl.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

       
        List<String> newColors = Arrays.asList("pink", "green");
        ListIterator<String> colorListIterator = cl.listIterator();
        while (colorListIterator.hasNext()) {
            if (colorListIterator.next().equals("blue")) {
                colorListIterator.add(newColors.get(0));
                colorListIterator.add(newColors.get(1));
            }
        }

        // Display the updated list
        System.out.println("\nUpdated list:");
        for (String color : cl) {
            System.out.println(color);
        }
    }
}