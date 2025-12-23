//size and capacity
#include<iostream>
#include<vector>
using namespace std;
int main()
{
    vector<int> arr;
    arr.push_back(22);
    int s = arr.size();

    cout<<"size = "<<s<<endl;

    int c = arr.capacity();
    cout<<"capacity = "<<c<<endl;

    arr.push_back(23);
     s = arr.size();
    cout<<"size = "<<s<<endl;

     c = arr.capacity();
    cout<<"capacity = "<<c<<endl;

    arr.push_back(24);
    s = arr.size();
   cout<<"size = "<<s<<endl;

   c = arr.capacity();
   cout<<"capacity = "<<c<<endl;

   arr.push_back(25);
    s = arr.size();
   cout<<"size = "<<s<<endl;

   c = arr.capacity();
   cout<<"capacity = "<<c<<endl;

   arr.push_back(26);
   s = arr.size();
   cout<<"size = "<<s<<endl;

   c = arr.capacity();
   cout<<"capacity = "<<c<<endl;





}