//constructor and its type
#include<iostream>
using namespace std;
class Student
{
    int roll;
    string name;
    public:
    Student()//default constructor
    {
      cout<<"default constructor is invoked"<<endl;
      roll = 101;
      name = "Trapti";
      cout<<"Rollno = "<<roll<<endl;
      cout<<"Name = "<<name<<endl;
    }
    Student(int r,string n)
    {
        cout<<"parameterized constructor is invoked\n"<<endl;
        roll = r;
        name = n;
        cout<<"RollNo = "<<roll<<endl;
        cout<<"Name = "<<name<<endl;
    }
    Student(Student &s2)
    {
      cout<<"copy constructor is invoked"<<endl;
      roll = s2.roll;
      name = s2.name;
      cout<<"Roll no = "<<roll<<endl;
      cout<<"Name = "<<name<<endl;
    }
};
int main()
{
    Student s1;
    int r;
    string n;
    cout<<"enter rollno"<<endl;
    cin>>r;
    cout<<"enter name"<<endl;
    cin>>n;

    Student s2(r,n);
    Student s3(s2);
}