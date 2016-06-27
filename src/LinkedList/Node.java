package src.LinkedList;

/**
 * Created by liyangzhang on 2016-06-26.
 */
public class Node {

    public int data;
    public Node next;

    public Node() {
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
    }

    public Node insertToHead(Node head, int x) {
        Node newHead = new Node();
        newHead.data = x;
        newHead.next= head;
        return newHead;
    }

    public void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("nothing");
        }
        else {
            while (head.next != null) {
                System.out.println(head.data);
                head = head.next;
            }
            System.out.println(head.data);
        }
    }

    public Node append(Node n, Node head) {
        Node header = head;
        if (head == null) {
            return n;
        }

        while (head.next != null) {
            head = head.next;
        }
        head.next = n;
        return header;
    }

    public Node InsertNth(Node head, int data, int position) {
        Node newNode = new Node();
        Node header = head;

        // scenario when head is null
        if ( head == null) {
            newNode.data = data;
            return newNode;
        }

        newNode.data = data;
        // scenario when we want to insert in the first element on the list
        if (position == 0) {
            newNode.next = head;
            header = newNode;
            return header;
        }

        // insert somewhere else
        // should stop the element before the position to keep track of next element and assign new element
        for (int i=1; i < position && head.next !=null; i++) {
            head = head.next;
        }
        if (head.next != null) {
            newNode.next =  head.next;
            head.next = newNode;
        } else {
            head.next = newNode;
        }
        return header;
    }

}
