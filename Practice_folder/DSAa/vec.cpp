//vectore
/*
  vectore is a dynamic arry that can grow and shrink in sizeas needed
  it is a container that can store element in contiguous memory allocation
  it adjust size during runtime
  common operation 
  -> push_back()
  ->pop_back()
  ->resize()
*/
#include<iostream>
#include<vector>
using namespace std;
int main()
{
    vector<int> vec;
    vec.push_back(5);
    vec.push_back(6);
    vec.push_back(8);
    vec.push_back(10);
    cout<<"vector element"<<endl;
    for(int i=0;i<vec.size();i++)
    {
        cout<<vec[i]<<" ";
    }
    cout<<endl;

    vec.pop_back();
    cout<<"after pop vecter element"<<endl;
    for(int i=0;i<vec.size();i++)
    {
        cout<<vec[i]<<" ";
    }
    cout<<endl;
}