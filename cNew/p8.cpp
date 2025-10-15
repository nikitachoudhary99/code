//wap to check vowel or constant
#include<iostream>
using namespace std;
int main()
{
    char ch;
    cout<<"enter any character";
    cin>>ch;
    if(ch=='a'|| ch =='e'|| ch =='i' || ch =='o'|| ch =='u')
    {
        cout<<"its vowel";
    }
    else
    {
        cout<<"its constant";
    }
}