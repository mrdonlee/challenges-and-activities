public class ReversedByDeclaring
{
    public static void main(String[] args)
    {
	double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0};
	double[] newArray = new double[myArray.length];

	int n = 0;
	for (int i = myArray.length - 1; i >= 0; i--)
	{
	    newArray[n] = myArray[i];
	    n++;
	}

	for (int i = 0; i < newArray.length; i++)
	{
	    System.out.println(newArray[i]);
	}
    }
}
