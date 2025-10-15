//student class
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
    void showdata();
     void total();
     void percent();
};
void student::getdata()
{
    cout<<"enter name of your student:";
    cin>>name;
    cout<<"enter roll number";
    cin>>roll;
    cout<<"enter physics number";
    cin>>phy;
    cout<<"enter chmistry number";
    cin>>che;
    cout<<"enter maths number";
    cin>>math;
}
void student::showdata()
{
    cout<<"Name = :"<<name<<endl;
    cout<<"Rollno = "<<roll<<endl;
    cout<<"Physics Marks"<<phy<<endl;
    cout<<"Chmistry Marsk ="<<che<<endl;
    cout<<"Math Marks = "<<math<<endl;
}
void student::total()
{
    float t=phy+che+math;
    cout<<"total marks ="<<t<<endl;
}
void student::percent()
{
    float total=phy+che+math;
    float p = (total*100)/300;
    cout<<"percent of total marks="<<p<<endl;
}
int main()
{
    student s1;
    s1.getdata();
    s1.showdata();
    s1.total();
    s1.percent();
    
}