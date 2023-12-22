import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={93,42,51,3,455,20,5,100,5487,87,96,21};

        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] array) {
        int minID;
        int min;

        for (int i = 0; i < array.length - 1; i++) {
            minID = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minID]) {
                    minID = j;
                }
            }
            min = array[minID];
            array[minID] = array[i];
            array[i] = min;
        }
        return array;
    }
}
