#include<iostream>
#include<vector>
#include<stack>
using namespace std;

vector<int>replaceelement(vector<int>&arr)
{
    int n=arr.size();//array ki size ko n se declare
    vector<int>ans(n);  //ans me n ko preametr
    stack<int>s;  //stack ko s se intialize kr diya
    ans[n-1]=-1;
    s.push(arr[n-1]);//push function ki help se array k last index
     //reverse loop chlaya

    for(int i=n-2;i>=0;i--)
    {
        ans[i]=s.top();//current maximum value ko top m store krvaya
        if(arr[i]>s.top())
        {
            s.push(arr[i]);
        }

    }
  return ans;
}
int main()   
{
    vector<int>arr={15,62,42,85,75,96};
    vector<int>ans=replaceelement(arr);

    for(int i=0;i<ans.size();i++)
    {
        cout<<ans[i]<<"\t";
    }
    return 0;
}
