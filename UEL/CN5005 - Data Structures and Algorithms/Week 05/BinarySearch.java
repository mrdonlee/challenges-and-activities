public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9};

        search(8, arr);
    }

    static int search(int n, int[] array) {
        int mid = array.length / 2;

        if (array[mid] == n) {
            return mid;
        }
        return n;
    }
}
