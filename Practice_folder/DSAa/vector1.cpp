#include<iostream>
#include<vector>
using namespace std;
int main()
{
    int n;
    cout<<"Enter the no of element"<<endl;
    cin>>n;
    vector<int> arr;

    for(int i=0;i<n;i++)
    {
        cout<<"enter element"<<endl;
        int input;
        cin>>input;

        arr.push_back(input);
    }
    

}