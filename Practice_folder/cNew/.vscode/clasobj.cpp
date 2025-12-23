//creating an obj
#include<iostream>
using namespace std;
class Employee
{
  public:
 string name;
 int age;
 string address;
 long int mob;
 int sal;
};
int main()
{
Employee e;
e.name="Samaira";
e.age=7;
e.address="688,indore";
e.mob=8109961000;
e.sal=60000;

cout<<"Employee name"<<e.name<<endl;
cout<<"Employee age"<<e.age<<endl;
cout<<"Employee address"<<e.address<<endl;
cout<<"Employee name"<<e.name<<endl;
cout<<"Employee contact no."<<e.mob<<endl;
cout<<"Employee salary"<<e.sal<<endl;
}