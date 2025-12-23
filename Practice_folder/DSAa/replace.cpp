//replace element o(n)
#include<iostream>
#include<vector>
using namespace std;
vector<int> replaceElement(vector<int> arr)
{
    vector<int> ans(arr.size());
    ans[ans.size()-1] = -1;
    int max = arr[arr.size()-1];

    for(int i=arr.size()-2;i>=0;i--)
    {
        ans[i] = max;
        if(arr[i]>max)
        {
            max = arr[i];
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