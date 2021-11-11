public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    /*
        Specialfall för samtliga metoder
        1. Listan är tom
        2. Det finns EN node i listan
        3. Vi har mer än en node i listan
     */

    public void insertHead(int data) {
        if(head == null) {
            head = new Node(data);
            tail = head;
        }
        else {
            Node newNode = new Node(data);
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public void insertTail(int data) {
        if(tail == null) {
            tail = new Node(data);
            head = tail;
        }
        else {
            tail.setNext(new Node(data));
            tail = tail.getNext();
        }
        // When doing the actual insert
        size++;

    }

    public void insertAt(int index, int data) {
        // Är index större än size? Ge felmeddelande
        // Är index 0? Kalla på insertHead
        // Är index == size? Kalla på insertTail
        // Vi är mitt i listan!
    }

    public int removeHead() {
        // Is list empty?
        if(head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        // When doing the actual remove
        size--;
        // Only one node in the list
        if(head == tail) {
            int value = head.getData();
            head = null;
            tail = null;
            return value;
        }
        // There must be more than one node in the list
        int value = head.getData();
        head = head.getNext();
        return value;
    }

    public int removeTail() {
        if(tail == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        // When doing the actual remove
        size--;
        if(head == tail) {
            int value = tail.getData();
            head = null;
            tail = null;
            return value;
        }
        // Make sure that tmp points at the node just before tail
        int value = tail.getData();
        Node tmp = head;
        while(tmp.getNext() != tail) {
            tmp = tmp.getNext();
        }
        tail = tmp;
        tail.setNext(null);
        return value;

    }

    public int size() {
        return size;
    }

    public void printList() {
        // Print the list
        // Create tmp, so we have something that we can move through the list
        // Let tmp start from the head of the list
        Node tmp = head;
        // As long as tmp still points at a node
        while(tmp != null) {
            // Print the data in that node
            System.out.print(tmp.getData());
            // and move tmp to the next node
            // When we are at the tail node and move to the next, tmp will become null
            tmp = tmp.getNext();
            // If we have a next node, print an arrow
            if(tmp != null) {
                System.out.print(" -> ");
            }
            else { // If not, print something to indicate the end of the list
                System.out.println(" -|");
            }
        }

    }

}
