public class ReversedNoDeclaring
{
    public static void main(String[] args) {
        double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0, 2.6};

        double n;
        for (int i = myArray.length - 1, j = 0; i != myArray.length / 2; i--) {
            n = myArray[j];
            myArray[j] = myArray[i];
            myArray[i] = n;
            j++;
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
