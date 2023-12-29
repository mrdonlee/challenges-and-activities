public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };


    }

    public static void sort(int[] array, int start, int end) {
        int mid = (end + start) / 2;

        if (mid != 0) {

            sort(array, start, mid);
            sort(array, mid, end);
        }
    }

    public static void merge(int[] array, int num1, int num2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int tmp;

        if (array[i] > array[j]) {
           tmp = array[k];
           array[k++] = array[j];
        } else {

        }
    }
}