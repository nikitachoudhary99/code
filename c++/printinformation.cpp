//hw
#include<iostream>
using namespace std;
class student
{
    string Name;
    int Age;
    long int Phone;
    string Address;
    string Gmail;
    float Graduactionper;
    void setName(string n);
    void setAge(int age);
    void setPhone(long int ph);
    void setAddress(string add);
    void setGmail(string mail);
    void setGraduationper(float per);
    void getData();

};
void student:: setName(string n);
{
    Name=n;
}
void student :: setAge(int a);
{
    Age=a;
}
void student :: setphone(long int ph);
{
    Phone=ph;
}
void student:: setAddress(string add);
{
    Address=add;
}
void student :: setGmail(string mail);
{
     Gmail=mail;  
}
void student :: setGraduationper(float per);
{
    Graduationper=per;
}
void student :: getData()
{
   cout<<"Name"<<Name<<endl;
   cout<<"Age"<<Age<<endl;
   cout<<"phone"<<Phone<<endl;
   cout<<"Address"<<Address<<endl;
   cout<<"gmail"<<Gmail<<endl;
   cout<<"Graduationper"<< Graduationper<<endl;

}
int main()
student arr[06];
string n;
int a;
long int ph;
string add;
string mail;
float per;
int i;
for(i=0;i<6;i++)
{
    arr[i].setName(n);
    arr[i].setAge(a);
    arr[i].setphone(ph);
    arr[i].setaddress(add);
    arr[i].setGmail(mail);
    arr[i].setGraduationper(per);
    
}



