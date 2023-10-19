import java.util.Scanner;

public class SingleLinkedList {

    static Node head;
    Scanner sc = new Scanner(System.in);

    public void AddNode(int num) {
        if (head == null) {
            head = new Node(num, null);
            return;
        } else {
            Node tmp = new Node(num, null);
            tmp.next = head;
            head = tmp;
        }
    }

    public void GetValue(int index) {
        Node now = head;
        if (index <= 0) {
            System.out.println(head.data);
        } else {
            for (int i = 0; i < index; i++) {
                now = now.next;
            }
            System.out.println(now.data);
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
    }

    public void Delete(int index) {
        Node now = head;
        if (index == 0) {
            head = head.next;
        } else if (index == 1) {
            now.next = now.next.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                now = now.next;
            }
            now.next = now.next.next;
        }
    }

    public void AddElements(int number) {
        for (int i = 0; i < number; i++) {
            AddNode(sc.nextInt());
        }
    }
}
