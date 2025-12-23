#include<iostream>
#include<vector>
using namespace std;

int main()
{
    
    vector<int> input = {1, 5, 6, 8, 9, 4, 5};


    for (int i = 0; i < input.size(); i++) {
        cout << input[i] << endl;
    }

    
    vector<int> ans(input.size(), -1);

    
    for (int i = 0; i < input.size(); i++) {
        int max = -1; 
        for (int j = i + 1; j < input.size(); j++) {
            if (input[j] > max) {  
                max = input[j];
            }
        }
        ans[i] = max;
    }

    
    cout << "Next greater elements for each position in input:" << endl;
    for (int i = 0; i < ans.size(); i++) {
        cout << ans[i] << " ";  
    }
    cout << endl;

    return 0;
}
