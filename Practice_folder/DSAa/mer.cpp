#include<iostream>
using namespace std;

void merge(int arr[], int s, int mid, int e) {
    int temp[e + 1]; // Temporary array to store merged result
    int i = s; // Starting index for the left subarray
    int j = mid + 1; // Starting index for the right subarray
    int k = 0;

    // Merge the two subarrays into the temp array
    while (i <= mid && j <= e) {
        if (arr[i] <= arr[j]) {
            temp[k] = arr[i];
            i++;
        } else {
            temp[k] = arr[j];
            j++;
        }
        k++;
    }

    // Copy the remaining elements of the left subarray
    while (i <= mid) {
        temp[k] = arr[i];
        i++;
        k++;
    }

    // Copy the remaining elements of the right subarray
    while (j <= e) {
        temp[k] = arr[j];
        j++;
        k++;
    }

    // Copy the merged elements from temp array back to the original array
    for (int i = 0; i < k; i++) {
        arr[s + i] = temp[i];
    }
}

void mergesort(int arr[], int s, int e) {
    if (s >= e) {
        return; // Base case: single element or invalid range
    }
    
    int mid = (s + e) / 2; // Find the middle index
    mergesort(arr, s, mid); // Recursively sort the left half
    mergesort(arr, mid + 1, e); // Recursively sort the right half
    merge(arr, s, mid, e); // Merge the two sorted halves
}

int main() {
    int arr[10] = {2, 3, 4, 9, 8, 7, 6, 8, 6, 7};
    int size = 10;

    cout << "Array before sort:" << endl;
    for (int i = 0; i < size; i++) {
        cout << arr[i] << "\t";
    }
    cout << endl;

    mergesort(arr, 0, size - 1); // Perform merge sort

    cout << "Array after sort:" << endl;
    for (int i = 0; i < size; i++) {
        cout << arr[i] << "\t";
    }
    cout << endl;

    return 0;
}
