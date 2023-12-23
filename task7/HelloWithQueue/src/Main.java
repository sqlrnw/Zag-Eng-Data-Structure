import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       System.out.println("enter number of players:");
       int numOfPlayers=in.nextInt();

       PotatoGame queue =new PotatoGame(numOfPlayers);
       for(int i=0;i<numOfPlayers;i++){
           String lettersOfItem=in.next();
           queue.enqueue(lettersOfItem);
       }
       int numberOfRounds= in.nextInt();
       int num=numberOfRounds;
       for(int i=numOfPlayers;i>1;i--) {
           while (numberOfRounds != 0) {
               queue.enqueue(queue.dequeue());
               numberOfRounds--;
           }
           if(numberOfRounds==0)
               numberOfRounds=num;
           queue.dequeue();
       }
       System.out.println("the winner is :"+ queue.dequeue());
    }
    public static void reverseQueue(QueueBasedOnArray s){
       Stack<Integer> stack=new Stack<>();
       while (!s.isEmpty()){
          stack.push(s.dequeue());
       }
       while (!stack.isEmpty()){
          s.enqueue(stack.pop());
       }




    }
}