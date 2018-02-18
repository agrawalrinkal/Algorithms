import java.util.Scanner;

class Node {
  protected int data;
  protected Node next;

  // Null constructor
  public Node() {
    data = 0;
    next = null;
  }

  // Parametarized constructor
  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  // Sets the address of next node
  public void setNext(Node next) {
    this.next = next;
  }

  // Sets the data of a new Node
  public void setData(int data) {
    this.data = data;
  }

  // Returns the next node
  public Node getNext() {
    return this.next;
  }

  // Returns the data of a Node;
  public int getData() {
    return this.data;
  }

}

class linkList {
  protected Node start;
  protected Node end;
  protected int size;

  // Constructor for linkedList
  public linkList() {
    start = null;
    end = null;
    size = 0;
  }

  // Returns true of linked list is empty, false otherwise
  public boolean isEmpty() {
    return start == null;
  }

  // Returns the size of the linked list
  public int getSize() {
    return size;
  }

  // Inserts the Node the start of the linked list
  public void insertAtStart(int data) {
    Node newNode = new Node(data, null);
    size++;
    if(start == null) {
      start = newNode;
      end = start;
    } else {
      newNode.setNext(start);
      start = newNode;
    }
  }

  // Inserts the node at the end of the linked list
  public void insertAtEnd(int data) {
    Node newNode = new Node(data, null);
    size++;
    if(start == null) {
      start = newNode;
      end = start;
    } else {
      end.setNext(newNode);
      end = newNode;
    }
  }

  // Inserts the Node at the given position
  public void insertAtPos(int data, int pos) {
    if (pos == 1) {
      this.insertAtStart(data);
      return ;
    }
    Node newNode = new Node(data, null);
    Node tracker = start;
    pos = pos - 1;
    for(int i = 1; i < size; i++) {
      if(i == pos) {
        Node tmp = tracker.getNext();
        tracker.setNext(newNode);
        newNode.setNext(tmp);
        break;
      }
      tracker = tracker.getNext();
    }
    size++;
  }

  // Deletes the Node at the given position
  public void deleteAtPos(int pos) {
    if (pos == 1) {
      start = start.getNext();
      size--;
      return ;
    }
    if (pos == size) {
      Node s = start;
      Node t = start;
      while( s != end) {
        t = s;
        s = s.getNext();
      }
      end = t;
      end.setNext(null);
      size--;
      return ;
    }
    Node tracker = start;
    pos = pos - 1;
    for(int  i = 1; i < size - 1; i++) {
      if(i == pos) {
        Node tmp = tracker.getNext();
        tmp = tmp.getNext();
        tracker.setNext(tmp);
        break;
      }
      tracker = tracker.getNext();
    }
    size--;
  }

  // Displays the entire linked list
  public void display() {
    System.out.print("Singly Linked List: ");
    if(size == 0) {
      System.out.print("empty");
      return ;
    }
    if(start.getNext() == null) {
      System.out.print(start.getData());
      return ;
    }
    Node tracker = start;
    System.out.print(start.getData() + "->");
    tracker = start.getNext();
    while(tracker.getNext() != null) {
      System.out.print(tracker.getData() + "->");
      tracker = tracker.getNext();
    }
    System.out.println(tracker.getData());
  }
}
