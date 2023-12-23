public class QueueBasedOnLinkedList {
    class Node {
        int value;
        Node nextValue;

        public Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;

    public void enqueue(int value) {
        Node node = new Node(value);
        if (isEmpety()) {
            head = tail = node;
            return;
        }
        tail.nextValue = node;
        tail = node;
    }

    public int dequeue() {
        if (isEmpety())
            throw new RuntimeException("make some enqueue first");
        Node emsko = head;

        head = head.nextValue;
        emsko.nextValue = null;

        return emsko.value;
    }

    public int peek() {
        if (isEmpety())
            throw new RuntimeException("make some enqueue first");
        Node emsko = head;

        return emsko.value;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.nextValue;
        }

    }

    public int size() {
        Node current = head;
        int numberOfElements = 1;
        while (current.nextValue != null) {
            current = current.nextValue;
            numberOfElements++;
        }
        return numberOfElements;
    }

    public boolean isEmpety() {
        return head == null && tail == null;
    }

}
