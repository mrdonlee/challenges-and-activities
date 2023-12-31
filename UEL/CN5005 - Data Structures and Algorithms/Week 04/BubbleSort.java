import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 33, 28, 5, 63, 224, 6978, 96, 57};

        System.out.println(Arrays.toString(sort(array)));
    }

    static int[] sort(int[] array) {
        int tmp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
