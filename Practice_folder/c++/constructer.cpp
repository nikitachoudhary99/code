//constractor 
#include<iostream>
using namespace std;
class bank
{
    int amount;
    public:
    //default constructor
    bank()
    {
        cout<<"default constructor invoked"<<endl;
        amount=1000;
        cout<<"Amount="<<amount<<endl;
    }
    //partameterized construstor

    bank(int a)
    {
        cout<<"para constructor invoked"<<endl;
        amount=a;
        cout<<"Amount"<<amount<<endl;
    }
};

int main()
{
    bank obj;
    int a;
    
    cout<<"enter amount"<<endl;
    cin>>a;
    bank obj1(a);

}