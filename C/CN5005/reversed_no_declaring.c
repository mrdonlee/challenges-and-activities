#include <stdio.h>

int main(void)
{
    float array = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0};
    int array_length = sizeof(array) / sizeof(int);

    for (int i = 0, j = array_length - 1; i != array_length / 2; i++)
    {
	tmp = array[i];
	array[i] = array[j];
	array[j] = tmp;
	j--;
    }

    for (int i = 0; i < array_length; i++)
    {
	print("%f ", array[i]);
    }
}
