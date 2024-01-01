public class IntStack {
    int[] array;
    int cap, top;

    IntStack(int size) {
        array = new int[size];
        cap = size;
        top = -1;
    }

    public void push(int num) {
        array[++top] = num;
    }

    public void pop() {
        array[top--] = 0;
    }

    public void peek() {
        System.out.println(array[top]);
    }

    public void size() {
        System.out.println(top + 1);
        }
}