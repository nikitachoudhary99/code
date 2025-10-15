//default copy constructor
#include<iostream>
using namespace std;
class Bank
{
int amount;
string name;
public:
Bank()
{
    cout<<"default constructor invoked"<<endl;
    cout<<"enter amount"<<endl;
    cin>>amount;
    cout<<"enter name"<<endl;
    cin>>name;
}
Bank(Bank &obj1)
{
    cout<<"copy constructor invoked"<<endl;
    amount=obj1.amount;
    name=obj1.name;
   cout<<"amount="<<amount<<endl;

   cout<<"name="<<name<<endl; 
}
};
int main()
{
    Bank obj1;
    Bank obj2(obj1);
} 