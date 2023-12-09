public class StackBasedOnDynamicArray {
    int[] array;

    int size = 0;
    int count = 0;

    public StackBasedOnDynamicArray(int size) {
        this.size = size;
        array = new int[size];
    }

    private boolean isEmpety() {
        return count == 0;
    }

    public void push(int value) {
        if (size == count)
            makeTheArrayBigger();

        array[count] = value;
        count++;
    }

    public int peek() {
        if (isEmpety())
            throw new RuntimeException("the array is empty");
        return array[count - 1];
    }

    public int pop() {
        if (isEmpety())
            throw new RuntimeException("the array is empty");
        count--;
        return array[count];
    }

    public void makeTheArrayBigger() {
        size += 2;
        int[] item = new int[size];
        for (int i = 0; i < count; i++) {
            item[i] = array[i];
        }
        array = item;
    }


}
