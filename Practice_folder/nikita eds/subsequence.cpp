//backtracking subsequence
#include<iostream>
using namespace std;
void subsequence(string &str,int i,string &temp)
{
    if(i==str.length())
    {
        cout<<temp<<endl;
        return;
    }

    temp = temp + str[i];
    subsequence(str,i+1,temp);

    temp.pop_back();
    subsequence(str,i+1,temp);
}
int main()
{
  string str = "ABCD";
  string temp = " ";

  subsequence(str,0,temp);
}