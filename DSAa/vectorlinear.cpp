#include<iostream>
#include<vector>
using namespace std;
bool linearsearch(vector<int> &nums,int k)
{
 for(int i=0;i<nums.size();i++)
 {
    nums[i]++;
 }
 cout<<"linear search ke under"<<endl;

 for(int i =0;i<nums.size();i++)
 {
    cout<<nums[i]<<" ";
 }
 return true;
}
int main()
{
    vector<int> nums = {9,8,7,6,5,4};
    int k;
    cout<<"enter elemnt\n";
    cin>>k;

    cout<<"main ke under"<<endl;
    for(int i=0;i<nums.size();i++)
    {
     cout<<nums[i]<<" ";
    }
    cout<<endl;
    
    bool ans = linearsearch(nums,k);
    cout<<endl;

    cout<<"main ke under"<<endl;
    for(int i=0;i<nums.size();i++)
    {
        cout<<nums[i]<<" ";
    }
    cout<<endl;
}
