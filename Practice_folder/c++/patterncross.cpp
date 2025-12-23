//cross *
#include<iostream>
using namespace std;
int main ()
{
    int i,j,n;
    cout<<"enter n"<<endl;
    cin>>n;
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n;j++)
      {
        if(i==j||i==n-j+1)
         {
            cout<<"*";
         }
         else
         {
            cout<<" ";
         }
      }
      cout<<endl;
    }
}