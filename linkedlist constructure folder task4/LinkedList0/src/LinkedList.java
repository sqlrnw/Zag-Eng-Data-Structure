import java.util.NoSuchElementException;

public class LinkedList {

class Node{
    int value;
    Node nextNode;
     }
Node head;
Node tail;
int size=0;
public void addFirst(int value){
    Node node =new Node();
    node.value=value;

    if(head==null){
        head=tail=node;
        return;
    }
    else {
        node.nextNode = head;
        head = node;
    }
    size++;
}
    //O(1)
    public void addLast(int value){
     Node node=new Node();
       node.value=value;
        if(head==null){
             head=tail=node;
        }
        else {
            tail.nextNode=node;
            tail=node;
        }
        size++;
    }
    //O(1)
    public void removeFirst(){
     if (head==null&&tail==null) throw new NoSuchElementException("that list is empty");
     if(head==tail) head=tail=null;
     else {
      Node firstItem =head;
      head=head.nextNode;
      firstItem.nextNode=null;
     }
     size--;
    }
    //O(1)
    public void removeLast(){
        if (head==null&&tail==null) throw new NoSuchElementException("that list is empty");
        if(head==tail) head=tail=null;
        else {
            Node beforeLast=getBeforeLast();
            tail=beforeLast;
            beforeLast.nextNode=null;
        }
        size--;
    }
    //O(n)
    private  Node getBeforeLast(){
    Node beforeLast=head;
    Node current=head;
      while(current.nextNode !=null){
          beforeLast=current;
          current=current.nextNode;
      }
      return beforeLast;
    }
    public int indexOf(int value){
      Node current=head;
      int index=0;
      while (current!=null){
           if(current.value==value)return index;
            index++;
            current=current.nextNode;
      }
      return -1;
    }
    //O(n)
    public boolean contains(int value){
       int index=indexOf(value);
       return index!=-1;
    }
    public int size(){
    return size;
    }
    //O(1)
    public void printElementsInList(){
        Node current=head;
        for(int i=0;i<=size;i++) {
            System.out.println(current.value);
            current = current.nextNode;
        }
    }
    //O(n)
    public int max(){
    Node max=new Node();
    max.value =Integer.MIN_VALUE;
    Node current=head;
      while (current!=null){
          if(max.value<current.value)
              max.value=current.value;
          current=current.nextNode;
     }
    return max.value;
    }
    //O(n)
    public int min() {
        Node min = new Node();
        min.value = Integer.MAX_VALUE;
        Node current = head;
        while (current != null) {
            if (min.value > current.value)
                min.value = current.value;
            current = current.nextNode;
        }
       return min.value;
    }
 //O(n)
}
