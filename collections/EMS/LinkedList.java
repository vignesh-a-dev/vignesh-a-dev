package collections.EMS;


public class LinkedList {
    private Node first = null;
    private int count = 0;

    private class Node {
        int ele;
        Node next;

        Node(int ele, Node next) {
            this.ele = ele;
            this.next = next;
        }
    }

    public void add(int e) {
        if (first == null) {
            first = new Node(e, null);
            count++;
            return;
        }
        Node curr = first;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(e, null);
        count++;
    }

    public void add(int index, int e) {
        if (index <= -1 || index > size()) { // corrected the condition
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = new Node(e, first);
            count++;
            return;
        }
        Node curr = first;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        curr.next = new Node(e, curr.next);
        count++;
    }

    public int size() {
        return count;
    }

    public int display(int index) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node curr = first;
        for (int i = 1; i <= index; i++) {
            curr = curr.next;
        }
        return curr.ele;
    }

    public void delete(int index) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = first.next;
            count--;
            return;
        }
        Node curr = first;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        count--;
    }

    public void displayList() {
        Node curr = first;
        while (curr != null) {
            System.out.print(curr.ele + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
