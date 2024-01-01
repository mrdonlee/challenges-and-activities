public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9};

        search(9, arr, 0, arr.length);
    }

    static void search(int n, int[] array, int start, int end) {
        int mid = (end + start) / 2;

        if (array[mid] == n && mid != 0) {
            System.out.println(mid);
        } else if (array[mid] > n){
            search(n, array, start, mid);
        } else {
            search(n, array, mid, end);
        }
    }
}
