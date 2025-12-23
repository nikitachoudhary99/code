//even array
#include<iostream>
using namespace std;
int main()
{ 
    int arr[5]={5,6,8,7,9};
    int size=5;
    for(int i=0;i<size;i++)
      {
        if(arr[i]%2==0)
          { 
            cout<<"even number"<<arr[i]<<endl;
          }
         else
            {  
              cout<<"odd"<<arr[i]<<endl;
            }
       }
}