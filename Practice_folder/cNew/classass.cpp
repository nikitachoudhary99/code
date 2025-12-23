//get set total show per
#include<iostream>
using namespace std;
class Student
{
    string name;
    string roll;
    float phy;
    float che;
    float math;

    public:
    void getname(string n)
    {
        name=n;
    }
    void getroll(string r)
    {
        roll=r;
    }
    void getphy(int m)
    {
        phy=m;
    }
    void getche(int m1)
    {
        che=m1;
    }
    void getmath(int m2)
    {
        math=m2;
    }
    void show()
    {
        cout<<"student name:"<<name<<endl;
        cout<<"student roll:"<<roll<<endl;
        cout<<"student phy:"<<phy<<endl;
        cout<<"student che:"<<che<<endl;
        cout<<"student math:"<<math<<endl; 
    }
    void total()
    {
        float t=phy+che+math;
        cout<<"toatl marks :"<<t<<endl;
    }
    void per()
    {   float t=phy+che+math;
        float p=(t*100)/300;
        cout<<"percent :"<<p<<endl;
    }
};
int main()
{
    Student s;
    s.getname("samaira");
    s.getroll("abc123yz");
    s.getphy(80.3);
    s.getche(85.3);    
    s.getmath(89.35);
    s.show();
    s.per();
    s.total();
     
}
