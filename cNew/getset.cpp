//getter setter 
/*
getter function -> getter function help you to get data mamber to access the data ,
get function are created with get prefix;
setter function-> setter function help you to  set data member ,
set function are created with set prefix;
*/
#include<iostream>
using namespace std;
class Employee
{

 string name;
 int age;
 public:
 void setName(string n)
 {
    name=n;
 }
 void setage(int a)
 {
    age=a;
 }
 void getdata()
 {
    cout<<"Employee name:"<<name<<endl;
    cout<<"Employee age:"<<age<<endl;
 }

};
int main()
{
    Employee e;
    e.setName("samaira");
    e.setage(10);
    e.getdata();

}