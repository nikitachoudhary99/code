//next greater element
#include<iostream>
#include<vector>
#include<stack>
using namespace std;
vector<int> nextgreater(vector<int> arr)
{
int s = arr.size();
vector<int> ans(s);
stack<int> st;
ans[s-1] = -1;
st.push(arr[s-1]);
for(int i=s-2;i>=0;i--)
{
    while(st.empty()!=true)
    {
        if(arr[i]>=st.top())
        {
          st.pop();
        }
        else
        {
            ans[i] = st.top();
            st.push(arr[i]);
            break;
        }
    }
    if(st.empty()==true)
    {
        ans[i] = -1;
        st.push(arr[i]);
    }
}
return ans;
}
int main()
{
    vector<int> arr = {6,18,5,4,11,7,10,13};
    vector<int> ans = nextgreater(arr);

    for(int i=0;i<arr.size();i++)
    {
        cout<<ans[i]<<"\t";
    }
}

