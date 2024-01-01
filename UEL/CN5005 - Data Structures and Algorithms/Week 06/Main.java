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
    }
}