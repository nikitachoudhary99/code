#include<iostream>
using namespace std;

#define ROW 3
#define COLS 3


void print2DArray(int arr[ROW][COLS], int row, int col) {

    if (row == ROW) {
        return;
    }
    if (col == COLS) {
        cout << endl;
        print2DArray(arr, row + 1, 0);  
        return;
    }
    cout << arr[row][col] << " ";

    
    print2DArray(arr, row, col + 1);
}

int main() {

    int arr[ROW][COLS] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    
    print2DArray(arr, 0, 0);

    return 0;
}
