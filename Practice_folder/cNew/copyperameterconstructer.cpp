//copy parametr constrocter
#include<iostream>
using namespace std;
class Bank
{
    int amount;
    string name;
    public:
    Bank(int a, string n)
    {
        cout<<"parameter conctructor invoked"<<endl;
        name="samaira";
        cout<<"name"<<name<<endl;
        amount=500;
        cout<<"amount="<<amount<<endl;
    }
    Bank(Bank &obj1)
    {
        cout<<"copy constructor invoked"<<endl;
        amount=obj1.amount;
        cout<<"Amount="<<amount<<endl;
        name=obj1.name;
        cout<<"name="<<name<<endl;
    }
};
main()
{
    
    int a;
    string n;
    cout<<"enter amount="<<a<<endl;
    cout<<"enter name="<<n<<endl;
    Bank obj(a,n);
    Bank obj1(obj);
}