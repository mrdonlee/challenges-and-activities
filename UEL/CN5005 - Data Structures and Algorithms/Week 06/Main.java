public class Main {
    public static void main(String[] args) {
        Stack friends = new Stack(5);

        friends.push("Nid");
        friends.push("Dhruvit");
        friends.push("Sagar");
        friends.display();
        friends.pop();
        friends.pop();
        friends.display();

        IntStack numbers = new IntStack(5);

        numbers.push(1);
        numbers.push(2);
        numbers.push(8);
        numbers.push(10);
        numbers.peek();
        numbers.size();
        numbers.pop();
        numbers.peek();
        numbers.size();
    }
}