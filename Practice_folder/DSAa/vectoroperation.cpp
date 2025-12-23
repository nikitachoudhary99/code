//basic vector operation
//access element
#include<bits/stdc++.h>
using namespace std;
int main()
{
    vector<char> ch={'a','b','d','h'};

    cout<<ch[3];
    cout<<ch.at(2);
    vector<char> ch1={'n','m'};
    cout<<ch[2];
    cout<<ch.at(1);
    for(int i=0;i<ch.size();i++)
    cout<<ch[i]<<ch1[i];

    return 0;

}
