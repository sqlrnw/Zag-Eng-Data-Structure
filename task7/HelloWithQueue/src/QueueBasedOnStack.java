import java.util.Stack;

public class QueueBasedOnStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    int count = 0;

    public void enqueue(int value) {
        stack1.push(value);
        count++;
    }

    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("it's impety");
        if (stack2.isEmpty()) stack1ItemsToStack2();
        count--;
        return stack2.pop();

    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("it's impety");
        if (stack2.isEmpty()) stack1ItemsToStack2();
        return stack2.peek();

    }

    private void stack1ItemsToStack2() {
        while (!stack1.isEmpty()) stack2.push(stack1.pop());
    }

    private boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return count;
    }

    public void print() {
        if (isEmpty()) throw new RuntimeException("it's impety");
        if (!stack1.isEmpty()) stack1ItemsToStack2();
        System.out.print("[");
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");

        }
        System.out.print("]");

    }

}
