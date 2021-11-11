public class MyLinkedList {
    private Node head;
    private Node tail;

    /*
        Specialfall för samtliga metoder
        1. Listan är tom
        2. Det finns EN node i listan
        3. Vi har mer än en node i listan
     */

    public void insertHead(int data) {

    }

    public void insertTail(int data) {

    }

    public int removeHead() {
        return 0;
    }

    public int removeTail() {
        return 0;
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
