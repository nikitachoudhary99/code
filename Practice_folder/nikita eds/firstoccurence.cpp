#include<iostream>
#include<vector>
using namespace std;
int binary(vector<int> &nums,int k)
{
    int s = 0;
    int e = nums.size()-1;
    int index = -1;

    while(s<=e)
    {
        int mid = (s+e)/2;
        if(nums[mid]==k)
        {
            index = mid;
            e = mid-1;
        }
        else if(nums[mid]<k)
        {
          s = mid+1;
        }
        else
        {
            e = mid-1;
        }
    }
    return index;
}
int main()
{
    vector<int> nums = {1,2,2,2,2,3,4,5,6};

    int k;
    cout<<"enter the element to find: ";
    cin>>k;

    int index = binary(nums,k);

    if(index!=-1)
    {
        cout<<"First occurence of "<<k<<" is at index "<<index<<endl;
    }
    else
    {
        cout<<k<<"not found in the array "<<endl;
    }
    return 0;
}