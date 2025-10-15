#include<iostream>
#include<vector>
using namespace std;
int main()
{
 int x;
//vector<T> vector-name;

 vector<int> arr = {12,13,14};
 cout<<arr[0]<<endl;

 for(int i=0;i<=2;i++)
 {
    cout<<arr[i]<<endl;
 }  
 int store = arr.size();

 cout<<"size "<<store<<endl;
}