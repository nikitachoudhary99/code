//copy constructor
#include<iostream>
using namespace std;
class Bank
{
    int amount;
    string name;
    public:
    Bank()//default constructor
    {
        cout<<"default constructor invoked"<<endl;
        name="samaira";
        cout<<"name"<<name<<endl;
        amount=100;
        cout<<"amount="<<amount<<endl;
    }
};
main()
{
    Bank obj;
}