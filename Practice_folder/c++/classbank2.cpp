//parametraized constructor
#include<iostream>
using namespace std;
class Bank
{ 
    int amount;
    string name;
    public:
    Bank(int a,string n)
    {
        cout<<"para constructor invoked"<<endl;
        amount =a;
        name=n;
        cout<<"name="<<name<<endl;
        cout<<"amount="<<amount<<endl;
    }
};
int main()
{
    
    int a;
    string n;
    cout<<"enter your amount"<<endl;
    cin>>a;
    cout<<"enter your name"<<endl;
    cin>>n;
    Bank obj(a,n);


    
}