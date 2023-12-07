public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        link.addFirst(50);
        link.addFirst(40);
        link.addFirst(30);
        link.addFirst(20);
        link.addFirst(10);
        link.addLast(60);
        link.reverseLinkedList();
        link.printElementsInList();
    }
}