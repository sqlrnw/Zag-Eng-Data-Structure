public class PotatoGame {
    String[] array;
    int size = 0;
    int count = 0;
   // int first=0;
    public PotatoGame(int size) {
        this.size = size;
        array = new String[size];
    }
    public void enqueue(String item) {
        array[count] = item;
        count++;
    }
    public String dequeue() {
        String theFirst = array[0];
        for(int i=0;i<count-1;i++){
            array[i]=array[i+1];
        }
        count--;

        return theFirst;
    }
   public void print(){
        for (int i=0;i<count;i++)
          System.out.println(array[i]);

   }

}
