package collections.EMS;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 4); // Add 4 at index 1

        // Display the list
        System.out.print("List after adding elements: ");
        list.displayList();

        // Display elements by index
        System.out.println("Element at index 0: " + list.display(0));
        System.out.println("Element at index 1: " + list.display(1));
        System.out.println("Element at index 2: " + list.display(2));

        // Delete an element
        list.delete(2); // Delete element at index 2

        // Display the list after deletion
        System.out.print("List after deleting element at index 2: ");
        list.displayList();

        // Get size of the list
        System.out.println("Size of the list: " + list.size());
    }
}
