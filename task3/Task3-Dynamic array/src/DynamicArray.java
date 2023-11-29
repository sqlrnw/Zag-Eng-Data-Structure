 class DynamicArray {
    int [] array ;
    int sizeOfArray =0 ;
    int countOfElementsInArray =0 ;


    public DynamicArray(int r){
        array =new int[r];
        sizeOfArray =r ;
    }
    public DynamicArray() {
        array = new int[10];
        sizeOfArray = 10;
    }
    public void insert(int value){
        if(countOfElementsInArray==sizeOfArray){
          sizeOfArray=sizeOfArray+2 ;
          int[]anotherArray=new int [sizeOfArray];
           copyArray(array,anotherArray);
          array =anotherArray;
        }
        array[countOfElementsInArray]=value ;
        countOfElementsInArray++;
    }
    public void removeAT(int index){
        if (!isValidIndex(index))
            throw new IllegalStateException();
      for(int i=index;i<countOfElementsInArray-1;i++){
          array[i]=array[i+1];
        // countOfElementsInArray--;
      }
       countOfElementsInArray--;
    }
    public int indexOf(int valueOfIndex){
       for(int i=0;i<countOfElementsInArray;i++){
           if(array[i]==valueOfIndex)
               return i;
       }
       return -1 ;
    }
    public int at(int index) {
        if (!isValidIndex(index))
            throw new IllegalStateException();
        int valueOfIndex = array[index];
        return valueOfIndex;
    }
    public int max(){
           int max=0;
        for(int i=0;i<countOfElementsInArray;i++) {
            if (array[i] > max)
                max = array[i];
        }
        return  max;
    }
     public int min(int []array){
         int min=array[0];
         for(int i=0;i<countOfElementsInArray;i++) {
             if (array[i] < min)
                 min = array[i];
         }
         return  min;
     }
     public void remove(int item){
       int theIndex=indexOf(item);
       removeAT(theIndex);
     }
    public void printArray(){
      for(int i=0;i<countOfElementsInArray;i++)
          System.out.println(array[i]);
        System.out.println(" ");
    }
  public void copyArray(int []array,int[]anotherArray){
        for(int i=0;i<countOfElementsInArray;i++)
          anotherArray[i]=array[i];

  }
  private boolean isValidIndex(int index){
        return index>=0 && index<countOfElementsInArray;
  }
}
