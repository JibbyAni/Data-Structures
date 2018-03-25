public class HashTable {
  // Linked list to implement chaining 
  private class LinkedListNode () {
    Object key;
    Object value;
    LinkedListNode next;
  }
  
  int arraySize;
  int itemsInArray;
  LinkedListNode[] bucketArray;
  
  //constructor
  public HashTable(){
    arraySize = 15; 
    itemsInArray = 0;
    bucketArray = LinkedListNode[arraySize];
  }
  
  //TODO implement own hash function
  private int getBucketIndex {
    int hash = key.hashcode();
    int index = Math.abs( hash % arraySize);
    return index;
  }
  
  private Object get (Object key) {
    int index = getBucketIndex[key];
    LinkedListNode head = bucketArray[index];
    // traverse chain to find key
    while (head != null) {
      if head.key.equals(key)
        return head.value
      head = head.next;
    }
    return null;
  }
  
  private void remove (Object key) {
    int index = getBucketIndex[key];
    LinkedListNode head = bucketArray[index];
    LinkedListNode prev = null;
    // traverse chain to find key to remove
    while (head != null) {
      if head.key.equals(key)
        break;
      prev = head
      head = head.next
    }
    if (head == nul) {
      return;
    }
    if (prev != null) {
      prev.next = head.next;
    } else {
      bucketArray[index] = head.next;
    }
    arraySize --;
  }
  
  private void add (Object key, Object value) {
    int index = getBucketIndex[key];
    LinkedListNode head = bucketArray[index];
    // traverse chain to find if key exists
    while (head != null) {
      if head.key.equals(key)
        //replace existing value with new; Can be implemented alternatively
        head.value = value;
      head = head.next
    }
    arraySize ++;
    LinkedListNode newNode = new LinkedListNode();
    newNode.key = key;
    newNode.value = value;
    newNode.next = bucketArray[Index]
    bucketArray[Index] = newNode;
    
    //check for resize of array
    if (itemsInArray >= .7 * arraySize) 
      resize ()
  }
    
  private void resize {
    arraySize = arraySize * 2;
    LinkedListNode oldArray = bucketArray;
    bucketArray = LinkedListNode[arraySize];
    
    for (int i = 0; i < arraySize; i ++) {
      if (oldArray[i] != null){
        bucketArray[i].key = oldArray[i].key;
        bucketArray[i].value = oldArray[i].value;
        bucketArray[i] = oldArray[i];
        bucketArray[i].next = oldArray[i].next;
      }
    }
  }
}
