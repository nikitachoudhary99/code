//backtracking 
#include<iostream>
using namespace std;
void subseq(string &str,int i,string &temp)
{ if(i==str.length())
{
    cout<<temp<<" ";
    return;
}
   temp=temp+str[i];
   subseq(str,i+1,temp);
   temp.pop_back();
   subseq(str,i+1,temp);
}
int main()
{
    string str="ABC";
    string temp=" ";
    subseq(str,0,temp);
}