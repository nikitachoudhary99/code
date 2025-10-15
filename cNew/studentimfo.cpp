//class ya function -ek responsblity
//identifier-->>
#include<iostream>
using namespace std;
class student
{
    //access modifier
    string name;
    int age;
    public:
    void setdata(string n,int a)
    {
        name=n;
        age=a;
    } 
    void getdata()
    {
        cout<<name<<endl;
        cout<<age<<endl;
    }
};

int main()
{
    student s1;
    string n;
    int a;

    cout<<"enter the name of student"<<endl;
    cin>>n;
    cout<<"enter the age of student"<<endl;
    cin>>a;


    s1.setdata(n,a);
    s1.getdata();
}