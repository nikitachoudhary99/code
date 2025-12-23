//student teacher
#include<iostream>
using namespace std;
class student
{  
  public:
  string name;
  string cource;
  int enroll;
  int totalmark;
};

class teacher
{
    public:
  string name;
  string speciality;
  bool present;
};

class school
{  
  student sdetail[10];
  teacher tdetail[2];
  int count;
  public:

  school()
 { count=0;
   for(int i=0;i<2;i++)
    {
    cout<<"enter "<<i+1<<" teacher name"<<endl;
    cin>>tdetail[i].name;
    cout<<"enter "<<i+1<<" teacher speciality"<<endl;
    cin>>tdetail[i].speciality;
    tdetail[i].present=true;
    }
 }
  void avalteacher();
  void regis(string n,string c,int rol,int t);
};

void school::regis(string n,string c,int rol,int t)
{
    for(int i=0;i<10;i++)
    {
     if(tdetail[i].present==true && tdetail[i].speciality==c)
     
    {
     sdetail[count].name=n;
     sdetail[count].cource=c;
     sdetail[count].enroll=rol;
     sdetail[count].totalmark=t;
     sdetail[count].name=tdetail[i].name;
     count++;
     cout<<"registration successfull congratulation"<<endl;
     cout<<"welcome to our school"<<endl;
     return;
    }

    }
}
    void school::avalteacher()
    {
        cout<<"available teachers"<<endl;
        cout<<endl;
        cout<<"name  speciality of teacher"<<endl;
        cout<<endl;
        for(int i=0;i<2;i++)
        {
          if(tdetail[i].present==true)
          {
            cout<<tdetail[i].name<<"\t"<<tdetail[i].speciality<<endl;
          }
        }
    }


int main()
{
    school s1;
    int n;
    cout<<"enter 1 to see avaible teacher"<<endl;
   // cout<<"enter 2 for course details"<<endl;
    cout<<"enter 3 for student detail"<<endl;
    cin>>n; 
    if(n==1)
    {
     s1.avalteacher();  
    }
    

    else if(n==3)
    {
      string n,c;
      int t,rol;

      
      cout<<"enter student name"<<endl;
      cin>>n;
      cout<<"enter student course"<<endl;
      cin>>c;
      cout<<"enter student enroll"<<endl;
      cin>>rol;
      cout<<"enter student total marks"<<endl;
      cin>>t;
       s1.regis(n,c,rol,t);
    }
    
    }
