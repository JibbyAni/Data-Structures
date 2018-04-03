import java.util.Arrays;

public class MyArrayList {
  private int actualSize = 0;
  private Object[] dataStore;
  // constructor
  public MyArrayList() {
    dataStore = new Object[10];
  }
  
  public Object get(int index){
    if (index < actualSize) {
      return dataStore[index];
    } else {
      throw new ArrayIndexOutOfBoundException();
    }
  }
  
  public void add(Object obj){
    if dataStore.length - actualSize <= 5
      increaseCapacity();
    dataStore[actualSize++] = obj
  }
  
  private void increaseCapacity(){
    dataStore = Arrays.copyOf( dataStore , dataStore.length * 2);
  }
  
  public int size(){
    return actualSize;
  }
  
  public Object remove(int index){
    if (index < actualSize) {
      Object removed = dataStore[index];
      dataStore[index] = null;
      while ( index < dataStore.length) {
        dataStore[index] = dataStore[index + 1];
        dataStore[index + 1] = null;
        index++;
      }
      actualSize--; 
      return removed;
    } else {
      throw new ArrayIndexOutOfBoundException();
    }
  }
}
