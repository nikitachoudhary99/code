//vector from call by refrance
#include<iostream>
#include<vector>
using namespace std;
bool linearsearch(vector<int> &nums,int k)
{
    for(int i=0;i<nums.size();i++)
    {
        nums[i]++;
    }
    for(int i=0;i<nums.size();i++)
    {
        cout<<nums[i]<<" ";
    }
    return true;
}
int main()
{
    vector<int>nums={5,3,9,78,56,45};
    int k;
    cout<<"in main  element\n"<<endl;
    cin>>k;
    
    for(int i=0;i<nums.size();i++)
    {
        cout<<nums[i]<<" ";
     }

    bool ans=linearsearch(nums,k);
    
    for(int i=0;i<nums.size();i++)
    {
        cout<<nums[i]<<" ";
    }
}