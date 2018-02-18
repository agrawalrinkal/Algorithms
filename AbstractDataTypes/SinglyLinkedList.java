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

class linkedList {
  protected Node start;
  protected Node end;
  protected int size;

  // Constructor for linkedList
  public linkedList() {
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
    System.out.print(tracker.getData());
  }
}

public class SinglyLinkedList {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    linkedList list = new linkedList();
    System.out.println("Singly Linked LIst TEST");
    char ch;

    do {
      System.out.println("\nSingly Linked List Operations\n");
      System.out.println("1. insert at begining");
      System.out.println("2. insert at end");
      System.out.println("3. insert at position");
      System.out.println("4. delete at position");
      System.out.println("5. check empty");
      System.out.println("6. get size");
      int choice = scan.nextInt();

      switch(choice) {
        case 1 :
            System.out.println("Enter integer element to insert");
            list.insertAtStart( scan.nextInt() );
            break;
        case 2 :
            System.out.println("Enter integer element to insert");
            list.insertAtEnd( scan.nextInt() );
            break;
        case 3 :
            System.out.println("Enter integer element to insert");
            int num = scan.nextInt() ;
            System.out.println("Enter position");
            int pos = scan.nextInt() ;
            if (pos <= 0 || pos > list.getSize() )
                System.out.println("Invalid position\n");
            else
                list.insertAtPos(num, pos);
            break;
        case 4 :
            System.out.println("Enter position");
            int p = scan.nextInt() ;
            if (p < 1 || p > list.getSize() )
                System.out.println("Invalid position\n");
            else
                list.deleteAtPos(p);
            break;
        case 5 :
            System.out.println("Empty status = "+ list.isEmpty());
            break;
        case 6 :
            System.out.println("Size = "+ list.getSize() +" \n");
            break;
         default :
            System.out.println("Wrong Entry \n ");
            break;
      }
      list.display();
      System.out.println("\nDo you want to continue (Type y or n) \n");
      ch = scan.next().charAt(0);
    } while (ch == 'Y' || ch == 'y');
  }
}
