public class SinglyLinkedList{ 
//prepend, append, delete
  public class Node {
    Object value;
    Node head;
    Node tail;
    Node next;
  }
  Node head;
  Node tail;
  //constructor
  public Node(value) {
    v = value;
  }
  
  private void prepend(Object v){
    Node tmp = head ;
    Node newNode = new Node(v);
    if (head != null) {
      newNode.next = head;
      head = newNode;
    } else { //empty linkedlist
      head = tail = newNode;
    }
  }
  
  private void delete(Object v){
    Node tmp = head;
    Node prev = null;
    while (tmp != null) {
      if tmp.value.equals(v)
        break; // found node to delete
      prev = tmp;
      tmp = tmp.next;
    }
    if (prev != null) {
      prev.next = tmp.next
    } else {
      head = tmp.next;
    }
  }
  
  //TODO append
}
