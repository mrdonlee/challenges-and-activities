public class Test {
    public static void main(String[] args) {

	int[] mear = {2, 3, 4, 5, 6};
	System.out.println(add(5, 6));
	System.out.println(average(mear));
    }

    static int add(int num1, int num2) {
	return num1 + num2;
    }

    static int sub(int num1, int num2) {
	return num1 - num2;
    }

    static int average(int[] array) {

	int sum = 0;
	for (int i = 0; i < array.length; i++) {
	    sum += array[i];
	}

	return sum / array.length;
    }
}
