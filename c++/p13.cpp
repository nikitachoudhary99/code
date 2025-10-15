//determine if a if a character is uppercase or lowercase
#include<iostream>
using namespace std;
int main()
{
    char ch;
    cout<<"enter any character";
    cin>>ch;
    if(ch=='A' || ch=='Z')
    cout<<"charecter is uppercase";
    else
    {
        cout<<"character is lowercase";
    }
}