public class Main {
    public static void main(String[] args) {
        SingleLinkedList forwardList = new SingleLinkedList();
        DoubleLinkedList list = new DoubleLinkedList();
        forwardList.AddNode(2);
        forwardList.AddNode(3);
        forwardList.AddNode(4);
        forwardList.AddNode(6);
        forwardList.AddNode(9);
        forwardList.PrintList();
        forwardList.Delete(3);
        System.out.println();
        forwardList.PrintList();
        forwardList.Delete(0);
        System.out.println();
        forwardList.PrintList();
        list.append(5);
        list.prepend(2);
        list.append(3);
        list.PrintList();
    }
}
