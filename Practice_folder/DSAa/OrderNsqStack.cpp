//ordr of nsquare
#include<iostream>
#include<vector>
#include<stack>
using namespace std;
 vector<int> replaceelement(vector<int>&arr)
{

vector<int> ans(arr.size()); 
ans[ans.size()-1];
for(int i=0;i<arr.size();i++)
{
    int max=-1;
    for(int j=i+1;j<arr.size();j++)
    {
        if(arr[j]>max)
        {
            max=arr[j];
        }
            
    }
    ans[i]=max;
    }
    return ans;
} 
int main()
{
     vector<int>arr={15,62,45,85,75,96};
    vector<int>ans=replaceelement(arr);
    for(int i=0;i<ans.size();i++)
    {
        cout<<ans[i]<<"\t";
    }
}

