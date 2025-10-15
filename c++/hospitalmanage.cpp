//hospital managemant
#include<iostream>
using namespace std;

class Hospital;
class patient;
class Doctor
{
    string doctorname;
    string specialist;
    int fees;
    bool present;
    public:
    void doctorDetails(string dn,string s,int f);
    
};
void Doctor ::  doctorDetails(string dn,string s,int f)
{
    doctorname = dn;
    specialist = s;
    fees = f;
    present=true;
}
class patient
{
    string name;
    int age;
    string diease;
    bool isactive;
    string doctorname;
    public:
    void patientregistration(string n,int a,string d,string dn);
};
void patient :: patientregistration(string n,int a,string d,string dn)
{
    name=n;
    age=a;
    diease=d;
    isactive=true;
    doctorname= dn ;
    
}
class Hospital
{ 
    int i,j;
    string hospitalname="pooja" ;
    Doctor arr[5];
    string dn;
    string s;
    int f;
    bool present;{
    
    for(int i=0;i<=5;i++)
      {
        cout<<"enter doctor name "<<dn<<endl;
        cin>>dn;
        cout<<"enter specialisation of your doctor"<<s<<endl;
        cin>>s;
        cout<<"enter your doctor fees"<<f<<endl;
        cin>>f;
        
      }
    }
    patient arr[5];
   string n;
   int a;
   string d;
   bool isactive;
   string dn;
   {
   for(int j=0;j<=5;j++)
   {
    cout<<"enter patient name"<<n<<endl;
    cin>>n;
    cout<<"enter age"<<a<<endl;
    cin>>a;
    cout<<"enter diease "<<d<<endl;
    cin>>d;
    cout<<"enter doctor"<<dn<<endl;
    cin>>dn;
   }  
   }

};

int main()
{
  Hospital 
}