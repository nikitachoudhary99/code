//DTDC
#include<iostream>
using namespace std;
class courier
{
    string name;
    int weight;
    string address;
    int bill;
    char type;
    public:
    void accept();
    void calculate();
    void print();
};
void courier::print()
{
    cout<<"person name\t"<<name<<endl;
    cout<<"person address\t"<<address<<endl;
    cout<<"product weight\t"<<weight<<endl;
    cout<<"type\t"<<type<<endl;
    cout<<"bill\t"<<bill<<endl;
}
void courier ::calculate()
{
    if (weight<=5)
    {
        bill=weight*800;
    }
    else if(weight>5 && weight<=10)
    {
        bill=4000+((weight-5)*700);
    }
    else
    {
      bill=7500+((weight-10)*500);
    }
    if(type=='i'|| type=='I')
    {
        bill=bill+1500;
    }
}

void courier::accept()
{
    cout<<"enter your name"<<endl;
    cin>>name;
    cout<<"enter your address"<<endl;
    cin>>address;
    cout<<"enter weight"<<endl;
    cin>>weight;
    cout<<"type of international"<<endl;
    cin>>type;

}
int main()
{
    courier DTDC;
    DTDC.accept();
    DTDC.calculate();
    DTDC.print();
}