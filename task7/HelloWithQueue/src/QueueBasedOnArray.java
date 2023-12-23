public class QueueBasedOnArray {
    int[] array;
    int size = 0;
    int count = 0;
    int first = 0;
    int last = 0;

    public QueueBasedOnArray(int size) {
        this.size = size;
        array = new int[size];
    }

    public boolean isFull() {
        return count == size;
    }

    public int size() {
        return count;
    }

    /* public void print() {   {{{{{{ see this reda .}}}}}}}

         if (last > first) {
             int[] items = new int[last];

             for (int i = first; i < last; i++) {
                 items[i] = array[i];
                 System.out.print(items[i] + " ");

             }

         } else if (first > last) {
             int[] items = new int[size];

             for (int i = 0; i < size; i++) {
                 items[i] = array[i];
                 System.out.print(items[i] + " ");
                 //there are a problem here i can't solve ,please give me comment .
             }

         } else if (first == 0 && last == 0) {
             int[] items = new int[size];
             for (int i = 0; i < size; i++) {
                 items[i] = array[i];
                 System.out.print(items[i] + " ");
             }
         } else throw new RuntimeException("check the count baby");
     }*/
    public void print() {
        System.out.print("[");
        if (!isEmpty()) {
            System.out.print(array[first]);
            int current = (first + 1) % size;
            while (current != last) {
                System.out.print(", " + array[current]);
                current = (current + 1) % size;

            }


        }
        System.out.print("]");

    }

    public int peek() {
        if (isEmpty())
            throw new RuntimeException("check the items baby");
        return array[first];
    }

    public int dequeue() {
        if (isEmpty())
            throw new RuntimeException("check the items baby");
        int theFirst = array[first];
        array[first] = 0;
        first = (first + 1) % size;
        count--;
        return theFirst;
    }

    public void enqueue(int item) {
        if (isFull())
            addsize(array);
        array[last] = item;
        count++;
        last = (last + 1) % size;
    }

    private void addsize(int[] array) {
        size += 3;
        int[] newArray = new int[size];
        for (int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public boolean isEmpty() {
        return count == 0;
    }
    //all down for potato game

}
