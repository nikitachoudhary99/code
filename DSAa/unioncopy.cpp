#include <iostream>
using namespace std;

void unionOfSortedArrays(int arr1[], int n1, int arr2[], int n2) {
    int i = 0, j = 0;
    
    // Traverse both arrays and print the union
    while (i < n1 && j < n2) {
        // If arr1[i] is smaller, print it and move i
        if (arr1[i] < arr2[j]) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                cout << arr1[i] << " ";
            }
            i++;
        }
        // If arr2[j] is smaller, print it and move j
        else if (arr1[i] > arr2[j]) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                cout << arr2[j] << " ";
            }
            j++;
        }
        // If both are equal, print one and move both pointers
        else {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                cout << arr1[i] << " ";
            }
            i++;
            j++;
        }
    }

    // Print remaining elements of arr1
    while (i < n1) {
        if (i == 0 || arr1[i] != arr1[i - 1]) {
            cout << arr1[i] << " ";
        }
        i++;
    }

    // Print remaining elements of arr2
    while (j < n2) {
        if (j == 0 || arr2[j] != arr2[j - 1]) {
            cout << arr2[j] << " ";
        }
        j++;
    }
}

int main() {
    int arr1[] = {1, 2, 4, 5, 6};
    int arr2[] = {2, 3, 5, 7};
    
    int n1 = sizeof(arr1) / sizeof(arr1[0]);
    int n2 = sizeof(arr2) / sizeof(arr2[0]);
    
    cout << "Union of the two sorted arrays: ";
    unionOfSortedArrays(arr1, n1, arr2, n2);
    cout << endl;
    
    return 0;
}
