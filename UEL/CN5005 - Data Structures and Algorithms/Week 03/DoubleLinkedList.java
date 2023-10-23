public class DoubleLinkedList {
    Node head;
    Node tail;

    public void append(int num) {
        if (tail == null) {
            head = new Node(null, num, null);
            tail = head;
            return;
        } else {
            tail.next = new Node(tail, num, null);
            tail = tail.next;
        }
    }

    public void prepend(int num) {
        if (head == null) {
            head = new Node(null, num, null);
            tail = head;
            return;
        } else {
            head.prev = new Node(null, num, head);
            head = head.prev;
        }
    }

    public void PrintList() {
        Node now = head;
        /*
        for (int i = 0; now.next != null; i++) {
            System.out.print(" " + now.data);
            now = now.next;
        }
        */
        do {
            System.out.print(" " + now.data);
            now = now.next;
        } while (now != null);
        System.out.println();
    }
}
