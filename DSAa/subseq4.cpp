//subseq for 4  letter
#include<iostream>
using namespace std;
subseq(string &str,int i,string &temp)
{
    if(i==str.length())
    {
      cout<<temp<<endl;
      return;
    }
    temp=temp+str[i];
    subseq(str,i+1,temp);
    temp.pop_back();
    subseq(str,i+1,temp);
}
int main()
{
    string str="ABCD";
    string temp=" ";
    subseq(str,0,temp);
}