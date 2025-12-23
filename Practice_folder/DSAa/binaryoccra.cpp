//binary search for occarent 
#include<iostream>
#include<vector>
using namespace std;
int binary(vector <int> &nums ,int target)
{
 int s=0;
 int e= nums.size()-1;
 int index=-1;

 while(s<=e)
 {
    int mid=(s+e)/2;
    if(nums[mid]==target)
    {
        return mid;
        e=mid-1;
    }
    else if(nums[mid]<target)
    {
        s=mid+1;
        index=mid;
    }
    else
    {
        e=mid-1;
        
    }
 }
 //if(nums[index]<target)
 //{
   // return  ;

 //}
 return index;
}
int main()
{
    vector<int>nums={2,3,5,8,5,4,8,9,3,2,7};
    int target;
    cout<<" enter the element you want to search"<<endl;
    cin>>target;
     int index =binary(nums,target);

     if(index !=-1)
    {
        cout<<"first occarents"<<target<<"is at index "<< index  <<endl;;
    }
    else
    {
        cout<<target<<"not found in the array"<<   endl;;
    }
    return 0;
}

                    