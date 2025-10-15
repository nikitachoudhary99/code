//print name age (structure)
#include<iostream>
using namespace std;
struct student
{
    string name;
    int age;
    string place;
};
int main()
{
    struct student s1;
    s1.name="samaira patel";
    s1.age=6;
    s1.place="indore";
   

   cout<<s1.name<<endl;
   cout<<s1.age<<endl;
   cout<<s1.place<<endl;
}
