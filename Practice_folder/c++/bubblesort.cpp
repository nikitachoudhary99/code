
#include<iostream>
using namespace std;

void bubblesort(int arr[], int size)
{
    int i, j, temp;
    for(i = 0; i < size - 1; i++)  // Outer loop to run size-1 times
    {
        for(j = 0; j < size - i - 1; j++)  // Inner loop to compare adjacent elements
        {
            if(arr[j] > arr[j + 1])  // Compare for ascending order
            {
                temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

int main()
{
    int arr[8] = {1, 2, 3, 4, 5, 6, 7, 8};
    int size = 8;
    int i;

    cout << "Array before sorting:"<<endl;;
    for(i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;

    bubblesort(arr, size);  // Call the bubble sort function

    cout << "Array after sorting:" << endl;
    for(i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}