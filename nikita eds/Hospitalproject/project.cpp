#include<iostream>
using namespace std;
class Doctor
{
    public:
    string name;
    string spl;
    bool present;
    int fees;
};
class Patient
{
    public:
    string name;
    int age;
    string disease;
    bool active;
    string doctorname;
    int pay;
};
class Hospital
{
    Doctor dinfo[5];
    Patient preg[10];
    int count;
    public:
    Hospital()
    {
        count = 0;
        for(int i=0;i<5;i++)
        {
            cout<<"Enter\t"<< i+1<<"Doctor Name"<<endl;
            cin>>dinfo[i].name;
            cout<<"Enter\t"<<i+1<<"Doctor specailist"<<endl;
            cin>>dinfo[i].spl;
            cout<<"Enter\t"<<i+1<<"Doctor fees"<<endl;
            cin>>dinfo[i].fees;
            dinfo[i].present = true;
        }
    }
    void avldoc();
    void registration(string n,int a,string d);
    void patientdetail();
    void checkup(string n);
};
void Hospital :: checkup(string n)
{
    for(int i=0;i<count;i++)
    {
        if(preg[i].name == n)
        {
            preg[i].active = false;

            for(int j=0;j<5;j++)
            {
                if(dinfo[j].name == preg[i].doctorname)
                {
                    dinfo[j].present = true;
                    cout<<"thank you"<<endl;
                    return;
                }
            }
        }
    }
    cout<<"no such patient available"<<endl;

 }
 void Hospital :: patientdetail()
{
    if(count==0)
    {
        cout<<"patient is not active for checkup"<<endl;
        return;
    }
    cout<<endl;
    cout<<endl;
    for(int i=0;i<count;i++)
   {
     cout<<"patient name \t"<<preg[i].name<<endl;
     cout<<"patient age \t"<<preg[i].age<<endl;
     cout<<"patient disease\t"<<preg[i].disease<<endl;
     cout<<"attending doctor name\t"<<preg[i].doctorname<<endl;
     cout<<"attending doctor fees\t"<<preg[i].pay<<endl;
   }
}
void Hospital :: avldoc()
{
    cout<<endl;
    cout<<endl;
    cout<<"list of available doctor"<<endl;
    cout<<endl;
    cout<<"name \t speciality \t fees"<<endl;
    cout<<endl;
    for(int i=0;i<5;i++)
    {
     if(dinfo[i].present == true)
     {
        cout<<dinfo[i].name<<"\t"<<dinfo[i].spl<<"\t"<<dinfo[i].fees<<endl;
     }
    }
}
void Hospital::registration(string n,int a,string d)
{
    for(int i=0;i<5;i++)
    {
     if(dinfo[i].present == true && dinfo[i].spl == d)
     {
        preg[count].name = n;
        preg[count].age = a;
        preg[count].disease = d;
        preg[count].active = true;
        preg[count].doctorname = dinfo[i].name;
        preg[count].pay = dinfo[i].fees;
        dinfo[i].present=false;
        count++;
        cout<<"Patient Registration succesful please visit"<<endl;
        return;
     }
    }
    cout<<"Doctor unavailable sorry for the inconviniance"<<endl;
}
int main()
{
    Hospital bombay;
    int n;
    while(true)
    {
        cout<<"Enter 1 to see available doctor"<<endl;
        cout<<"Enter 2 for checkup"<<endl;
        cout<<"Enter 3 for patient detail"<<endl;
        cout<<"Enter 4 when checkup is done"<<endl;
        cout<<"Enter any key for exit"<<endl;
        cin>>n;
        
        if(n==1)
        {
            bombay.avldoc();

        }
        else if(n==2)
        {
            string n;
            int a;
            string d;
            cout<<"Enter Patient Name"<<endl;
            cin>>n;
            cout<<"Enter Patient age"<<endl;
            cin>>a;
            cout<<"Enter patient Disease"<<endl;
            cin>>d;
        }
        else if(n==3)
        {
            bombay.patientdetail();
        }
        else if(n==4)
        {
            string n;
            cout<<"Enter patient name"<<endl;
            cin>>n;
            bombay.checkup(n);
        }
        else
        {
          break;
        }
    }
}
 
