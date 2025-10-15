//simple intrest bank
//run  time bank balance
#include<iostream>
using namespace std;

class Bank
{
    
    long int Accountno;
    string Username;
    int Ammount;
    
   
   public:
    void setAccountno(long int Acc);
    void setUsername(string User);
    void setAmmount(int Amt);
    void getData();
    void Deposite(int d );
    void widraw(int w);
    void Simpleintrest(int r, int t);
};
 
 void Bank :: Deposite(int d)
 {
    Ammount=Ammount+d;
    cout<<"your ammount is successfully deposite"<<Ammount<<endl;
    cout<<"your available balance is"<<Ammount<<endl;

 }
 void Bank:: widraw(int w)
 {
    if(w<=Ammount)
    {
    Ammount=Ammount- w;
    cout<<"your ammount is sucessfully widraw"<< Ammount<<endl;
    cout<<"your available balance is"<<Ammount<<endl;
    }
    else
    {
        cout<<"your ammount is insufficiant "<<endl;
        cout<<"your available balance is"<<Ammount<<endl;

    }

 }
 void Bank:: Simpleintrest(int r, int t)
 {
    int Simpleintrest=(Ammount*r*t)/100;
    cout<<"si is="<<Simpleintrest<<endl;
 }



void Bank :: setAccountno(long int Acc)
{ 
    Accountno = Acc;
}
void Bank :: setUsername(string User)
{
    Username = User;

}
void Bank :: setAmmount(int Amt)
{
     Ammount = Amt; 
    
}

void Bank :: getData()
{
    cout<<"Account no. "<<Accountno<<endl;
     cout<<"Username "<< Username <<endl;
     cout<<" Ammount "<<  Ammount <<endl;
    
}
int main()
{
    Bank b1;
    int d;
    int w;
    int r;
    int t;

     long int Accountno;
    string Username;
    int Ammount;
    cout<<"enter your acc no."<<endl;
    cin>>Accountno;
    cout<<"enter your name"<<endl;
    cin>>Username;
    cout<<"enter your ammount";
    cin>>Ammount;
    cout<<"enter your widraw money"<<endl;
    cin>>w;
    cout<<"enter your deposite "<<endl;
    cin>>d;
    cout<<"enter your rate"<<endl;
    cin>>r;
    cout<<"enter your time"<<endl;
    cin>>t;

    
    b1.setAccountno(Accountno );
    b1.setUsername(Username);
    b1.setAmmount(Ammount);
    b1.getData();
    b1.Deposite(d);
    b1.widraw(w);
    b1.Simpleintrest(r,t);
    

}