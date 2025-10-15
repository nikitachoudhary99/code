//replace element o(n)
#include<iostream>
#include<vector>
#include<stack>
using namespace std;
vector<int> replaceElement(vector<int> &arr)
{
    int n = arr.size();
    vector<int>ans(n);
    stack<int>s;
    ans[n-1] = -1;
    s.push(arr[n-1]);

    for(int i=n-2;i>=0;i--)
    {
        ans[i] = s.top();
        if(arr[i]>s.top())
        {
            s.push(arr[i]);
        }
    }
    return ans;
}
int main()
{
    vector<int> arr = {17,18,9,4,6,1,5};
    vector<int> ans = replaceElement(arr);

    for(int i=0;i<ans.size();i++)
    {
        cout<<ans[i]<<"\t";
    }
}