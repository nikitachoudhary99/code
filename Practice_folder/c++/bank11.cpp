//bank
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
};
 
 void Bank :: Deposite(int d)
 {
    Ammount=Ammount+d;
    cout<<"your ammount is successfully deposite"<<Ammount<<endl;
    cout<<"your available balance is"<<Ammount<<endl;

 }
 void Bank:: widraw(int w)
 {
    Ammount=Ammount- w;
    cout<<"your ammount is sucessfully widraw"<< Ammount<<endl;
    cout<<"your available balance is"<<Ammount<<endl;

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
    b1.setAccountno(125496263);
    b1.setUsername("nikita");
    b1.setAmmount(500);
    b1.getData();
    b1.Deposite(500);
    b1.widraw(200);
}