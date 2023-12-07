import java.util.NoSuchElementException;

public class LinkedList<T> {

    class Node {
        T value;
        Node nextNode;
    }

    Node head;
    Node tail;
    int size = 0;

    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = tail = node;
            return;
        } else {
            node.nextNode = head;
            head = node;
        }
        size++;
    }

    //O(1)
    public void addLast(T value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = tail = node;
        } else {
            tail.nextNode = node;
            tail = node;
        }
        size++;
    }

    //O(1)
    public void removeFirst() {
        if (head == null && tail == null) throw new NoSuchElementException("that list is empty");
        if (head == tail) head = tail = null;
        else {
            Node firstItem = head;
            head = head.nextNode;
            firstItem.nextNode = null;
        }
        size--;
    }

    //O(1)
    public void removeLast() {
        if (head == null && tail == null) throw new NoSuchElementException("that list is empty");
        if (head == tail) head = tail = null;
        else {
            Node beforeLast = getBeforeLast();
            tail = beforeLast;
            beforeLast.nextNode = null;
        }
        size--;
    }

    //O(n)
    private Node getBeforeLast() {
        Node beforeLast = head;
        Node current = head;
        while (current.nextNode != null) {
            beforeLast = current;
            current = current.nextNode;
        }
        return beforeLast;
    }

    public int indexOf(T value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == value) return index;
            index++;
            current = current.nextNode;
        }
        return -1;
    }

    //O(n)
    public boolean contains(T value) {
        int index = indexOf(value);
        return index != -1;
    }

    public int size() {
        return size;
    }

    //O(1)
    public void printElementsInList() {
        Node current = head;
        for (int i = 0; i <= size; i++) {
            System.out.println(current.value);
            current = current.nextNode;
        }
    }
    //O(n)
    public void reverseLinkedList(){
        Node previous=head;
        Node current=previous.nextNode;
         while (current!=null){
             Node next=current.nextNode;
             current.nextNode=previous;
             previous=current;
             current=next;
         }
         Node item= head;
         head=tail;
         tail=item;
    }
    //O(n)
}
