#include<iostream>
using namespace std;
int main()
{
    int days,year;
    cout<<"enter the days"<<endl;
    cin>>days;
 if (days>365)
 {
    year=1;
    year++;
    // year=days/365;
    // days=days-(365*year);

    cout<<"number of years:"<<year<<"and number of days"<<days<<endl;
 }
   
}