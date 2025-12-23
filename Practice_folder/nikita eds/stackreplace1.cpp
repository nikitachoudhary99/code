//replace element in stack order of n square 
#include<iostream>
#include<vector>
#include<stack>
using namespace std;
vector<int> replaceelement(vector<int> &arr)
{
    int s = arr.size();
    vector<int> ans(s,-1);
    //ans[ans.size()-1] = -1;
    stack<int> st;
    for(int i=0;i<s-1;i++)
    {
        int max = -1;
        for(int j=i+1;j<s;j++)
        {
           if(arr[j]>max)
           {
            max = arr[j];
           }
        }
        st.push(max);
    }
    ans[s-1] = -1;
    for(int i=s-2;i>=0;i--)
    {
        ans[i] = st.top();
        st.pop();
    }
    return ans;
}
int main()
{
    vector<int> arr = {17,18,9,4,6,1,5};
    vector<int> ans = replaceelement(arr);

    for(int i=0;i<ans.size();i++)
  {
    cout<<ans[i]<<"\t";
  }
  return 0;
}