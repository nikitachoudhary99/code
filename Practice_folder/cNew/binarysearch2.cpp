/*     searching an array
    1> linear search->>go to each index search for the element
                       it take more time
                       array can be in any order 
    2> binary search -->>to apply binary search arry must be shorted order
                         it take less time then linner search       

*/
//binary
#include<iostream>
using namespace std;
int main()
{   
    int arr[6]={1,2,3,4,5,6};
    int size=6;
    int k;
    int start=0;
    int end=size-1;
    
    cout<<"enter the value you want to found"<<endl;
    cin>>k;
    while(start<=end)
    {
        int middle=start+end/2;
        if(k == arr[middle])
        {
            return true;
        }
        else if(k<arr[middle])
        {
            end=middle-1;
        }
        else
        {
            start=middle+1;
        }
    }
    
    if(arr==k)
    {
        cout<<"element found"<<endl;
    }
    else
    {
        cout<<"element not found"<<endl;
    }
   return 0;
        
}