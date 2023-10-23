public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        /*
        list.AddNode(2);
        list.AddNode(3);
        list.AddNode(4);
        list.AddNode(6);
        list.AddNode(9);
        list.PrintList();
        list.Delete(3);
        System.out.println();
        list.PrintList();
        list.Delete(0);
        System.out.println();
        list.PrintList();
         */
        list.append(5);
        list.prepend(2);
        list.append(3);
        list.PrintList();
    }
}
