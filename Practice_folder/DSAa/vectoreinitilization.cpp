//initilization using intializer list
#include<bits/stdc++.h>
using namespace std;
void printv(vector<int> &v)
{
    for(int i=0;i<v.size();i++)
    cout<<v[i]<<" ";

}
int main()
{
    vector<int> a;
    vector<int> b={5,6,9,2};
    vector<int> c={5,8,6};
    printv(a);
    printv(b);
    printv(c);
}