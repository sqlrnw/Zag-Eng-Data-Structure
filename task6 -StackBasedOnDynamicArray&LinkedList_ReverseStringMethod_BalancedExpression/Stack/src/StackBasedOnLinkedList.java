public class StackBasedOnLinkedList {
    private class Node {
        int value;
        Node Down;
    }

    Node Top;


    public boolean isEmpty() {
        return Top == null;
    }

    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.Down = Top;
        Top = node;
    }

    public int peek() {
        if (isEmpty())
            throw new RuntimeException();
        return Top.value;

    }

    public int pop() {
        if (isEmpty())
            throw new RuntimeException();
        Node sendingElement = Top;
        Top = Top.Down;
        sendingElement.Down = null;
        return sendingElement.value;
    }
}
