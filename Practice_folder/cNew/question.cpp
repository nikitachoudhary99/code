//what is the value of gold ,bronze in the following sentence...
//  enum medal(gold,silver=5,bronze);
#include<iostream>
using namespace std;
class atheletics
{ 
    medal medal;
    event event;

    public:
    enum medal{gold,bronze,silver};
    enum event{hundred_meter_race};
    Atheletic();
    Atheletic (medal medal, event event);
    medal getmedal();
    

};
atheletics::Atheletic()
{

};
int main()
{
    
}