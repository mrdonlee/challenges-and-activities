public class Stack {
    String[] array;
    int top, cap;

    Stack (int size) {
        array = new String[size];
        cap = size;
        top = 0;
    }

    public void push (String name){
        array[top++] = name;
    }

    public void pop() {
        array[--top] = null;
    }

    public void display() {
        for (int i = 0; i < cap; i++) {
            System.out.println(array[i]);
        }
    }
}