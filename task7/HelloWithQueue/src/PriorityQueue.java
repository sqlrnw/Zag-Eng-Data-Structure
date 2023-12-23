public class PriorityQueue {
    int[] array;

    int count = 0;
    int size = 0;

    public PriorityQueue(int size) {
        this.size = size;
        array = new int[size];
    }

    public void add(int value) {
        if (isFull()) throw new RuntimeException("It's full");
        int indexOfAddedValue = locationOfValue(value);
        array[indexOfAddedValue] = value;
        count++;


    }

    public int remove() {
        if (isEmpety()) throw new RuntimeException("It's empety");

        int emsko = array[0];
        for (int i = 0; i < count - 1; i++) {
            array[i] = array[i + 1];

        }
        count--;
        return emsko;
    }

    public int peek() {
        if (isEmpety()) throw new RuntimeException("It's empety");

        int emsko = array[0];
        return emsko;
    }

    private boolean isEmpety() {
        return count == 0;
    }

    private int locationOfValue(int value) {
        int i = count - 1;
        for (; i >= 0; i--) {
            if (array[i] > value)
                array[i + 1] = array[i];
            else
                break;
        }
        return i + 1;
    }

    private boolean isFull() {
        return count == size;
    }

    public int size() {
        return count;
    }

    public void print() {
        for (int i = 0; i < count - 1; i++) {
            System.out.print(array[i]);
        }
    }


}
