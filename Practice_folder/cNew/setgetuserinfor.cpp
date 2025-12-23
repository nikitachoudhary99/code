
//
#include<iostream>
using namespace std;
class animal
{
    string name;
    int age;
    public:
    void setName(string n);
    void setAge(int a);
    void getdata();

};
void animal ::setName(string n)
{ 
    name=n;
}
void animal :: setAge(int a)
{
    age=a;
}
void animal :: getdata()
{
    int i;

cout<<"enter the name"<<endl;
cin>>name;
cout<<"enter the age"<<endl;
cin>>age;
}
int main()
{
    
    animal arr[3];
    string n;
    int a;
    int i;
    for(i=0;i<3;i++)
    {
        arr[i].setName(n);
        arr[i].setAge(a);
    }
    {
        arr[i].getdata();
    }
}