public class JaggedArray
{
    public static void main(String[] args)
    {
	int n = 1;
	int[][] array;

	for (int i = 0; i < 10; i++)
	{
	    array =  new int[10][i + 1];
	    for (int j = 0; j < i + 1; j++)
	    {
		array[i][j] = n++;
	    }

	    for (int j = 0; j < array[i].length; j++)
	    {                     
                 if (j == 0)
                 {
                     System.out.print(array[i][j]);
                 } else {
                     System.out.print(", " + array[i][j]);
                 }
	    }
	    System.out.println();
	}
    }
}
		
