public class Main {
    public static void main(String[] args) {
        LinkedList link=new LinkedList();
        link.addFirst(50);
        link.addFirst(40);
        link.addFirst(30);
        link.addFirst(20);
        link.addFirst(10);
        link.addLast(60);
      //   link.removeFirst();
      //   link.removeLast();
         link.printElementsInList();
         System.out.println(link.indexOf(20));
        System.out.println(link.max());
        System.out.println(link.min());
        System.out.println(link.size());
        System.out.println(link.contains(60));
    }
}