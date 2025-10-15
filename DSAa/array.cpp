#include<iostream>
using namespace std;

void insertEle(int arr[], int& n, int ele, int index) 
{
    n++;  // Increase the size of the array after insertion
    // Shift elements to the right to make space for the new element
    for (int i = n - 1; i >= index; i--)
    {
        arr[i] = arr[i - 1];
    }
    arr[index - 1] = ele; // Insert the element at the specified index
}

int findEle(int arr[], int n, int key)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == key) // Use '==' for comparison
            return i; 
    }
    return -1; // Element not found
}

void deletionArr(int arr[], int& n, int key)
{
    int index = findEle(arr, n, key);
    if (index == -1)
    {
        cout << "Element not found" << endl;
        return;
    }

    // Shift elements to the left to delete the element
    for (int i = index; i < n - 1; i++)
    {
        arr[i] = arr[i + 1];
    }
    n--;  // Reduce the size of the array after deletion
}

int main()
{
    int arr[100] = {0};
    int i, ele, index, n = 10, key;

    // Initialize the array
    for (i = 0; i < n; i++)
        arr[i] = i + 1;

    // Print the initial array
    for (i = 0; i < n; i++)
        cout << arr[i] << "\t";
    cout << endl;

    // Insertion example
    ele = 50;
    index = 6;
    insertEle(arr, n, ele, index);  // Pass n by reference
    
    // Print array after insertion
    for (i = 0; i < n; i++)
        cout << arr[i] << "\t";
    cout << endl;

    // Deletion example
    key = 5;
    deletionArr(arr, n, key); // Pass n by reference

    // Print array after deletion
    for (i = 0; i < n; i++)
        cout << arr[i] << "\t";
    cout << endl;

    return 0;
}
