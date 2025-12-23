//replace element in vector by using template
#include<iostream>
#include<vector>
using namespace std;
vector<int>replaceelement(vector<int>arr)
{
    vector<int>ans(arr.size());
    ans[ans.size()-1]=-1;
    int max=arr[arr.size()-1];
     
     for(int i=arr.size()-2;i>=0;i--)
     {
        ans[i]=max;
        if(arr[i]>max)
        {
            max=arr[i];
        }
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