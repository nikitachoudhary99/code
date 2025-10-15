//replace element o(n*n)
#include<iostream>
#include<vector>
using namespace std;
vector<int> ans(vector<int> input)
{
    vector<int> result(input.size(),-1);
    for(int i=0;i<input.size();i++)
    {
        int max = -1;
        for(int j=i+1;j<input.size();j++)
        {
           if(input[j]>max)
           {
            max = input[j];
           }
        }
        result[i] = max;
    }
    return result;
}
int main()
{
vector<int> arr = {17,18,9,4,6,1,5};
vector<int> result = ans(arr);

for(int i=0;i<result.size();i++)
{
 cout<<result[i]<<"\t";   
}
cout<<endl;
}