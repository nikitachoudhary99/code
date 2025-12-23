//student practice by lab ass
#include<iostream>
using namespace std;
class student
{
    string name;
    int roll;
    float phy;
    float che;
    float math;
    public:
    void getdata();
    void show();
    void total();
    void percent();

};
void student::getdata()
{
    cout<<"enter student name";
    cin>>name;
    cout<<"enter roll number";
    cin>>roll;
    cout<<"Physics marks";
    cin>>phy;
    cout<<"Chemistry marks";
    cin>>che;
    cout<<"Math Marks";
    cin>>math;
}
void student::show()
{
    cout<<"name"<<name<<endl;
    cout<<"Roll no."<<roll<<endl;
    cout<<"physics marks"<<phy<<endl;
    cout<<"Chemestry marks"<<che<<endl;
    cout<<"Math Marks "<<math<<endl;

}
void student::total()
{
   float t=che+math+phy;
    cout<<"total marks=" <<t<<endl;
}
void student::percent()
{
     float t=che+math+phy;
     float p=(t*100)/300;
     cout<<"percent="<<p<<endl;

}
int main()
{
    student s1;
    s1.getdata();
    s1.show();
    s1.percent();
    s1.total();
}