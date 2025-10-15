//static varriable in class 
#include<iostream>
using namespace std;
class student
{
    public:
    string name;
    int roll;
    static int count;
    student (string n, int r){
        name=n;
        roll=r;
        //datatype classname:: varriable name=value;
        int student::count=10;
    }
}
int main()
{
    student s1("nikita",25);
    student s2("aakanksha",26);
    student s3("trapti",27);
    student s4("monika",21);
    s1.roll=29;
    cout<<"value of count using s1 obj"<<s1.count<<endl;
    cout<<"value of count using s2 obj"<<s2.count<<endl;
    cout<<"value of count using s3 obj"<<s3.count<<endl;
    cout<<"value of count using s4 obj"<<s4.count<<endl;

}